package typings.jupyterlabAttachments.modelMod

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.ChangedArgs
import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IContentFactory
import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @JSName("changed")
  def changed_MAttachmentsModel: ISignal[this.type, ChangedArgs] = js.native
  
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
    * A signal emitted when the model state changes.
    */
  @JSName("stateChanged")
  def stateChanged_MAttachmentsModel: ISignal[IAttachmentsModel, Unit] = js.native
}
@JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel")
@js.native
object AttachmentsModel extends js.Object {
  
  /**
    * The default attachment model factory.
    */
  val defaultContentFactory: ContentFactory = js.native
  
  /**
    * The default implementation of a `IAttachemntsModel.IContentFactory`.
    */
  @js.native
  class ContentFactory () extends IContentFactory
}
