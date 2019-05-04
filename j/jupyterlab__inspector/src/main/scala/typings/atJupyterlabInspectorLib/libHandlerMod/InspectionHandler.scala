package typings
package atJupyterlabInspectorLib.libHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector/lib/handler", "InspectionHandler")
@js.native
class InspectionHandler protected ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable
     with atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectable {
  /**
    * Construct a new inspection handler for a widget.
    */
  def this(options: atJupyterlabInspectorLib.libHandlerMod.InspectionHandlerNs.IOptions) = this()
  var _connector: js.Any = js.native
  var _disposed: js.Any = js.native
  var _editor: js.Any = js.native
  var _ephemeralCleared: js.Any = js.native
  var _inspected: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _pending: js.Any = js.native
  var _rendermime: js.Any = js.native
  var _standby: js.Any = js.native
  /**
    * A signal emitted when the handler is disposed.
    */
  /* CompleteClass */
  override var disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, scala.Unit] = js.native
  /**
    * A signal emitted when the handler is disposed.
    */
  @JSName("disposed")
  val disposed_InspectionHandler: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[InspectionHandler, scala.Unit] = js.native
  /**
    * The editor widget used by the inspection handler.
    */
  var editor: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | scala.Null = js.native
  /**
    * A signal emitted when inspector should clear all items with no history.
    */
  /* CompleteClass */
  override var ephemeralCleared: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, scala.Unit] = js.native
  /**
    * A signal emitted when inspector should clear all items with no history.
    */
  @JSName("ephemeralCleared")
  val ephemeralCleared_InspectionHandler: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[InspectionHandler, scala.Unit] = js.native
  /**
    * A signal emitted when an inspector value is generated.
    */
  /* CompleteClass */
  override var inspected: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectorUpdate] = js.native
  /**
    * A signal emitted when an inspector value is generated.
    */
  @JSName("inspected")
  val inspected_InspectionHandler: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    InspectionHandler, 
    atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectorUpdate
  ] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * Indicates whether the inspectable source emits signals.
    *
    * #### Notes
    * The use case for this attribute is to limit the API traffic when no
    * inspector is visible.
    */
  /* CompleteClass */
  override var standby: scala.Boolean = js.native
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
  override def dispose(): scala.Unit = js.native
  /**
    * Handle a text changed signal from an editor.
    *
    * #### Notes
    * Update the hints inspector based on a text change.
    */
  /* protected */ def onTextChanged(): scala.Unit = js.native
}

