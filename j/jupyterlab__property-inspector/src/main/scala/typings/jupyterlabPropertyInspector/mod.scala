package typings.jupyterlabPropertyInspector

import typings.jupyterlabApplication.libShellMod.ILabShell
import typings.jupyterlabPropertyInspector.libTokenMod.IPropertyInspector
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/property-inspector", "IPropertyInspectorProvider")
  @js.native
  val IPropertyInspectorProvider: Token[typings.jupyterlabPropertyInspector.libTokenMod.IPropertyInspectorProvider] = js.native
  
  @JSImport("@jupyterlab/property-inspector", "SideBarPropertyInspectorProvider")
  @js.native
  open class SideBarPropertyInspectorProvider protected () extends PropertyInspectorProvider {
    /**
      * Construct a new Side Bar Property Inspector.
      */
    def this(labshell: ILabShell) = this()
    def this(labshell: ILabShell, placeholder: Widget) = this()
    def this(labshell: ILabShell, placeholder: Unit, translator: ITranslator) = this()
    def this(labshell: ILabShell, placeholder: Widget, translator: ITranslator) = this()
    
    /* private */ var _labshell: Any = js.native
    
    /**
      * Handle the case when the current widget is not in our tracker.
      */
    /* private */ var _onShellCurrentChanged: Any = js.native
    
    /* private */ var _placeholder: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
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
    
    /* protected */ var translator: ITranslator = js.native
  }
  
  /**
    * The implementation of the PropertyInspector.
    */
  @js.native
  trait PropertyInspectorProvider
    extends Widget
       with typings.jupyterlabPropertyInspector.libTokenMod.IPropertyInspectorProvider {
    
    /* private */ var _inspectors: Any = js.native
    
    /**
      * Handle a change to the current widget in the tracker.
      */
    /* private */ var _onCurrentChanged: Any = js.native
    
    /**
      * Handle inspector actions.
      */
    /* private */ var _onInspectorAction: Any = js.native
    
    /**
      * Handle the disposal of a widget.
      */
    /* private */ var _onWidgetDisposed: Any = js.native
    
    /* private */ var _tracker: Any = js.native
    
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
