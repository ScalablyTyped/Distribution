package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesGenerateserviceidentity
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the consumer and service to generate an identity for. The `GenerateServiceIdentity` methods currently only support projects. An example name would be: `projects/123/services/example.googleapis.com` where `123` is the project number.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesGenerateserviceidentity {
  
  inline def apply(): ParamsResourceServicesGenerateserviceidentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesGenerateserviceidentity]
  }
  
  extension [Self <: ParamsResourceServicesGenerateserviceidentity](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
