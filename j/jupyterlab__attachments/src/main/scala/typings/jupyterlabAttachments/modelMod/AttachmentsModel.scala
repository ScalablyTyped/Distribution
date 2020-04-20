package typings.jupyterlabAttachments.modelMod

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.ChangedArgs
import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IContentFactory
import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions
import typings.jupyterlabNbformat.mod.IAttachments
import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel")
@js.native
/**
  * Construct a new observable outputs instance.
  */
class AttachmentsModel () extends IAttachmentsModel {
  def this(options: IOptions) = this()
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
  override val changed: ISignal[IAttachmentsModel, ChangedArgs] = js.native
  /**
    * The attachment content factory used by the model.
    */
  /* CompleteClass */
  override val contentFactory: IContentFactory = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The keys of the attachments in the model.
    */
  /* CompleteClass */
  override val keys: js.Array[String] = js.native
  /**
    * The length of the items in the model.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * A signal emitted when the model state changes.
    */
  /* CompleteClass */
  override val stateChanged: ISignal[IAttachmentsModel, Unit] = js.native
  /**
    * A signal emitted when the model changes.
    */
  @JSName("changed")
  def changed_MAttachmentsModel: ISignal[this.type, ChangedArgs] = js.native
  /**
    * Clear all of the attachments.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
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
    * Deserialize the model from JSON.
    *
    * #### Notes
    * This will clear any existing data.
    */
  /* CompleteClass */
  override def fromJSON(values: IAttachments): Unit = js.native
  /**
    * Get an item for the specified key.
    */
  /* CompleteClass */
  override def get(key: String): js.UndefOr[IAttachmentModel] = js.native
  /**
    * Whether the specified key is set.
    */
  /* CompleteClass */
  override def has(key: String): Boolean = js.native
  /**
    * Test whether the model is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MAttachmentsModel: Boolean = js.native
  /**
    * The keys of the attachments in the model.
    */
  @JSName("keys")
  def keys_MAttachmentsModel: js.Array[String] = js.native
  /**
    * Get the length of the items in the model.
    */
  @JSName("length")
  def length_MAttachmentsModel: Double = js.native
  /**
    * Remove the attachment whose name is the specified key.
    * Note that this is optional only until Jupyterlab 2.0 release.
    */
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  /**
    * Set the value of the specified key.
    */
  /* CompleteClass */
  override def set(key: String, attachment: IMimeBundle): Unit = js.native
  /**
    * A signal emitted when the model state changes.
    */
  @JSName("stateChanged")
  def stateChanged_MAttachmentsModel: ISignal[IAttachmentsModel, Unit] = js.native
  /**
    * Serialize the model to JSON.
    */
  /* CompleteClass */
  override def toJSON(): IAttachments = js.native
}

@JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel")
@js.native
object AttachmentsModel extends js.Object {
  /**
    * The default implementation of a `IAttachemntsModel.IContentFactory`.
    */
  @js.native
  class ContentFactory () extends IContentFactory {
    /**
      * Create an attachment model.
      */
    /* CompleteClass */
    override def createAttachmentModel(options: typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions): IAttachmentModel = js.native
  }
  
  /**
    * The default attachment model factory.
    */
  val defaultContentFactory: ContentFactory = js.native
}

