package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadValidation extends js.Object {
  
  var allowedExtensions: js.UndefOr[js.Any] = js.native
  
  var maxFileSize: js.UndefOr[Double] = js.native
  
  var minFileSize: js.UndefOr[Double] = js.native
}
object UploadValidation {
  
  @scala.inline
  def apply(): UploadValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadValidation]
  }
  
  @scala.inline
  implicit class UploadValidationOps[Self <: UploadValidation] (val x: Self) extends AnyVal {
    
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
    def setAllowedExtensions(value: js.Any): Self = this.set("allowedExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedExtensions: Self = this.set("allowedExtensions", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    
    @scala.inline
    def setMinFileSize(value: Double): Self = this.set("minFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFileSize: Self = this.set("minFileSize", js.undefined)
  }
}
