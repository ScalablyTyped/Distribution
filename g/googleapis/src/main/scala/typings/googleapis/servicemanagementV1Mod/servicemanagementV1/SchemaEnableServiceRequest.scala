package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for EnableService method.
  */
trait SchemaEnableServiceRequest extends StObject {
  
  /**
    * The identity of consumer resource which service enablement will be
    * applied to.  The Google Service Management implementation accepts the
    * following forms: - &quot;project:&lt;project_id&gt;&quot;  Note: this is
    * made compatible with google.api.servicecontrol.v1.Operation.consumer_id.
    */
  var consumerId: js.UndefOr[String] = js.undefined
}
object SchemaEnableServiceRequest {
  
  @scala.inline
  def apply(): SchemaEnableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnableServiceRequest]
  }
  
  @scala.inline
  implicit class SchemaEnableServiceRequestMutableBuilder[Self <: SchemaEnableServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerId(value: String): Self = StObject.set(x, "consumerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerIdUndefined: Self = StObject.set(x, "consumerId", js.undefined)
  }
}
