package typings.gremlin.mod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operator_ extends js.Object {
  
  var addall: EnumValue = js.native
  
  var and: EnumValue = js.native
  
  var assign: EnumValue = js.native
  
  var div: EnumValue = js.native
  
  var max: EnumValue = js.native
  
  var min: EnumValue = js.native
  
  var minus: EnumValue = js.native
  
  var mult: EnumValue = js.native
  
  var or: EnumValue = js.native
  
  var sum: EnumValue = js.native
  
  var sumlong: EnumValue = js.native
}
object Operator_ {
  
  @scala.inline
  def apply(
    addall: EnumValue,
    and: EnumValue,
    assign: EnumValue,
    div: EnumValue,
    max: EnumValue,
    min: EnumValue,
    minus: EnumValue,
    mult: EnumValue,
    or: EnumValue,
    sum: EnumValue,
    sumlong: EnumValue
  ): Operator_ = {
    val __obj = js.Dynamic.literal(addall = addall.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minus = minus.asInstanceOf[js.Any], mult = mult.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], sumlong = sumlong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator_]
  }
  
  @scala.inline
  implicit class Operator_Ops[Self <: Operator_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddall(value: EnumValue): Self = this.set("addall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnd(value: EnumValue): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssign(value: EnumValue): Self = this.set("assign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiv(value: EnumValue): Self = this.set("div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: EnumValue): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: EnumValue): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinus(value: EnumValue): Self = this.set("minus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMult(value: EnumValue): Self = this.set("mult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOr(value: EnumValue): Self = this.set("or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: EnumValue): Self = this.set("sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumlong(value: EnumValue): Self = this.set("sumlong", value.asInstanceOf[js.Any])
  }
}
