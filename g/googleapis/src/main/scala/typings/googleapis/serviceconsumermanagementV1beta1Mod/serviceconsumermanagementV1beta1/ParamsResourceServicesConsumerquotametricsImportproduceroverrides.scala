package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConsumerquotametricsImportproduceroverrides
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the consumer. An example name would be: `services/compute.googleapis.com/projects/123`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaV1Beta1ImportProducerOverridesRequest] = js.undefined
}
object ParamsResourceServicesConsumerquotametricsImportproduceroverrides {
  
  inline def apply(): ParamsResourceServicesConsumerquotametricsImportproduceroverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConsumerquotametricsImportproduceroverrides]
  }
  
  extension [Self <: ParamsResourceServicesConsumerquotametricsImportproduceroverrides](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaV1Beta1ImportProducerOverridesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
