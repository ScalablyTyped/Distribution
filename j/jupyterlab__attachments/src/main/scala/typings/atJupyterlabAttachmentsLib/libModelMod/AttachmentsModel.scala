package typings
package atJupyterlabAttachmentsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel")
@js.native
/**
  * Construct a new observable outputs instance.
  */
class AttachmentsModel () extends IAttachmentsModel {
  def this(options: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.IOptions) = this()
  var _changeGuard: js.Any = js.native
  var _changed: js.Any = js.native
  /**
    * Create an attachment item and hook up its signals.
    */
  var _createItem: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _map: js.Any = js.native
  var _modelDB: js.Any = js.native
  /**
    * Handle a change to an item.
    */
  var _onGenericChange: js.Any = js.native
  /**
    * Handle a change to the list.
    */
  var _onMapChanged: js.Any = js.native
  /**
    * If the serialized version of the outputs have changed due to a remote
    * action, then update the model accordingly.
    */
  var _onSerializedChanged: js.Any = js.native
  var _serialized: js.Any = js.native
  var _stateChanged: js.Any = js.native
  /**
    * A signal emitted when the model changes.
    */
  /* CompleteClass */
  override val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    IAttachmentsModel, 
    atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.ChangedArgs
  ] = js.native
  /**
    * A signal emitted when the model changes.
    */
  @JSName("changed")
  val changed_AttachmentsModel: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.ChangedArgs] = js.native
  /**
    * The attachment content factory used by the model.
    */
  /* CompleteClass */
  override val contentFactory: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.IContentFactory = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The keys of the attachments in the model.
    */
  /* CompleteClass */
  override val keys: js.Array[java.lang.String] = js.native
  /**
    * The length of the items in the model.
    */
  /* CompleteClass */
  override val length: scala.Double = js.native
  /**
    * A signal emitted when the model state changes.
    */
  /* CompleteClass */
  override val stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IAttachmentsModel, scala.Unit] = js.native
  /**
    * Clear all of the attachments.
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
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
    * Deserialize the model from JSON.
    *
    * #### Notes
    * This will clear any existing data.
    */
  /* CompleteClass */
  override def fromJSON(values: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IAttachments): scala.Unit = js.native
  /**
    * Get an item for the specified key.
    */
  /* CompleteClass */
  override def get(key: java.lang.String): atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModel = js.native
  /**
    * Whether the specified key is set.
    */
  /* CompleteClass */
  override def has(key: java.lang.String): scala.Boolean = js.native
  /**
    * Set the value of the specified key.
    */
  /* CompleteClass */
  override def set(key: java.lang.String, attachment: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IMimeBundle): scala.Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* CompleteClass */
  override def toJSON(): atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IAttachments = js.native
}

