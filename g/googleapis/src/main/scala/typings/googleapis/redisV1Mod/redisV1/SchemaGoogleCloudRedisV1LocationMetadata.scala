package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This location metadata represents additional configuration options for a
  * given location where a Redis instance may be created. All fields are output
  * only. It is returned as content of the
  * `google.cloud.location.Location.metadata` field.
  */
trait SchemaGoogleCloudRedisV1LocationMetadata extends StObject {
  
  /**
    * Output only. The set of available zones in the location. The map is keyed
    * by the lowercase ID of each zone, as defined by GCE. These keys can be
    * specified in `location_id` or `alternative_location_id` fields when
    * creating a Redis instance.
    */
  var availableZones: js.UndefOr[StringDictionary[SchemaGoogleCloudRedisV1ZoneMetadata]] = js.undefined
}
object SchemaGoogleCloudRedisV1LocationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleCloudRedisV1LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRedisV1LocationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudRedisV1LocationMetadataMutableBuilder[Self <: SchemaGoogleCloudRedisV1LocationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableZones(value: StringDictionary[SchemaGoogleCloudRedisV1ZoneMetadata]): Self = StObject.set(x, "availableZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableZonesUndefined: Self = StObject.set(x, "availableZones", js.undefined)
  }
}
