package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMemcacheV1LocationMetadata extends StObject {
  
  /**
    * Output only. The set of available zones in the location. The map is keyed by the lowercase ID of each zone, as defined by GCE. These keys can be specified in the `zones` field when creating a Memcached instance.
    */
  var availableZones: js.UndefOr[StringDictionary[SchemaGoogleCloudMemcacheV1ZoneMetadata] | Null] = js.undefined
}
object SchemaGoogleCloudMemcacheV1LocationMetadata {
  
  inline def apply(): SchemaGoogleCloudMemcacheV1LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMemcacheV1LocationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudMemcacheV1LocationMetadata](x: Self) {
    
    inline def setAvailableZones(value: StringDictionary[SchemaGoogleCloudMemcacheV1ZoneMetadata]): Self = StObject.set(x, "availableZones", value.asInstanceOf[js.Any])
    
    inline def setAvailableZonesNull: Self = StObject.set(x, "availableZones", null)
    
    inline def setAvailableZonesUndefined: Self = StObject.set(x, "availableZones", js.undefined)
  }
}
