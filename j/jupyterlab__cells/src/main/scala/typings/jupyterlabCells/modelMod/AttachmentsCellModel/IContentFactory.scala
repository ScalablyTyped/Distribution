package typings.jupyterlabCells.modelMod.AttachmentsCellModel

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A factory for creating code cell model content.
  */
@js.native
trait IContentFactory extends js.Object {
  
  /**
    * Create an output area.
    */
  def createAttachmentsModel(options: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions): IAttachmentsModel = js.native
}
object IContentFactory {
  
  @scala.inline
  def apply(
    createAttachmentsModel: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => IAttachmentsModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentsModel = js.Any.fromFunction1(createAttachmentsModel))
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
    def setCreateAttachmentsModel(value: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => IAttachmentsModel): Self = this.set("createAttachmentsModel", js.Any.fromFunction1(value))
  }
}
