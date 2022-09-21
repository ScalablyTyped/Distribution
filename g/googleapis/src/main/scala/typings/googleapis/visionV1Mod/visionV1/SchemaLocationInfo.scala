package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationInfo extends StObject {
  
  /**
    * lat/long location coordinates.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.undefined
}
object SchemaLocationInfo {
  
  inline def apply(): SchemaLocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationInfo]
  }
  
  extension [Self <: SchemaLocationInfo](x: Self) {
    
    inline def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
  }
}
