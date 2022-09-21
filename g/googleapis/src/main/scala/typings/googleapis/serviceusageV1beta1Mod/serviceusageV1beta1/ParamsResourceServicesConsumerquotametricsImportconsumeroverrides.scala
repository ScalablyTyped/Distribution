package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConsumerquotametricsImportconsumeroverrides
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the consumer. An example name would be: `projects/123/services/compute.googleapis.com`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaImportConsumerOverridesRequest] = js.undefined
}
object ParamsResourceServicesConsumerquotametricsImportconsumeroverrides {
  
  inline def apply(): ParamsResourceServicesConsumerquotametricsImportconsumeroverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConsumerquotametricsImportconsumeroverrides]
  }
  
  extension [Self <: ParamsResourceServicesConsumerquotametricsImportconsumeroverrides](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaImportConsumerOverridesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
