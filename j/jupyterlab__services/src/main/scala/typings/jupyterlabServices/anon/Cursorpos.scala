package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesNumbers.`0`
import typings.jupyterlabServices.jupyterlabServicesNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cursorpos extends StObject {
  
  var code: String = js.native
  
  var cursor_pos: Double = js.native
  
  var detail_level: `0` | `1` = js.native
}
object Cursorpos {
  
  @scala.inline
  def apply(code: String, cursor_pos: Double, detail_level: `0` | `1`): Cursorpos = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any], detail_level = detail_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursorpos]
  }
  
  @scala.inline
  implicit class CursorposMutableBuilder[Self <: Cursorpos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor_pos(value: Double): Self = StObject.set(x, "cursor_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail_level(value: `0` | `1`): Self = StObject.set(x, "detail_level", value.asInstanceOf[js.Any])
  }
}
