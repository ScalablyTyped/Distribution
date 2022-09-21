package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRedisV1LocationMetadata extends StObject {
  
  /**
    * Output only. The set of available zones in the location. The map is keyed by the lowercase ID of each zone, as defined by GCE. These keys can be specified in `location_id` or `alternative_location_id` fields when creating a Redis instance.
    */
  var availableZones: js.UndefOr[StringDictionary[SchemaGoogleCloudRedisV1ZoneMetadata] | Null] = js.undefined
}
object SchemaGoogleCloudRedisV1LocationMetadata {
  
  inline def apply(): SchemaGoogleCloudRedisV1LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRedisV1LocationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudRedisV1LocationMetadata](x: Self) {
    
    inline def setAvailableZones(value: StringDictionary[SchemaGoogleCloudRedisV1ZoneMetadata]): Self = StObject.set(x, "availableZones", value.asInstanceOf[js.Any])
    
    inline def setAvailableZonesNull: Self = StObject.set(x, "availableZones", null)
    
    inline def setAvailableZonesUndefined: Self = StObject.set(x, "availableZones", js.undefined)
  }
}
