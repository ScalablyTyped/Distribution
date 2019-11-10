package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleProperties extends js.Object {
  var conditions: TopLevelCondition
  var event: Event
  var name: js.UndefOr[String] = js.undefined
  var onFailure: js.UndefOr[EventHandler] = js.undefined
  var onSuccess: js.UndefOr[EventHandler] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object RuleProperties {
  @scala.inline
  def apply(
    conditions: TopLevelCondition,
    event: Event,
    name: String = null,
    onFailure: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Unit = null,
    onSuccess: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Unit = null,
    priority: Int | Double = null
  ): RuleProperties = {
    val __obj = js.Dynamic.literal(conditions = conditions, event = event)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction3(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction3(onSuccess))
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleProperties]
  }
}

