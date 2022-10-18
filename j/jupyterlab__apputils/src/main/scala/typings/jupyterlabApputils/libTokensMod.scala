package typings.jupyterlabApputils

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.libTokensMod.ISanitizer.IOptions
import typings.jupyterlabApputils.libTokensMod.IThemeManager.ITheme
import typings.jupyterlabApputils.libTokensMod.ToolbarRegistry.IWidget
import typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @js.native
  trait ISanitizer extends StObject {
    
    /**
      * Sanitize an HTML string.
      *
      * @param dirty - The dirty text.
      *
      * @param options - The optional sanitization options.
      *
      * @returns The sanitized string.
      */
    def sanitize(dirty: String): String = js.native
    def sanitize(dirty: String, options: IOptions): String = js.native
  }
  object ISanitizer extends Shortcut {
    
    @JSImport("@jupyterlab/apputils/lib/tokens", "ISanitizer")
    @js.native
    val ^ : Token[ISanitizer] = js.native
    
    /**
      * The options used to sanitize.
      */
    trait IOptions extends StObject {
      
      /**
        * The allowed attributes for a given tag.
        */
      var allowedAttributes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
      
      /**
        * The allowed style values for a given tag.
        */
      var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[js.RegExp]]]] = js.undefined
      
      /**
        * The allowed tags.
        */
      var allowedTags: js.UndefOr[js.Array[String]] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAllowedAttributes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "allowedAttributes", value.asInstanceOf[js.Any])
        
        inline def setAllowedAttributesUndefined: Self = StObject.set(x, "allowedAttributes", js.undefined)
        
        inline def setAllowedStyles(value: StringDictionary[StringDictionary[js.Array[js.RegExp]]]): Self = StObject.set(x, "allowedStyles", value.asInstanceOf[js.Any])
        
        inline def setAllowedStylesUndefined: Self = StObject.set(x, "allowedStyles", js.undefined)
        
        inline def setAllowedTags(value: js.Array[String]): Self = StObject.set(x, "allowedTags", value.asInstanceOf[js.Any])
        
        inline def setAllowedTagsUndefined: Self = StObject.set(x, "allowedTags", js.undefined)
        
        inline def setAllowedTagsVarargs(value: String*): Self = StObject.set(x, "allowedTags", js.Array(value*))
      }
    }
    
    type _To = Token[ISanitizer]
    
    /* This means you don't have to write `^`, but can instead just say `ISanitizer.foo` */
    override def _to: Token[ISanitizer] = ^
  }
  
  @JSImport("@jupyterlab/apputils/lib/tokens", "ISessionContextDialogs")
  @js.native
  val ISessionContextDialogs: Token[IDialogs] = js.native
  type ISessionContextDialogs = IDialogs
  
  trait IThemeManager extends StObject {
    
    /**
      * Get display name for theme.
      */
    def getDisplayName(name: String): String
    
    /**
      * Test whether a given theme is light.
      */
    def isLight(name: String): Boolean
    
    /**
      * Load a theme CSS file by path.
      *
      * @param path - The path of the file to load.
      */
    def loadCSS(path: String): js.Promise[Unit]
    
    /**
      * Register a theme with the theme manager.
      *
      * @param theme - The theme to register.
      *
      * @returns A disposable that can be used to unregister the theme.
      */
    def register(theme: ITheme): IDisposable
    
    /**
      * Set the current theme.
      */
    def setTheme(name: String): js.Promise[Unit]
    
    /**
      * Get the name of the current theme.
      */
    val theme: String | Null
    
    /**
      * A signal fired when the application theme changes.
      */
    val themeChanged: ISignal[this.type, IChangedArgs[String, String | Null, String]]
    
    /**
      * Test whether a given theme styles scrollbars,
      * and if the user has scrollbar styling enabled.
      */
    def themeScrollbars(name: String): Boolean
    
    /**
      * The names of the registered themes.
      */
    val themes: js.Array[String]
  }
  object IThemeManager extends Shortcut {
    
    inline def apply(
      getDisplayName: String => String,
      isLight: String => Boolean,
      loadCSS: String => js.Promise[Unit],
      register: ITheme => IDisposable,
      setTheme: String => js.Promise[Unit],
      themeChanged: ISignal[IThemeManager, IChangedArgs[String, String | Null, String]],
      themeScrollbars: String => Boolean,
      themes: js.Array[String]
    ): IThemeManager = {
      val __obj = js.Dynamic.literal(getDisplayName = js.Any.fromFunction1(getDisplayName), isLight = js.Any.fromFunction1(isLight), loadCSS = js.Any.fromFunction1(loadCSS), register = js.Any.fromFunction1(register), setTheme = js.Any.fromFunction1(setTheme), themeChanged = themeChanged.asInstanceOf[js.Any], themeScrollbars = js.Any.fromFunction1(themeScrollbars), themes = themes.asInstanceOf[js.Any], theme = null)
      __obj.asInstanceOf[IThemeManager]
    }
    
    @JSImport("@jupyterlab/apputils/lib/tokens", "IThemeManager")
    @js.native
    val ^ : Token[IThemeManager] = js.native
    
    /**
      * An interface for a theme.
      */
    trait ITheme extends StObject {
      
      /**
        * The display name of the theme.
        */
      var displayName: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the theme is light or dark. Downstream authors
        * of extensions can use this information to customize their
        * UI depending upon the current theme.
        */
      var isLight: Boolean
      
      /**
        * Load the theme.
        *
        * @returns A promise that resolves when the theme has loaded.
        */
      def load(): js.Promise[Unit]
      
      /**
        * The unique identifier name of the theme.
        */
      var name: String
      
      /**
        * Whether the theme includes styling for the scrollbar.
        * If set to false, this theme will leave the native scrollbar untouched.
        */
      var themeScrollbars: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Unload the theme.
        *
        * @returns A promise that resolves when the theme has unloaded.
        */
      def unload(): js.Promise[Unit]
    }
    object ITheme {
      
      inline def apply(isLight: Boolean, load: () => js.Promise[Unit], name: String, unload: () => js.Promise[Unit]): ITheme = {
        val __obj = js.Dynamic.literal(isLight = isLight.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), name = name.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload))
        __obj.asInstanceOf[ITheme]
      }
      
      extension [Self <: ITheme](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setIsLight(value: Boolean): Self = StObject.set(x, "isLight", value.asInstanceOf[js.Any])
        
        inline def setLoad(value: () => js.Promise[Unit]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setThemeScrollbars(value: Boolean): Self = StObject.set(x, "themeScrollbars", value.asInstanceOf[js.Any])
        
        inline def setThemeScrollbarsUndefined: Self = StObject.set(x, "themeScrollbars", js.undefined)
        
        inline def setUnload(value: () => js.Promise[Unit]): Self = StObject.set(x, "unload", js.Any.fromFunction0(value))
      }
    }
    
    extension [Self <: IThemeManager](x: Self) {
      
      inline def setGetDisplayName(value: String => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction1(value))
      
      inline def setIsLight(value: String => Boolean): Self = StObject.set(x, "isLight", js.Any.fromFunction1(value))
      
      inline def setLoadCSS(value: String => js.Promise[Unit]): Self = StObject.set(x, "loadCSS", js.Any.fromFunction1(value))
      
      inline def setRegister(value: ITheme => IDisposable): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      inline def setSetTheme(value: String => js.Promise[Unit]): Self = StObject.set(x, "setTheme", js.Any.fromFunction1(value))
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeChanged(value: ISignal[IThemeManager, IChangedArgs[String, String | Null, String]]): Self = StObject.set(x, "themeChanged", value.asInstanceOf[js.Any])
      
      inline def setThemeNull: Self = StObject.set(x, "theme", null)
      
      inline def setThemeScrollbars(value: String => Boolean): Self = StObject.set(x, "themeScrollbars", js.Any.fromFunction1(value))
      
      inline def setThemes(value: js.Array[String]): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      inline def setThemesVarargs(value: String*): Self = StObject.set(x, "themes", js.Array(value*))
    }
    
    type _To = Token[IThemeManager]
    
    /* This means you don't have to write `^`, but can instead just say `IThemeManager.foo` */
    override def _to: Token[IThemeManager] = ^
  }
  
  trait IToolbarWidgetRegistry extends StObject {
    
    /**
      * Create a toolbar item widget
      *
      * @param widgetFactory The widget factory name that creates the toolbar
      * @param widget The newly widget containing the toolbar
      * @param toolbarItem The toolbar item definition
      * @returns The widget to be inserted in the toolbar.
      */
    def createWidget(widgetFactory: String, widget: Widget, toolbarItem: IWidget): Widget
    
    /**
      * Default toolbar item factory
      */
    def defaultFactory(widgetFactory: String, widget: Widget, toolbarItem: IWidget): Widget
    
    /**
      * Register a new toolbar item factory
      *
      * @param widgetFactory The widget factory name that creates the toolbar
      * @param toolbarItemName The unique toolbar item
      * @param factory The factory function that receives the widget containing the toolbar and returns the toolbar widget.
      * @returns The previously defined factory
      */
    def registerFactory[T /* <: Widget */](widgetFactory: String, toolbarItemName: String, factory: js.Function1[/* main */ T, Widget]): js.UndefOr[js.Function1[/* main */ T, Widget]]
  }
  object IToolbarWidgetRegistry {
    
    @JSImport("@jupyterlab/apputils/lib/tokens", "IToolbarWidgetRegistry")
    @js.native
    val ^ : Token[IToolbarWidgetRegistry] = js.native
    
    extension [Self <: IToolbarWidgetRegistry](x: Self) {
      
      inline def setCreateWidget(value: (String, Widget, IWidget) => Widget): Self = StObject.set(x, "createWidget", js.Any.fromFunction3(value))
      
      inline def setDefaultFactory(value: (String, Widget, IWidget) => Widget): Self = StObject.set(x, "defaultFactory", js.Any.fromFunction3(value))
      
      inline def setRegisterFactory(value: (String, String, js.Function1[Any, Widget]) => js.UndefOr[js.Function1[Any, Widget]]): Self = StObject.set(x, "registerFactory", js.Any.fromFunction3(value))
    }
  }
  
  object ToolbarRegistry {
    
    /**
      * Options to set up the toolbar widget registry
      */
    trait IOptions extends StObject {
      
      /**
        * Default toolbar widget factory
        *
        * The factory is receiving 3 arguments:
        * @param widgetFactory The widget factory name that creates the toolbar
        * @param widget The newly widget containing the toolbar
        * @param toolbarItem The toolbar item definition
        * @returns The widget to be inserted in the toolbar.
        */
      def defaultFactory(widgetFactory: String, widget: Widget, toolbarItem: IWidget): Widget
    }
    object IOptions {
      
      inline def apply(defaultFactory: (String, Widget, IWidget) => Widget): typings.jupyterlabApputils.libTokensMod.ToolbarRegistry.IOptions = {
        val __obj = js.Dynamic.literal(defaultFactory = js.Any.fromFunction3(defaultFactory))
        __obj.asInstanceOf[typings.jupyterlabApputils.libTokensMod.ToolbarRegistry.IOptions]
      }
      
      extension [Self <: typings.jupyterlabApputils.libTokensMod.ToolbarRegistry.IOptions](x: Self) {
        
        inline def setDefaultFactory(value: (String, Widget, IWidget) => Widget): Self = StObject.set(x, "defaultFactory", js.Any.fromFunction3(value))
      }
    }
    
    /**
      * Interface of item to be inserted in a toolbar
      */
    trait IToolbarItem extends StObject {
      
      /**
        * Unique item name
        */
      var name: String
      
      /**
        * Toolbar widget
        */
      var widget: Widget
    }
    object IToolbarItem {
      
      inline def apply(name: String, widget: Widget): IToolbarItem = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
        __obj.asInstanceOf[IToolbarItem]
      }
      
      extension [Self <: IToolbarItem](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setWidget(value: Widget): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Interface describing a toolbar item widget
      */
    type IWidget = typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IToolbarItem
  }
}
