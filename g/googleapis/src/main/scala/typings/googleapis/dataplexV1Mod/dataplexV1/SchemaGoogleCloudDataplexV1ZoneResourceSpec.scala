package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ZoneResourceSpec extends StObject {
  
  /**
    * Required. Immutable. The location type of the resources that are allowed to be attached to the assets within this zone.
    */
  var locationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ZoneResourceSpec {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ZoneResourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ZoneResourceSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ZoneResourceSpec](x: Self) {
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeNull: Self = StObject.set(x, "locationType", null)
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
  }
}
