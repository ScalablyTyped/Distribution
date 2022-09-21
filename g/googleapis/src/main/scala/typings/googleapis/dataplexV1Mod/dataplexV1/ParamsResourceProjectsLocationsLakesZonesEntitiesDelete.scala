package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesZonesEntitiesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The etag associated with the entity, which can be retrieved with a GetEntity request.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the entity: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{entity_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesZonesEntitiesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesZonesEntitiesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesZonesEntitiesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesZonesEntitiesDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
