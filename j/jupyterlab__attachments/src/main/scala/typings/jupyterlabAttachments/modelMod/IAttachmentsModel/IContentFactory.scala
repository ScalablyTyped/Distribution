package typings.jupyterlabAttachments.modelMod.IAttachmentsModel

import typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for an attachment content factory.
  */
@js.native
trait IContentFactory extends js.Object {
  
  /**
    * Create an attachment model.
    */
  def createAttachmentModel(options: typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions): IAttachmentModel = js.native
}
object IContentFactory {
  
  @scala.inline
  def apply(
    createAttachmentModel: typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions => IAttachmentModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentModel = js.Any.fromFunction1(createAttachmentModel))
    __obj.asInstanceOf[IContentFactory]
  }
  
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateAttachmentModel(
      value: typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions => IAttachmentModel
    ): Self = this.set("createAttachmentModel", js.Any.fromFunction1(value))
  }
}
