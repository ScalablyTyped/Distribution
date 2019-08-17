package typings.atJupyterlabInspector.libHandlerMod

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IEditor
import typings.atJupyterlabInspector.libHandlerMod.InspectionHandlerNs.IOptions
import typings.atJupyterlabInspector.libTokensMod.IInspectorNs.IInspectorUpdate
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atJupyterlabInspector.libTokensMod.IInspectorNs.IInspectable because var conflicts: isDisposed. Inlined cleared, disposed, inspected, standby */ @JSImport("@jupyterlab/inspector/lib/handler", "InspectionHandler")
@js.native
class InspectionHandler protected () extends IDisposable {
  /**
    * Construct a new inspection handler for a widget.
    */
  def this(options: IOptions) = this()
  var _cleared: js.Any = js.native
  var _connector: js.Any = js.native
  var _debouncer: js.Any = js.native
  var _disposed: js.Any = js.native
  var _editor: js.Any = js.native
  var _inspected: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Handle changes to the editor state, debouncing.
    */
  var _onChange: js.Any = js.native
  var _pending: js.Any = js.native
  var _rendermime: js.Any = js.native
  var _standby: js.Any = js.native
  /**
    * A signal emitted when the inspector should clear all items.
    */
  val cleared: ISignal[_ | InspectionHandler, Unit] = js.native
  /**
    * A signal emitted when the handler is disposed.
    */
  val disposed: ISignal[_ | InspectionHandler, Unit] = js.native
  /**
    * The editor widget used by the inspection handler.
    */
  var editor: IEditor | Null = js.native
  /**
    * A signal emitted when an inspector value is generated.
    */
  val inspected: ISignal[_ | InspectionHandler, IInspectorUpdate] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Indicates whether the handler makes API inspection requests or stands by.
    *
    * #### Notes
    * The use case for this attribute is to limit the API traffic when no
    * inspector is visible.
    */
  var standby: Boolean = js.native
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
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Handle a text changed signal from an editor.
    *
    * #### Notes
    * Update the hints inspector based on a text change.
    */
  /* protected */ def onEditorChange(): Unit = js.native
}

