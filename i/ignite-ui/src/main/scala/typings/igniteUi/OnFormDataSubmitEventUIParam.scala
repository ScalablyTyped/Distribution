package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFormDataSubmitEventUIParam extends StObject {
  
  /**
    * Gets the unique identifier of the file.
    */
  var fileId: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from the server-side), etc.
    */
  var fileInfo: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to FormData object(if the browser supports HTML5 file API) OR reference to jQuery representation of <form>.
    */
  var formData: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to the original XMLHttpRequest object(if the browser supports HTML 5 file API - if not it is undefined).
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}
object OnFormDataSubmitEventUIParam {
  
  @scala.inline
  def apply(): OnFormDataSubmitEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFormDataSubmitEventUIParam]
  }
  
  @scala.inline
  implicit class OnFormDataSubmitEventUIParamMutableBuilder[Self <: OnFormDataSubmitEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setFileInfo(value: js.Any): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInfoUndefined: Self = StObject.set(x, "fileInfo", js.undefined)
    
    @scala.inline
    def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setXhr(value: js.Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
