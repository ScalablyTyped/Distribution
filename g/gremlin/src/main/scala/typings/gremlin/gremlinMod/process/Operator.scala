package typings.gremlin.gremlinMod.process

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator extends js.Object {
  var addall: EnumValue
  var and: EnumValue
  var assign: EnumValue
  var div: EnumValue
  var max: EnumValue
  var min: EnumValue
  var minus: EnumValue
  var mult: EnumValue
  var or: EnumValue
  var sum: EnumValue
  var sumlong: EnumValue
}

object Operator {
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
  ): Operator = {
    val __obj = js.Dynamic.literal(addall = addall, and = and, assign = assign, div = div, max = max, min = min, minus = minus, mult = mult, or = or, sum = sum, sumlong = sumlong)
  
    __obj.asInstanceOf[Operator]
  }
}

@JSImport("gremlin", "process.operator")
@js.native
object operator extends TopLevel[Operator]

