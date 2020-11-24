package typings.jupyterlabAttachments.modelMod.AttachmentsResolver

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create an AttachmentsResolver.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The attachments model to resolve against.
    */
  var model: IAttachmentsModel = js.native
  
  /**
    * A parent resolver to use if the URL/path is not for an attachment.
    */
  var parent: js.UndefOr[IResolver] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(model: IAttachmentsModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setModel(value: IAttachmentsModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: IResolver): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
