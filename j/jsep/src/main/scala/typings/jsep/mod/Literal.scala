package typings.jsep.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Literal
  extends StObject
     with Expression
     with CoreExpression {
  
  var raw: String
  
  @JSName("type")
  var type_Literal: typings.jsep.jsepStrings.Literal
  
  var value: Boolean | Double | String | js.RegExp | Null
}
object Literal {
  
  inline def apply(raw: String): Literal = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.jsep.jsepStrings.Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean | Double | String | js.RegExp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
