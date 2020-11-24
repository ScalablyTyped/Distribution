package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This location metadata represents additional configuration options for a
  * given location where a Redis instance may be created. All fields are output
  * only. It is returned as content of the
  * `google.cloud.location.Location.metadata` field.
  */
@js.native
trait SchemaGoogleCloudRedisV1LocationMetadata extends js.Object {
  
  /**
    * Output only. The set of available zones in the location. The map is keyed
    * by the lowercase ID of each zone, as defined by GCE. These keys can be
    * specified in `location_id` or `alternative_location_id` fields when
    * creating a Redis instance.
    */
  var availableZones: js.UndefOr[StringDictionary[SchemaGoogleCloudRedisV1ZoneMetadata]] = js.native
}
object SchemaGoogleCloudRedisV1LocationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleCloudRedisV1LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRedisV1LocationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudRedisV1LocationMetadataOps[Self <: SchemaGoogleCloudRedisV1LocationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailableZones(value: StringDictionary[SchemaGoogleCloudRedisV1ZoneMetadata]): Self = this.set("availableZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableZones: Self = this.set("availableZones", js.undefined)
  }
}
