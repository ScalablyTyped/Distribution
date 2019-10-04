package typings.jsonDashRulesDashEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashRulesDashEngineMod {
  import typings.jsonDashRulesDashEngine.Anon_Key
  import typings.std.JSON

  type DefinitionFunction = js.Function2[/* params */ Anon_Key, /* almanac */ Almanac, Unit]
  type EngineEventFunction = js.Function3[/* event */ Event, /* almanac */ Almanac, /* ruleResult */ js.Object, Unit]
  type OperatorEvaluateFunction = js.Function2[/* factValue */ String, /* jsonValue */ JSON, Unit]
}
