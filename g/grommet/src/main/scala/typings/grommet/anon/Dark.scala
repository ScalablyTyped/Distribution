package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dark extends StObject {
  
  var dark: js.UndefOr[String] = js.undefined
  
  var light: js.UndefOr[String] = js.undefined
}
object Dark {
  
  inline def apply(): Dark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dark]
  }
  
  extension [Self <: Dark](x: Self) {
    
    inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
  }
}
