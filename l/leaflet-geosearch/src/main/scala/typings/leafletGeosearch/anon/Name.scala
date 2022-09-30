package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var now_in_dst: Double
  
  var offset_sec: Double
  
  var offset_string: String
  
  var short_name: String
}
object Name {
  
  inline def apply(name: String, now_in_dst: Double, offset_sec: Double, offset_string: String, short_name: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], now_in_dst = now_in_dst.asInstanceOf[js.Any], offset_sec = offset_sec.asInstanceOf[js.Any], offset_string = offset_string.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNow_in_dst(value: Double): Self = StObject.set(x, "now_in_dst", value.asInstanceOf[js.Any])
    
    inline def setOffset_sec(value: Double): Self = StObject.set(x, "offset_sec", value.asInstanceOf[js.Any])
    
    inline def setOffset_string(value: String): Self = StObject.set(x, "offset_string", value.asInstanceOf[js.Any])
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
  }
}
