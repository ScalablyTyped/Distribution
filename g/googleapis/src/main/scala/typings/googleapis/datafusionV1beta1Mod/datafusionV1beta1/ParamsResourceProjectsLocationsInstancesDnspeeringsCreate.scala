package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesDnspeeringsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the peering to create.
    */
  var dnsPeeringId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource on which DNS peering will be created.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDnsPeering] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesDnspeeringsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesDnspeeringsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesDnspeeringsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesDnspeeringsCreate](x: Self) {
    
    inline def setDnsPeeringId(value: String): Self = StObject.set(x, "dnsPeeringId", value.asInstanceOf[js.Any])
    
    inline def setDnsPeeringIdUndefined: Self = StObject.set(x, "dnsPeeringId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaDnsPeering): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
