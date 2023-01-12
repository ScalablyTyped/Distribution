package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayText extends StObject {
  
  var str: String
  
  var `type`: String
}
object DisplayText {
  
  inline def apply(str: String, `type`: String): DisplayText = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayText] (val x: Self) extends AnyVal {
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
