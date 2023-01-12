package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MathJSON extends StObject {
  
  var fixPrefix: js.UndefOr[Boolean] = js.undefined
  
  var mathjs: js.UndefOr[String] = js.undefined
  
  var unit: String
  
  var value: Double
}
object MathJSON {
  
  inline def apply(unit: String, value: Double): MathJSON = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MathJSON] (val x: Self) extends AnyVal {
    
    inline def setFixPrefix(value: Boolean): Self = StObject.set(x, "fixPrefix", value.asInstanceOf[js.Any])
    
    inline def setFixPrefixUndefined: Self = StObject.set(x, "fixPrefix", js.undefined)
    
    inline def setMathjs(value: String): Self = StObject.set(x, "mathjs", value.asInstanceOf[js.Any])
    
    inline def setMathjsUndefined: Self = StObject.set(x, "mathjs", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
