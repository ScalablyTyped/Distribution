package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import typings.jsonDashRulesDashEngine.Anon_Key
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
    onFailure: (/* params */ Anon_Key, /* almanac */ Almanac) => Unit = null,
    onSuccess: (/* params */ Anon_Key, /* almanac */ Almanac) => Unit = null,
    priority: Int | Double = null
  ): RuleOptions = {
    val __obj = js.Dynamic.literal(conditions = conditions, events = events)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOptions]
  }
}

