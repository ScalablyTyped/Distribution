package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARABIC extends StObject {
  
  var ARABIC: Method
  
  var ROMAN: `27`
}
object ARABIC {
  
  inline def apply(ARABIC: Method, ROMAN: `27`): ARABIC = {
    val __obj = js.Dynamic.literal(ARABIC = ARABIC.asInstanceOf[js.Any], ROMAN = ROMAN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARABIC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ARABIC] (val x: Self) extends AnyVal {
    
    inline def setARABIC(value: Method): Self = StObject.set(x, "ARABIC", value.asInstanceOf[js.Any])
    
    inline def setROMAN(value: `27`): Self = StObject.set(x, "ROMAN", value.asInstanceOf[js.Any])
  }
}
