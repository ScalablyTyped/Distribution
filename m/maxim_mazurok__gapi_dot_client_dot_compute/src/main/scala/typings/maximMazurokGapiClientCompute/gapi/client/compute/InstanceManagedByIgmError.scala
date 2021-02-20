package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceManagedByIgmError extends StObject {
  
  /** [Output Only] Contents of the error. */
  var error: js.UndefOr[InstanceManagedByIgmErrorManagedInstanceError] = js.native
  
  /** [Output Only] Details of the instance action that triggered this error. May be null, if the error was not caused by an action on an instance. This field is optional. */
  var instanceActionDetails: js.UndefOr[InstanceManagedByIgmErrorInstanceActionDetails] = js.native
  
  /** [Output Only] The time that this error occurred. This value is in RFC3339 text format. */
  var timestamp: js.UndefOr[String] = js.native
}
object InstanceManagedByIgmError {
  
  @scala.inline
  def apply(): InstanceManagedByIgmError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceManagedByIgmError]
  }
  
  @scala.inline
  implicit class InstanceManagedByIgmErrorMutableBuilder[Self <: InstanceManagedByIgmError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: InstanceManagedByIgmErrorManagedInstanceError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInstanceActionDetails(value: InstanceManagedByIgmErrorInstanceActionDetails): Self = StObject.set(x, "instanceActionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceActionDetailsUndefined: Self = StObject.set(x, "instanceActionDetails", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
