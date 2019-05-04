package typings
package atJupyterlabOutputareaLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel")
@js.native
/**
  * Construct a new observable outputs instance.
  */
class OutputAreaModel () extends IOutputAreaModel {
  def this(options: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModelNs.IOptions) = this()
  /**
    * Add an item to the list.
    */
  var _add: js.Any = js.native
  var _changeGuard: js.Any = js.native
  var _changed: js.Any = js.native
  /**
    * Create an output item and hook up its signals.
    */
  var _createItem: js.Any = js.native
  /**
    * Remove characters that are overridden by backspace characters.
    */
  var _fixBackspace: js.Any = js.native
  /**
    * Remove chunks that should be overridden by the effect of
    * carriage return characters.
    */
  var _fixCarriageReturn: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _lastName: js.Any = js.native
  var _lastStream: js.Any = js.native
  var _modelDB: js.Any = js.native
  /**
    * Normalize an output.
    */
  var _normalize: js.Any = js.native
  /**
    * Handle a change to an item.
    */
  var _onGenericChange: js.Any = js.native
  /**
    * Handle a change to the list.
    */
  var _onListChanged: js.Any = js.native
  /**
    * If the serialized version of the outputs have changed due to a remote
    * action, then update the model accordingly.
    */
  var _onSerializedChanged: js.Any = js.native
  var _removeOverwrittenChars: js.Any = js.native
  var _serialized: js.Any = js.native
  var _stateChanged: js.Any = js.native
  var _trusted: js.Any = js.native
  /**
    * A signal emitted when the model changes.
    */
  @JSName("changed")
  val changed_OutputAreaModel: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabOutputareaLib.libModelMod.IOutputAreaModelNs.ChangedArgs] = js.native
  var clearNext: scala.Boolean = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  var list: atJupyterlabObservablesLib.libObservablelistMod.IObservableList[atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModel] = js.native
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
}

