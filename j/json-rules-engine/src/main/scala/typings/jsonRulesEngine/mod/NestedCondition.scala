package typings.jsonRulesEngine.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonRulesEngine.mod.ConditionProperties
  - typings.jsonRulesEngine.mod.TopLevelCondition
*/
trait NestedCondition extends js.Object

object NestedCondition {
  @scala.inline
  def ConditionProperties(
    fact: String,
    operator: String,
    value: typings.jsonRulesEngine.anon.Fact | js.Any,
    params: Record[String, _] = null,
    path: String = null,
    priority: js.UndefOr[Double] = js.undefined
  ): NestedCondition = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedCondition]
  }
  @scala.inline
  def AllConditions(all: js.Array[NestedCondition]): NestedCondition = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedCondition]
  }
  @scala.inline
  def AnyConditions(any: js.Array[NestedCondition]): NestedCondition = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedCondition]
  }
}

