package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderOperationError extends StObject {
  
  /** The type of operation error experienced. */
  var errorMessageId: js.UndefOr[String] = js.undefined
}
object FolderOperationError {
  
  @scala.inline
  def apply(): FolderOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderOperationError]
  }
  
  @scala.inline
  implicit class FolderOperationErrorMutableBuilder[Self <: FolderOperationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessageId(value: String): Self = StObject.set(x, "errorMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageIdUndefined: Self = StObject.set(x, "errorMessageId", js.undefined)
  }
}
