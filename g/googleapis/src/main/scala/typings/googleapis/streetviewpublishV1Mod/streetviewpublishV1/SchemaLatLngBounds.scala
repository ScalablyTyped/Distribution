package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLatLngBounds extends StObject {
  
  /**
    * The northeast corner of these bounds.
    */
  var northeast: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * The southwest corner of these bounds.
    */
  var southwest: js.UndefOr[SchemaLatLng] = js.undefined
}
object SchemaLatLngBounds {
  
  inline def apply(): SchemaLatLngBounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLatLngBounds]
  }
  
  extension [Self <: SchemaLatLngBounds](x: Self) {
    
    inline def setNortheast(value: SchemaLatLng): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setNortheastUndefined: Self = StObject.set(x, "northeast", js.undefined)
    
    inline def setSouthwest(value: SchemaLatLng): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
    
    inline def setSouthwestUndefined: Self = StObject.set(x, "southwest", js.undefined)
  }
}
