package typings.jsonRulesEngine.mod

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
  var value: typings.jsonRulesEngine.anon.Fact | js.Any
}

object ConditionProperties {
  @scala.inline
  def apply(
    fact: String,
    operator: String,
    value: typings.jsonRulesEngine.anon.Fact | js.Any,
    params: Record[String, _] = null,
    path: String = null,
    priority: js.UndefOr[Double] = js.undefined
  ): ConditionProperties = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionProperties]
  }
}

