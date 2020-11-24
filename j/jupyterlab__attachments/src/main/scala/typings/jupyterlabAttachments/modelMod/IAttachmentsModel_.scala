package typings.jupyterlabAttachments.modelMod

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.ChangedArgs
import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IContentFactory
import typings.jupyterlabNbformat.mod.IAttachments
import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAttachmentsModel_ extends IDisposable {
  
  /**
    * A signal emitted when the model changes.
    */
  val changed: ISignal[IAttachmentsModel, ChangedArgs] = js.native
  
  /**
    * Clear all of the attachments.
    */
  def clear(): Unit = js.native
  
  /**
    * The attachment content factory used by the model.
    */
  val contentFactory: IContentFactory = js.native
  
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * This will clear any existing data.
    */
  def fromJSON(values: IAttachments): Unit = js.native
  
  /**
    * Get an item for the specified key.
    */
  def get(key: String): js.UndefOr[IAttachmentModel] = js.native
  
  /**
    * Whether the specified key is set.
    */
  def has(key: String): Boolean = js.native
  
  /**
    * The keys of the attachments in the model.
    */
  val keys: js.Array[String] = js.native
  
  /**
    * The length of the items in the model.
    */
  val length: Double = js.native
  
  /**
    * Remove the attachment whose name is the specified key.
    * Note that this is optional only until Jupyterlab 2.0 release.
    */
  def remove(key: String): Unit = js.native
  
  /**
    * Set the value of the specified key.
    */
  def set(key: String, attachment: IMimeBundle): Unit = js.native
  
  /**
    * A signal emitted when the model state changes.
    */
  val stateChanged: ISignal[IAttachmentsModel, Unit] = js.native
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IAttachments = js.native
}
object IAttachmentsModel_ {
  
  @scala.inline
  def apply(
    changed: ISignal[IAttachmentsModel, ChangedArgs],
    clear: () => Unit,
    contentFactory: IContentFactory,
    dispose: () => Unit,
    fromJSON: IAttachments => Unit,
    get: String => js.UndefOr[IAttachmentModel],
    has: String => Boolean,
    isDisposed: Boolean,
    keys: js.Array[String],
    length: Double,
    remove: String => Unit,
    set: (String, IMimeBundle) => Unit,
    stateChanged: ISignal[IAttachmentsModel, Unit],
    toJSON: () => IAttachments
  ): IAttachmentsModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contentFactory = contentFactory.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[IAttachmentsModel_]
  }
  
  @scala.inline
  implicit class IAttachmentsModel_Ops[Self <: IAttachmentsModel_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChanged(value: ISignal[IAttachmentsModel, ChangedArgs]): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentFactory(value: IContentFactory): Self = this.set("contentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromJSON(value: IAttachments => Unit): Self = this.set("fromJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.UndefOr[IAttachmentModel]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, IMimeBundle) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateChanged(value: ISignal[IAttachmentsModel, Unit]): Self = this.set("stateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => IAttachments): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
