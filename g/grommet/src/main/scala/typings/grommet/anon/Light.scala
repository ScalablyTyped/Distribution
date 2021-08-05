package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Light extends StObject {
  
  var dark: String | js.Array[String]
  
  var light: String | js.Array[String]
}
object Light {
  
  inline def apply(dark: String | js.Array[String], light: String | js.Array[String]): Light = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Light]
  }
  
  extension [Self <: Light](x: Self) {
    
    inline def setDark(value: String | js.Array[String]): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkVarargs(value: String*): Self = StObject.set(x, "dark", js.Array(value :_*))
    
    inline def setLight(value: String | js.Array[String]): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightVarargs(value: String*): Self = StObject.set(x, "light", js.Array(value :_*))
  }
}
