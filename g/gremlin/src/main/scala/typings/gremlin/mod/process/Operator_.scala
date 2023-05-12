package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operator_ extends StObject {
  
  var addAll: EnumValue
  
  var and: EnumValue
  
  var assign: EnumValue
  
  var div: EnumValue
  
  var max: EnumValue
  
  var min: EnumValue
  
  var minus: EnumValue
  
  var mult: EnumValue
  
  var or: EnumValue
  
  var sum: EnumValue
  
  var sumLong: EnumValue
}
object Operator_ {
  
  inline def apply(
    addAll: EnumValue,
    and: EnumValue,
    assign: EnumValue,
    div: EnumValue,
    max: EnumValue,
    min: EnumValue,
    minus: EnumValue,
    mult: EnumValue,
    or: EnumValue,
    sum: EnumValue,
    sumLong: EnumValue
  ): Operator_ = {
    val __obj = js.Dynamic.literal(addAll = addAll.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minus = minus.asInstanceOf[js.Any], mult = mult.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], sumLong = sumLong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Operator_] (val x: Self) extends AnyVal {
    
    inline def setAddAll(value: EnumValue): Self = StObject.set(x, "addAll", value.asInstanceOf[js.Any])
    
    inline def setAnd(value: EnumValue): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAssign(value: EnumValue): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setDiv(value: EnumValue): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
    
    inline def setMax(value: EnumValue): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: EnumValue): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinus(value: EnumValue): Self = StObject.set(x, "minus", value.asInstanceOf[js.Any])
    
    inline def setMult(value: EnumValue): Self = StObject.set(x, "mult", value.asInstanceOf[js.Any])
    
    inline def setOr(value: EnumValue): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setSum(value: EnumValue): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumLong(value: EnumValue): Self = StObject.set(x, "sumLong", value.asInstanceOf[js.Any])
  }
}
