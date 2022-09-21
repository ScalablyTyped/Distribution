package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaces extends StObject {
  
  /**
    * The areas represented by place IDs. Limited to a maximum of 20 places.
    */
  var placeInfos: js.UndefOr[js.Array[SchemaPlaceInfo]] = js.undefined
}
object SchemaPlaces {
  
  inline def apply(): SchemaPlaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaces]
  }
  
  extension [Self <: SchemaPlaces](x: Self) {
    
    inline def setPlaceInfos(value: js.Array[SchemaPlaceInfo]): Self = StObject.set(x, "placeInfos", value.asInstanceOf[js.Any])
    
    inline def setPlaceInfosUndefined: Self = StObject.set(x, "placeInfos", js.undefined)
    
    inline def setPlaceInfosVarargs(value: SchemaPlaceInfo*): Self = StObject.set(x, "placeInfos", js.Array(value*))
  }
}
