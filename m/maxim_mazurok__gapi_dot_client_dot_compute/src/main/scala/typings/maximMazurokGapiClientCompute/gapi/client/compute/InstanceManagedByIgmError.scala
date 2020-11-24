package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceManagedByIgmError extends js.Object {
  
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
  implicit class InstanceManagedByIgmErrorOps[Self <: InstanceManagedByIgmError] (val x: Self) extends AnyVal {
    
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
    def setError(value: InstanceManagedByIgmErrorManagedInstanceError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInstanceActionDetails(value: InstanceManagedByIgmErrorInstanceActionDetails): Self = this.set("instanceActionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceActionDetails: Self = this.set("instanceActionDetails", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
