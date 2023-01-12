package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DarkLight extends StObject {
  
  var dark: js.UndefOr[Medium] = js.undefined
  
  var light: js.UndefOr[Medium] = js.undefined
}
object DarkLight {
  
  inline def apply(): DarkLight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkLight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DarkLight] (val x: Self) extends AnyVal {
    
    inline def setDark(value: Medium): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setLight(value: Medium): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
  }
}
