package typings.jupyterlabPropertyInspector

import typings.jupyterlabApplication.shellMod.ILabShell
import typings.jupyterlabPropertyInspector.tokenMod.IPropertyInspector
import typings.luminoCoreutils.mod.Token
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    /* private */ var _labshell: js.Any = js.native
    
    /**
      * Handle the case when the current widget is not in our tracker.
      */
    /* private */ var _onShellCurrentChanged: js.Any = js.native
    
    /* private */ var _placeholder: js.Any = js.native
    
    /**
      * Register a widget in the property inspector provider.
      *
      * @param widget The owner widget whose properties will be inspected.
      *
      * ## Notes
      * Only one property inspector can be provided for each widget.
      * Registering the same widget twice will result in an error.
      * A widget can be unregistered by disposing of its property
      * inspector.
      */
    /* CompleteClass */
    override def register(widget: Widget): IPropertyInspector = js.native
  }
  
  /**
    * The implementation of the PropertyInspector.
    */
  @js.native
  trait PropertyInspectorProvider
    extends Widget
       with typings.jupyterlabPropertyInspector.tokenMod.IPropertyInspectorProvider {
    
    /* private */ var _inspectors: js.Any = js.native
    
    /**
      * Handle a change to the current widget in the tracker.
      */
    /* private */ var _onCurrentChanged: js.Any = js.native
    
    /**
      * Handle inspector actions.
      */
    /* private */ var _onInspectorAction: js.Any = js.native
    
    /**
      * Handle the disposal of a widget.
      */
    /* private */ var _onWidgetDisposed: js.Any = js.native
    
    /* private */ var _tracker: js.Any = js.native
    
    /**
      * The current widget being tracked by the inspector.
      */
    /* protected */ def currentWidget: Widget | Null = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* InferMemberOverrides */
    override def processMessage(msg: Message): Unit = js.native
    
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
