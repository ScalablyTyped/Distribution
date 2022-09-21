package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesDnszonesRemove
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The service that is managing peering connectivity for a service producer's organization. For Google services that support this functionality, this value is `services/servicenetworking.googleapis.com`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRemoveDnsZoneRequest] = js.undefined
}
object ParamsResourceServicesDnszonesRemove {
  
  inline def apply(): ParamsResourceServicesDnszonesRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesDnszonesRemove]
  }
  
  extension [Self <: ParamsResourceServicesDnszonesRemove](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaRemoveDnsZoneRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
