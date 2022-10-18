package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DarkLight extends StObject {
  
  var dark: js.UndefOr[None] = js.undefined
  
  var light: js.UndefOr[None] = js.undefined
}
object DarkLight {
  
  inline def apply(): DarkLight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkLight]
  }
  
  extension [Self <: DarkLight](x: Self) {
    
    inline def setDark(value: None): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setLight(value: None): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
  }
}
