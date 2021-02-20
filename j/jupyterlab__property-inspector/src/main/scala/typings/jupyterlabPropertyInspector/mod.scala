package typings.jupyterlabPropertyInspector

import typings.jupyterlabApplication.shellMod.ILabShell
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/property-inspector", "IPropertyInspectorProvider")
  @js.native
  val IPropertyInspectorProvider: Token[typings.jupyterlabPropertyInspector.tokenMod.IPropertyInspectorProvider] = js.native
  
  @JSImport("@jupyterlab/property-inspector", "SideBarPropertyInspectorProvider")
  @js.native
  class SideBarPropertyInspectorProvider protected () extends PropertyInspectorProvider {
    /**
      * Construct a new Side Bar Property Inspector.
      */
    def this(labshell: ILabShell) = this()
    def this(labshell: ILabShell, placeholder: Widget) = this()
    
    var _labshell: js.Any = js.native
    
    /**
      * Handle the case when the current widget is not in our tracker.
      */
    var _onShellCurrentChanged: js.Any = js.native
    
    var _placeholder: js.Any = js.native
  }
  
  /**
    * The implementation of the PropertyInspector.
    */
  @js.native
  trait PropertyInspectorProvider
    extends Widget
       with typings.jupyterlabPropertyInspector.tokenMod.IPropertyInspectorProvider {
    
    var _inspectors: js.Any = js.native
    
    /**
      * Handle a change to the current widget in the tracker.
      */
    var _onCurrentChanged: js.Any = js.native
    
    /**
      * Handle inspector actions.
      */
    var _onInspectorAction: js.Any = js.native
    
    /**
      * Handle the disposal of a widget.
      */
    var _onWidgetDisposed: js.Any = js.native
    
    var _tracker: js.Any = js.native
    
    /**
      * The current widget being tracked by the inspector.
      */
    /* protected */ def currentWidget: Widget | Null = js.native
    
    /**
      * Refresh the content for the current widget.
      */
    /* protected */ def refresh(): Unit = js.native
    
    /**
      * Set the content of the provider.
      */
    /* protected */ def setContent(): Unit = js.native
    /* protected */ def setContent(content: Widget): Unit = js.native
    
    /**
      * Show the provider panel.
      */
    /* protected */ def showPanel(): Unit = js.native
  }
}
