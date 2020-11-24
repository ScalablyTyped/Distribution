package typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel

import typings.jupyterlabNbformat.mod.IMimeBundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create a notebook attachment model.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The raw attachment value.
    */
  var value: IMimeBundle = js.native
}
object IOptions {
  
  @scala.inline
  def apply(value: IMimeBundle): IOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
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
    def setValue(value: IMimeBundle): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
