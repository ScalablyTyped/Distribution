package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1LatLongRect extends StObject {
  
  /**
    * Max lat/long pair.
    */
  var maxLatLng: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * Min lat/long pair.
    */
  var minLatLng: js.UndefOr[SchemaLatLng] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1LatLongRect {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1LatLongRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1LatLongRect]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1LatLongRect](x: Self) {
    
    inline def setMaxLatLng(value: SchemaLatLng): Self = StObject.set(x, "maxLatLng", value.asInstanceOf[js.Any])
    
    inline def setMaxLatLngUndefined: Self = StObject.set(x, "maxLatLng", js.undefined)
    
    inline def setMinLatLng(value: SchemaLatLng): Self = StObject.set(x, "minLatLng", value.asInstanceOf[js.Any])
    
    inline def setMinLatLngUndefined: Self = StObject.set(x, "minLatLng", js.undefined)
  }
}
