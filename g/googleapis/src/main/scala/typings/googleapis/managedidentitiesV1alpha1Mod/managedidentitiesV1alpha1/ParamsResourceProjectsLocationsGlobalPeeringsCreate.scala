package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalPeeringsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource project name and location using the form: `projects/{project_id\}/locations/global`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Peering Id, unique name to identify peering.
    */
  var peeringId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPeering] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalPeeringsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalPeeringsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalPeeringsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalPeeringsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPeeringId(value: String): Self = StObject.set(x, "peeringId", value.asInstanceOf[js.Any])
    
    inline def setPeeringIdUndefined: Self = StObject.set(x, "peeringId", js.undefined)
    
    inline def setRequestBody(value: SchemaPeering): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
