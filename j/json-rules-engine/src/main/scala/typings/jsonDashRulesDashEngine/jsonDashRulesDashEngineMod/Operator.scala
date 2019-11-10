package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rules-engine", "Operator")
@js.native
class Operator[A, B] protected () extends js.Object {
  def this(name: String, evaluator: OperatorEvaluator[A, B]) = this()
  def this(
    name: String,
    evaluator: OperatorEvaluator[A, B],
    validator: js.Function1[/* factValue */ A, Boolean]
  ) = this()
  var name: String = js.native
}

