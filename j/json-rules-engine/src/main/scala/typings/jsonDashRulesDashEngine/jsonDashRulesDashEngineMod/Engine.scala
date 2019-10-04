package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.failure
import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rules-engine", "Engine")
@js.native
class Engine () extends js.Object {
  def this(rules: js.Array[Rule]) = this()
  def this(rules: js.Array[Rule], options: EngineOptions) = this()
  def addFact(id: String, definitionFunc: DefinitionFunction, options: FactOptions): Unit = js.native
  def addOperator(name: String, definitionFunc: OperatorEvaluateFunction): Unit = js.native
  def addRule(rules: RuleEngine): Unit = js.native
  @JSName("on")
  def on_failure(eventName: failure, engineEvent: EngineEventFunction): Unit = js.native
  @JSName("on")
  def on_success(eventName: success, engineEvent: EngineEventFunction): Unit = js.native
  def removeFact(id: String): Unit = js.native
  def removeOperator(id: String): Unit = js.native
  def removeRule(rule: Rule): Unit = js.native
  def run(facts: js.Object): js.Promise[EngineResult] = js.native
  def stop(): Engine = js.native
}

