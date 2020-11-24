package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnFormDataSubmitEventUIParam extends js.Object {
  
  /**
    * Gets the unique identifier of the file.
    */
  var fileId: js.UndefOr[Double] = js.native
  
  /**
    * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from the server-side), etc.
    */
  var fileInfo: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to FormData object(if the browser supports HTML5 file API) OR reference to jQuery representation of <form>.
    */
  var formData: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to the original XMLHttpRequest object(if the browser supports HTML 5 file API - if not it is undefined).
    */
  var xhr: js.UndefOr[js.Any] = js.native
}
object OnFormDataSubmitEventUIParam {
  
  @scala.inline
  def apply(): OnFormDataSubmitEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFormDataSubmitEventUIParam]
  }
  
  @scala.inline
  implicit class OnFormDataSubmitEventUIParamOps[Self <: OnFormDataSubmitEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setFileId(value: Double): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    
    @scala.inline
    def setFileInfo(value: js.Any): Self = this.set("fileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileInfo: Self = this.set("fileInfo", js.undefined)
    
    @scala.inline
    def setFormData(value: js.Any): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setXhr(value: js.Any): Self = this.set("xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
}
