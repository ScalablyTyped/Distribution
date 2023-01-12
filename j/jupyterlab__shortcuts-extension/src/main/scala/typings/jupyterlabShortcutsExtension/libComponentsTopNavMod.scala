package typings.jupyterlabShortcutsExtension

import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.ISettings
import typings.jupyterlabShortcutsExtension.libComponentsShortcutUIMod.UISize
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCommands.mod.CommandRegistry.ICommandOptions
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Menu
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTopNavMod {
  
  object CommandIDs {
    
    @JSImport("@jupyterlab/shortcuts-extension/lib/components/TopNav", "CommandIDs.resetAll")
    @js.native
    val resetAll: /* "shortcutui:resetAll" */ String = js.native
    
    @JSImport("@jupyterlab/shortcuts-extension/lib/components/TopNav", "CommandIDs.showSelectors")
    @js.native
    val showSelectors: /* "shortcutui:showSelectors" */ String = js.native
  }
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/TopNav", "TopNav")
  @js.native
  open class TopNav protected ()
    extends Component[ITopNavProps, js.Object, Any] {
    def this(props: ITopNavProps) = this()
    
    def addMenuCommands(): Unit = js.native
    
    def getShortCutTitleItem(title: String): Element = js.native
    
    def getSize(width: Double): UISize = js.native
    
    var menu: Menu = js.native
  }
  
  trait IAdvancedOptionsProps extends StObject {
    
    var menu: Menu
    
    var resetShortcuts: js.Function
    
    var showSelectors: Boolean
    
    var size: UISize
    
    var toggleSelectors: js.Function
    
    var translator: ITranslator
  }
  object IAdvancedOptionsProps {
    
    inline def apply(
      menu: Menu,
      resetShortcuts: js.Function,
      showSelectors: Boolean,
      size: UISize,
      toggleSelectors: js.Function,
      translator: ITranslator
    ): IAdvancedOptionsProps = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], resetShortcuts = resetShortcuts.asInstanceOf[js.Any], showSelectors = showSelectors.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toggleSelectors = toggleSelectors.asInstanceOf[js.Any], translator = translator.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAdvancedOptionsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAdvancedOptionsProps] (val x: Self) extends AnyVal {
      
      inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setResetShortcuts(value: js.Function): Self = StObject.set(x, "resetShortcuts", value.asInstanceOf[js.Any])
      
      inline def setShowSelectors(value: Boolean): Self = StObject.set(x, "showSelectors", value.asInstanceOf[js.Any])
      
      inline def setSize(value: UISize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToggleSelectors(value: js.Function): Self = StObject.set(x, "toggleSelectors", value.asInstanceOf[js.Any])
      
      inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShortcutUIexternal extends StObject {
    
    def addCommand(id: String, options: ICommandOptions): IDisposable
    
    def createMenu(): Menu
    
    def getAllShortCutSettings(): js.Promise[ISettings]
    
    def getLabel(id: String): String
    
    def hasCommand(id: String): Boolean
    
    def removeShortCut(key: String): js.Promise[Unit]
    
    var translator: ITranslator
  }
  object IShortcutUIexternal {
    
    inline def apply(
      addCommand: (String, ICommandOptions) => IDisposable,
      createMenu: () => Menu,
      getAllShortCutSettings: () => js.Promise[ISettings],
      getLabel: String => String,
      hasCommand: String => Boolean,
      removeShortCut: String => js.Promise[Unit],
      translator: ITranslator
    ): IShortcutUIexternal = {
      val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction2(addCommand), createMenu = js.Any.fromFunction0(createMenu), getAllShortCutSettings = js.Any.fromFunction0(getAllShortCutSettings), getLabel = js.Any.fromFunction1(getLabel), hasCommand = js.Any.fromFunction1(hasCommand), removeShortCut = js.Any.fromFunction1(removeShortCut), translator = translator.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutUIexternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShortcutUIexternal] (val x: Self) extends AnyVal {
      
      inline def setAddCommand(value: (String, ICommandOptions) => IDisposable): Self = StObject.set(x, "addCommand", js.Any.fromFunction2(value))
      
      inline def setCreateMenu(value: () => Menu): Self = StObject.set(x, "createMenu", js.Any.fromFunction0(value))
      
      inline def setGetAllShortCutSettings(value: () => js.Promise[ISettings]): Self = StObject.set(x, "getAllShortCutSettings", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: String => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
      
      inline def setHasCommand(value: String => Boolean): Self = StObject.set(x, "hasCommand", js.Any.fromFunction1(value))
      
      inline def setRemoveShortCut(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeShortCut", js.Any.fromFunction1(value))
      
      inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISymbolsProps extends StObject {
    
    var size: UISize
  }
  object ISymbolsProps {
    
    inline def apply(size: UISize): ISymbolsProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISymbolsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISymbolsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: UISize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITopNavProps extends StObject {
    
    var currentSort: String
    
    var external: IShortcutUIexternal
    
    var resetShortcuts: js.Function
    
    var showSelectors: Boolean
    
    var toggleSelectors: js.Function
    
    var updateSearchQuery: js.Function
    
    var updateSort: js.Function
    
    var width: Double
  }
  object ITopNavProps {
    
    inline def apply(
      currentSort: String,
      external: IShortcutUIexternal,
      resetShortcuts: js.Function,
      showSelectors: Boolean,
      toggleSelectors: js.Function,
      updateSearchQuery: js.Function,
      updateSort: js.Function,
      width: Double
    ): ITopNavProps = {
      val __obj = js.Dynamic.literal(currentSort = currentSort.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], resetShortcuts = resetShortcuts.asInstanceOf[js.Any], showSelectors = showSelectors.asInstanceOf[js.Any], toggleSelectors = toggleSelectors.asInstanceOf[js.Any], updateSearchQuery = updateSearchQuery.asInstanceOf[js.Any], updateSort = updateSort.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopNavProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITopNavProps] (val x: Self) extends AnyVal {
      
      inline def setCurrentSort(value: String): Self = StObject.set(x, "currentSort", value.asInstanceOf[js.Any])
      
      inline def setExternal(value: IShortcutUIexternal): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setResetShortcuts(value: js.Function): Self = StObject.set(x, "resetShortcuts", value.asInstanceOf[js.Any])
      
      inline def setShowSelectors(value: Boolean): Self = StObject.set(x, "showSelectors", value.asInstanceOf[js.Any])
      
      inline def setToggleSelectors(value: js.Function): Self = StObject.set(x, "toggleSelectors", value.asInstanceOf[js.Any])
      
      inline def setUpdateSearchQuery(value: js.Function): Self = StObject.set(x, "updateSearchQuery", value.asInstanceOf[js.Any])
      
      inline def setUpdateSort(value: js.Function): Self = StObject.set(x, "updateSort", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
