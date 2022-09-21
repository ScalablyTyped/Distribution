package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnErrorEventUIParam extends StObject {
  
  /**
    * Gets the current errorCode.
    */
  var errorCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the detailed error description.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the error type - it could be clientside or serverside.
    */
  var errorType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the identifier of the file for which the event is fired(after that it can be used API function getFileInfo). NOTE: It is possible to be null in some cases: try to drop multiple files when mode is single , check maximum allowed uploading files fails or check for count of maximum allowed simultaneous files upload fails.
    */
  var fileId: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the specific server message returned by server - if errorType is serverside.
    */
  var serverMessage: js.UndefOr[String] = js.undefined
}
object OnErrorEventUIParam {
  
  inline def apply(): OnErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnErrorEventUIParam]
  }
  
  extension [Self <: OnErrorEventUIParam](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setServerMessage(value: String): Self = StObject.set(x, "serverMessage", value.asInstanceOf[js.Any])
    
    inline def setServerMessageUndefined: Self = StObject.set(x, "serverMessage", js.undefined)
  }
}
