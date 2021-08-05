package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacePlusCode extends StObject {
  
  var compound_code: js.UndefOr[String] = js.undefined
  
  var global_code: String
}
object PlacePlusCode {
  
  inline def apply(global_code: String): PlacePlusCode = {
    val __obj = js.Dynamic.literal(global_code = global_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePlusCode]
  }
  
  extension [Self <: PlacePlusCode](x: Self) {
    
    inline def setCompound_code(value: String): Self = StObject.set(x, "compound_code", value.asInstanceOf[js.Any])
    
    inline def setCompound_codeUndefined: Self = StObject.set(x, "compound_code", js.undefined)
    
    inline def setGlobal_code(value: String): Self = StObject.set(x, "global_code", value.asInstanceOf[js.Any])
  }
}
