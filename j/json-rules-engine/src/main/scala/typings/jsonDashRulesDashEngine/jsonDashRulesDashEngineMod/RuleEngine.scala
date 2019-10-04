package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleEngine extends js.Object {
  var conditions: Conditions
  var event: Event
  var name: js.UndefOr[js.Array[_]] = js.undefined
  var onSuccess: js.UndefOr[js.Function2[/* evt */ Event, /* almanac */ Almanac, Unit]] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object RuleEngine {
  @scala.inline
  def apply(
    conditions: Conditions,
    event: Event,
    name: js.Array[_] = null,
    onSuccess: (/* evt */ Event, /* almanac */ Almanac) => Unit = null,
    priority: Int | Double = null
  ): RuleEngine = {
    val __obj = js.Dynamic.literal(conditions = conditions, event = event)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleEngine]
  }
}

