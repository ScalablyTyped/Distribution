package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountstatusesCustomBatchResponseEntry extends StObject {
  
  /** The requested account status. Defined if and only if the request was successful. */
  var accountStatus: js.UndefOr[AccountStatus] = js.undefined
  
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
}
object AccountstatusesCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): AccountstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountstatusesCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class AccountstatusesCustomBatchResponseEntryMutableBuilder[Self <: AccountstatusesCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountStatus(value: AccountStatus): Self = StObject.set(x, "accountStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountStatusUndefined: Self = StObject.set(x, "accountStatus", js.undefined)
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
  }
}
