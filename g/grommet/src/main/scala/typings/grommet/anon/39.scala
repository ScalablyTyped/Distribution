package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var dark: js.UndefOr[js.Array[String]] = js.undefined
  
  var light: js.UndefOr[js.Array[String]] = js.undefined
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `39`] (val x: Self) extends AnyVal {
    
    inline def setDark(value: js.Array[String]): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setDarkVarargs(value: String*): Self = StObject.set(x, "dark", js.Array(value*))
    
    inline def setLight(value: js.Array[String]): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setLightVarargs(value: String*): Self = StObject.set(x, "light", js.Array(value*))
  }
}
