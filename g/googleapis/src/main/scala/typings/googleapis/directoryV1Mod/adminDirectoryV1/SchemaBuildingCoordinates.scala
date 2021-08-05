package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for coordinates of a building in Directory API.
  */
trait SchemaBuildingCoordinates extends StObject {
  
  /**
    * Latitude in decimal degrees.
    */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /**
    * Longitude in decimal degrees.
    */
  var longitude: js.UndefOr[Double] = js.undefined
}
object SchemaBuildingCoordinates {
  
  inline def apply(): SchemaBuildingCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildingCoordinates]
  }
  
  extension [Self <: SchemaBuildingCoordinates](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
