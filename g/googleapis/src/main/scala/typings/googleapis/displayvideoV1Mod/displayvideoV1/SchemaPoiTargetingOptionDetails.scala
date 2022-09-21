package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPoiTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The display name of a POI(e.g. "Times Square", "Space Needle"), followed by its full address if available.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Latitude of the POI rounding to 6th decimal place.
    */
  var latitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Longitude of the POI rounding to 6th decimal place.
    */
  var longitude: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPoiTargetingOptionDetails {
  
  inline def apply(): SchemaPoiTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoiTargetingOptionDetails]
  }
  
  extension [Self <: SchemaPoiTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
