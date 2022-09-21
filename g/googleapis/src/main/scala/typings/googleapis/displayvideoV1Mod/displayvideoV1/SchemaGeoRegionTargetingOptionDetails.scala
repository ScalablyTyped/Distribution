package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeoRegionTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The display name of the geographic region (e.g., "Ontario, Canada").
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of geographic region targeting.
    */
  var geoRegionType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGeoRegionTargetingOptionDetails {
  
  inline def apply(): SchemaGeoRegionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeoRegionTargetingOptionDetails]
  }
  
  extension [Self <: SchemaGeoRegionTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGeoRegionType(value: String): Self = StObject.set(x, "geoRegionType", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionTypeNull: Self = StObject.set(x, "geoRegionType", null)
    
    inline def setGeoRegionTypeUndefined: Self = StObject.set(x, "geoRegionType", js.undefined)
  }
}
