package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleOptions extends js.Object {
  var conditions: Conditions
  var events: js.Array[Event]
  var name: js.UndefOr[js.Array[_]] = js.undefined
  var onFailure: js.UndefOr[DefinitionFunction] = js.undefined
  var onSuccess: js.UndefOr[DefinitionFunction] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object RuleOptions {
  @scala.inline
  def apply(
    conditions: Conditions,
    events: js.Array[Event],
    name: js.Array[_] = null,
    onFailure: DefinitionFunction = null,
    onSuccess: DefinitionFunction = null,
    priority: Int | Double = null
  ): RuleOptions = {
    val __obj = js.Dynamic.literal(conditions = conditions, events = events)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOptions]
  }
}

