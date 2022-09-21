package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The etag associated with the partition.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the partition. format: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{entity_id\}/partitions/{partition_value_path\}. The {partition_value_path\} segment consists of an ordered sequence of partition values separated by "/". All values must be provided.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
