package typings.jupyterlabFileeditor

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig
import typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.IOptions
import typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.Model
import typings.luminoWidgets.mod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabspacestatusMod {
  
  @JSImport("@jupyterlab/fileeditor/lib/tabspacestatus", "TabSpaceStatus")
  @js.native
  class TabSpaceStatus protected () extends VDomRenderer[Model] {
    /**
      * Create a new tab/space status item.
      */
    def this(options: IOptions) = this()
    
    /**
      * Handle a click on the status item.
      */
    var _handleClick: js.Any = js.native
    
    var _menu: js.Any = js.native
    
    var _menuClosed: js.Any = js.native
    
    var _popup: js.Any = js.native
  }
  object TabSpaceStatus {
    
    /**
      * A VDomModel for the TabSpace status item.
      */
    @JSImport("@jupyterlab/fileeditor/lib/tabspacestatus", "TabSpaceStatus.Model")
    @js.native
    class Model () extends VDomModel {
      
      var _config: js.Any = js.native
      
      var _triggerChange: js.Any = js.native
      
      /**
        * The editor config from the settings system.
        */
      def config: IConfig | Null = js.native
      def config_=(`val`: IConfig | Null): Unit = js.native
    }
    
    /**
      * Options for creating a TabSpace status item.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A menu to open when clicking on the status item. This should allow
        * the user to make a different selection about tabs/spaces.
        */
      var menu: Menu = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(menu: Menu): IOptions = {
        val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
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
    @js.native
    trait IProps extends StObject {
      
      /**
        * A click handler for the TabSpace component. By default
        * opens a menu allowing the user to select tabs vs spaces.
        */
      def handleClick(): Unit = js.native
      
      /**
        * Whether to use spaces or tabs.
        */
      var isSpaces: Boolean = js.native
      
      /**
        * The number of spaces to insert on tab.
        */
      var tabSpace: Double = js.native
    }
    object IProps {
      
      @scala.inline
      def apply(handleClick: () => Unit, isSpaces: Boolean, tabSpace: Double): IProps = {
        val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction0(handleClick), isSpaces = isSpaces.asInstanceOf[js.Any], tabSpace = tabSpace.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      @scala.inline
      implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHandleClick(value: () => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsSpaces(value: Boolean): Self = StObject.set(x, "isSpaces", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTabSpace(value: Double): Self = StObject.set(x, "tabSpace", value.asInstanceOf[js.Any])
      }
    }
  }
}
