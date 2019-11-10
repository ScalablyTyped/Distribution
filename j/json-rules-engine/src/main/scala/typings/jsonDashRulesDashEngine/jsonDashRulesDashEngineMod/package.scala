package typings.jsonDashRulesDashEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashRulesDashEngineMod {
  import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.conditions
  import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.event
  import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.name
  import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.priority
  import typings.std.Pick
  import typings.std.Record
  import typings.std.Required

  type DynamicFactCallback[T] = js.Function2[/* params */ Record[String, js.Any], /* almanac */ Almanac, T]
  type EventHandler = js.Function3[/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult, Unit]
  type OperatorEvaluator[A, B] = js.Function2[/* factValue */ A, /* compareToValue */ B, Boolean]
  type RuleSerializable = Pick[Required[RuleProperties], conditions | event | name | priority]
}
