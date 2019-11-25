package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import typings.jsonDashRulesDashEngine.Anon_Fact
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionProperties extends NestedCondition {
  var fact: String
  var operator: String
  var params: js.UndefOr[Record[String, _]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var value: Anon_Fact | js.Any
}

object ConditionProperties {
  @scala.inline
  def apply(
    fact: String,
    operator: String,
    value: Anon_Fact | js.Any,
    params: Record[String, _] = null,
    path: String = null,
    priority: Int | Double = null
  ): ConditionProperties = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionProperties]
  }
}

