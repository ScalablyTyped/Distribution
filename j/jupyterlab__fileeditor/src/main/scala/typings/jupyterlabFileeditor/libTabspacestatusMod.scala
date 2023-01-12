package typings.jupyterlabFileeditor

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig
import typings.jupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.IOptions
import typings.jupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.Model
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabspacestatusMod {
  
  @JSImport("@jupyterlab/fileeditor/lib/tabspacestatus", "TabSpaceStatus")
  @js.native
  open class TabSpaceStatus protected () extends VDomRenderer[Model] {
    /**
      * Create a new tab/space status item.
      */
    def this(options: IOptions) = this()
    
    /**
      * Handle a click on the status item.
      */
    /* private */ var _handleClick: Any = js.native
    
    /* private */ var _menu: Any = js.native
    
    /* private */ var _menuClosed: Any = js.native
    
    /* private */ var _popup: Any = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object TabSpaceStatus {
    
    /**
      * A VDomModel for the TabSpace status item.
      */
    @JSImport("@jupyterlab/fileeditor/lib/tabspacestatus", "TabSpaceStatus.Model")
    @js.native
    open class Model () extends VDomModel {
      
      /* private */ var _config: Any = js.native
      
      /* private */ var _triggerChange: Any = js.native
      
      /**
        * The editor config from the settings system.
        */
      def config: IConfig | Null = js.native
      def config_=(`val`: IConfig | Null): Unit = js.native
    }
    
    /**
      * Options for creating a TabSpace status item.
      */
    trait IOptions extends StObject {
      
      /**
        * A menu to open when clicking on the status item. This should allow
        * the user to make a different selection about tabs/spaces.
        */
      var menu: Menu
      
      /**
        * Language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(menu: Menu): IOptions = {
        val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  /**
    * A namespace for TabSpaceComponent statics.
    */
  object TabSpaceComponent {
    
    /**
      * The props for TabSpaceComponent.
      */
    trait IProps extends StObject {
      
      /**
        * A click handler for the TabSpace component. By default
        * opens a menu allowing the user to select tabs vs spaces.
        */
      def handleClick(): Unit
      
      /**
        * Whether to use spaces or tabs.
        */
      var isSpaces: Boolean
      
      /**
        * The number of spaces to insert on tab.
        */
      var tabSpace: Double
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IProps {
      
      inline def apply(handleClick: () => Unit, isSpaces: Boolean, tabSpace: Double): IProps = {
        val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction0(handleClick), isSpaces = isSpaces.asInstanceOf[js.Any], tabSpace = tabSpace.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
        
        inline def setHandleClick(value: () => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction0(value))
        
        inline def setIsSpaces(value: Boolean): Self = StObject.set(x, "isSpaces", value.asInstanceOf[js.Any])
        
        inline def setTabSpace(value: Double): Self = StObject.set(x, "tabSpace", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
