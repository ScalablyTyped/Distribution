package typings.gremlin.mod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.P")
@js.native
class P protected () extends js.Object {
  def this(operator: EnumValue, value: js.Any) = this()
  def this(operator: EnumValue, value: js.Any, other: js.Any) = this()
  
  def and(): P = js.native
  def and(arg: js.Any): P = js.native
  
  def or(): P = js.native
  def or(arg: js.Any): P = js.native
}
/* static members */
@JSImport("gremlin", "process.P")
@js.native
object P extends js.Object {
  
  def between(args: js.Any*): P = js.native
  
  def eq(args: js.Any*): P = js.native
  
  def gt(args: js.Any*): P = js.native
  
  def gte(args: js.Any*): P = js.native
  
  def inside(args: js.Any*): P = js.native
  
  def lt(args: js.Any*): P = js.native
  
  def lte(args: js.Any*): P = js.native
  
  def neq(args: js.Any*): P = js.native
  
  def not(args: js.Any*): P = js.native
  
  def outside(args: js.Any*): P = js.native
  
  def test(args: js.Any*): P = js.native
  
  def within(args: js.Any*): P = js.native
  
  def without(args: js.Any*): P = js.native
}
