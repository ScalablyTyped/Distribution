package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesInts.`0`
import typings.jupyterlabServices.jupyterlabServicesInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cursorpos extends StObject {
  
  var code: String
  
  var cursor_pos: Double
  
  var detail_level: `0` | `1`
}
object Cursorpos {
  
  inline def apply(code: String, cursor_pos: Double, detail_level: `0` | `1`): Cursorpos = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any], detail_level = detail_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursorpos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cursorpos] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCursor_pos(value: Double): Self = StObject.set(x, "cursor_pos", value.asInstanceOf[js.Any])
    
    inline def setDetail_level(value: `0` | `1`): Self = StObject.set(x, "detail_level", value.asInstanceOf[js.Any])
  }
}
