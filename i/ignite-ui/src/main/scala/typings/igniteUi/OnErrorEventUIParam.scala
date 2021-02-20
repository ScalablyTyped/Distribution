package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnErrorEventUIParam extends StObject {
  
  /**
    * Gets the current errorCode.
    */
  var errorCode: js.UndefOr[Double] = js.native
  
  /**
    * Gets the detailed error description.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * Gets the error type - it could be clientside or serverside.
    */
  var errorType: js.UndefOr[String] = js.native
  
  /**
    * Gets the identifier of the file for which the event is fired(after that it can be used API function getFileInfo). NOTE: It is possible to be null in some cases: try to drop multiple files when mode is single , check maximum allowed uploading files fails or check for count of maximum allowed simultaneous files upload fails.
    */
  var fileId: js.UndefOr[Double] = js.native
  
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the specific server message returned by server - if errorType is serverside.
    */
  var serverMessage: js.UndefOr[String] = js.native
}
object OnErrorEventUIParam {
  
  @scala.inline
  def apply(): OnErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnErrorEventUIParam]
  }
  
  @scala.inline
  implicit class OnErrorEventUIParamMutableBuilder[Self <: OnErrorEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    @scala.inline
    def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setServerMessage(value: String): Self = StObject.set(x, "serverMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerMessageUndefined: Self = StObject.set(x, "serverMessage", js.undefined)
  }
}
