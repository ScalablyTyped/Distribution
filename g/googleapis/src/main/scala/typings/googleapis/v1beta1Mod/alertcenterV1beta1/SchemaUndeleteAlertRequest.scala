package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to undelete a specific alert that was marked for deletion.
  */
@js.native
trait SchemaUndeleteAlertRequest extends StObject {
  
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alert is associated with. Inferred from the caller
    * identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.native
}
object SchemaUndeleteAlertRequest {
  
  @scala.inline
  def apply(): SchemaUndeleteAlertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteAlertRequest]
  }
  
  @scala.inline
  implicit class SchemaUndeleteAlertRequestMutableBuilder[Self <: SchemaUndeleteAlertRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
