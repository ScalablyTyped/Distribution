package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.contains
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.doesNotContain
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.equal
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.greaterThan
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.greaterThanInclusive
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.in
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.lessThan
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.lessthanInclusive
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.notEqual
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.notIn
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rules-engine", "Rule")
@js.native
class Rule protected () extends js.Object {
  def this(options: RuleOptions) = this()
  def this(options: JSON) = this()
  var fact: String = js.native
  var operator: equal | notEqual | lessThan | lessthanInclusive | greaterThan | greaterThanInclusive | in | notIn | contains | doesNotContain = js.native
  var path: js.UndefOr[String] = js.native
  var setConditions: js.UndefOr[js.Function1[/* conditions */ Conditions, Unit]] = js.native
  var setEvent: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var setPriority: js.UndefOr[js.Function1[/* priority */ Double, Unit]] = js.native
  var toJSON: js.UndefOr[js.Function1[/* stringify */ js.UndefOr[Boolean], Unit]] = js.native
  var value: Double | String | (js.Array[Double | String]) = js.native
}

