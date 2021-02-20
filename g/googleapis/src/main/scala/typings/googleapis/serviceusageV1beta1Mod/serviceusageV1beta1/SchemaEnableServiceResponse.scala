package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `EnableService` method. This response message is
  * assigned to the `response` field of the returned Operation when that
  * operation is done.
  */
@js.native
trait SchemaEnableServiceResponse extends StObject {
  
  /**
    * The new state of the service after enabling.
    */
  var service: js.UndefOr[SchemaGoogleApiServiceusageV1Service] = js.native
}
object SchemaEnableServiceResponse {
  
  @scala.inline
  def apply(): SchemaEnableServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnableServiceResponse]
  }
  
  @scala.inline
  implicit class SchemaEnableServiceResponseMutableBuilder[Self <: SchemaEnableServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: SchemaGoogleApiServiceusageV1Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
