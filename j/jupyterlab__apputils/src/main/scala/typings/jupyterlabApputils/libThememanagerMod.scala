package typings.jupyterlabApputils

import typings.jupyterlabApputils.libSplashMod.ISplashScreen
import typings.jupyterlabApputils.libThememanagerMod.ThemeManager.IOptions
import typings.jupyterlabApputils.libTokensMod.IThemeManager
import typings.jupyterlabApputils.libTokensMod.IThemeManager.ITheme
import typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libThememanagerMod {
  
  @JSImport("@jupyterlab/apputils/lib/thememanager", "ThemeManager")
  @js.native
  open class ThemeManager protected ()
    extends StObject
       with IThemeManager {
    /**
      * Construct a new theme manager.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _base: Any = js.native
    
    /* private */ var _current: Any = js.native
    
    /* private */ var _host: Any = js.native
    
    /**
      * Change a font size by a positive or negative increment.
      */
    /* private */ var _incrFontSize: Any = js.native
    
    /**
      * Initialize the key -> property dict for the overrides
      */
    /* private */ var _initOverrideProps: Any = js.native
    
    /* private */ var _links: Any = js.native
    
    /**
      * Handle the current settings.
      */
    /* private */ var _loadSettings: Any = js.native
    
    /**
      * Load the theme.
      *
      * #### Notes
      * This method assumes that the `theme` exists.
      */
    /* private */ var _loadTheme: Any = js.native
    
    /**
      * Handle a theme error.
      */
    /* private */ var _onError: Any = js.native
    
    /* private */ var _outstanding: Any = js.native
    
    /* private */ var _overrideProps: Any = js.native
    
    /* private */ var _overrides: Any = js.native
    
    /* private */ var _pending: Any = js.native
    
    /* private */ var _requests: Any = js.native
    
    /* private */ var _settings: Any = js.native
    
    /* private */ var _splash: Any = js.native
    
    /* private */ var _themeChanged: Any = js.native
    
    /* private */ var _themes: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /**
      * Decrease a font size w.r.t. its current setting or its value in the
      * current theme.
      *
      * @param key - A Jupyterlab font size CSS variable, without the leading '--jp-'.
      */
    def decrFontSize(key: String): js.Promise[Unit] = js.native
    
    /**
      * Get the value of a CSS variable from its key.
      *
      * @param key - A Jupyterlab CSS variable, without the leading '--jp-'.
      *
      * @return value - The current value of the Jupyterlab CSS variable
      */
    def getCSS(key: String): String = js.native
    
    /**
      * Get display name for theme.
      */
    /* CompleteClass */
    override def getDisplayName(name: String): String = js.native
    
    /**
      * Increase a font size w.r.t. its current setting or its value in the
      * current theme.
      *
      * @param key - A Jupyterlab font size CSS variable, without the leading '--jp-'.
      */
    def incrFontSize(key: String): js.Promise[Unit] = js.native
    
    /**
      * Test whether a given theme is light.
      */
    /* CompleteClass */
    override def isLight(name: String): Boolean = js.native
    
    /**
      * Test if the user has scrollbar styling enabled.
      */
    def isToggledThemeScrollbars(): Boolean = js.native
    
    /**
      * Load a theme CSS file by path.
      *
      * @param path - The path of the file to load.
      */
    /* CompleteClass */
    override def loadCSS(path: String): js.Promise[Unit] = js.native
    
    /**
      * Loads all current CSS overrides from settings. If an override has been
      * removed or is invalid, this function unloads it instead.
      */
    def loadCSSOverrides(): Unit = js.native
    
    /**
      * Register a theme with the theme manager.
      *
      * @param theme - The theme to register.
      *
      * @returns A disposable that can be used to unregister the theme.
      */
    /* CompleteClass */
    override def register(theme: ITheme): IDisposable = js.native
    
    /**
      * Add a CSS override to the settings.
      */
    def setCSSOverride(key: String, value: String): js.Promise[Unit] = js.native
    
    /**
      * Set the current theme.
      */
    /* CompleteClass */
    override def setTheme(name: String): js.Promise[Unit] = js.native
    
    /**
      * Get the name of the current theme.
      */
    /* CompleteClass */
    override val theme: String | Null = js.native
    
    /**
      * A signal fired when the application theme changes.
      */
    /* CompleteClass */
    override val themeChanged: ISignal[this.type, IChangedArgs[String, String | Null, String]] = js.native
    /**
      * A signal fired when the application theme changes.
      */
    @JSName("themeChanged")
    def themeChanged_MThemeManager: ISignal[this.type, IChangedArgs[String, String | Null, String]] = js.native
    
    /**
      * Test whether a given theme styles scrollbars,
      * and if the user has scrollbar styling enabled.
      */
    /* CompleteClass */
    override def themeScrollbars(name: String): Boolean = js.native
    
    /**
      * Get the name of the current theme.
      */
    @JSName("theme")
    def theme_MThemeManager: String | Null = js.native
    
    /**
      * The names of the registered themes.
      */
    /* CompleteClass */
    override val themes: js.Array[String] = js.native
    /**
      * The names of the registered themes.
      */
    @JSName("themes")
    def themes_MThemeManager: js.Array[String] = js.native
    
    /**
      * Toggle the `theme-scrollbars` setting.
      */
    def toggleThemeScrollbars(): js.Promise[Unit] = js.native
    
    /* protected */ var translator: ITranslator = js.native
    
    /**
      * Validate a CSS value w.r.t. a key
      *
      * @param key - A Jupyterlab CSS variable, without the leading '--jp-'.
      *
      * @param val - A candidate CSS value
      */
    def validateCSS(key: String, `val`: String): Boolean = js.native
  }
  object ThemeManager {
    
    /**
      * The options used to create a theme manager.
      */
    trait IOptions extends StObject {
      
      /**
        * The host widget for the theme manager.
        */
      var host: Widget
      
      /**
        * The setting registry key that holds theme setting data.
        */
      var key: String
      
      /**
        * The settings registry.
        */
      var settings: ISettingRegistry
      
      /**
        * The splash screen to show when loading themes.
        */
      var splash: js.UndefOr[ISplashScreen] = js.undefined
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
      
      /**
        * The url for local theme loading.
        */
      var url: String
    }
    object IOptions {
      
      inline def apply(host: Widget, key: String, settings: ISettingRegistry, url: String): IOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setHost(value: Widget): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setSettings(value: ISettingRegistry): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
        
        inline def setSplash(value: ISplashScreen): Self = StObject.set(x, "splash", value.asInstanceOf[js.Any])
        
        inline def setSplashUndefined: Self = StObject.set(x, "splash", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
