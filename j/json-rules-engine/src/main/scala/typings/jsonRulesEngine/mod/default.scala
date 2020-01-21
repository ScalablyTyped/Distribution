package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rules-engine", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(rules: js.Array[RuleProperties]): Engine = js.native
  def apply(rules: js.Array[RuleProperties], options: EngineOptions): Engine = js.native
}

