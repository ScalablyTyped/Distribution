package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rules-engine", "Fact")
@js.native
class Fact[T] protected () extends js.Object {
  def this(id: String, value: T) = this()
  def this(id: String, value: DynamicFactCallback[T]) = this()
  def this(id: String, value: T, options: FactOptions) = this()
  def this(id: String, value: DynamicFactCallback[T], options: FactOptions) = this()
  var calculationMethod: js.UndefOr[DynamicFactCallback[T]] = js.native
  var id: String = js.native
  var options: FactOptions = js.native
  var priority: Double = js.native
  var value: js.UndefOr[T] = js.native
}

