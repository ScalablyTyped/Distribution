package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedNumberPart extends StObject {
  
  var `type`: FormattedNumberPartType
  
  var value: String
}
object FormattedNumberPart {
  
  inline def apply(`type`: FormattedNumberPartType, value: String): FormattedNumberPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedNumberPart]
  }
  
  extension [Self <: FormattedNumberPart](x: Self) {
    
    inline def setType(value: FormattedNumberPartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
