package typings.jsonRulesEngine.mod

import typings.jsonRulesEngine.jsonRulesEngineStrings.failure
import typings.jsonRulesEngine.jsonRulesEngineStrings.success
import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rules-engine", "Engine")
@js.native
class Engine () extends js.Object {
  def this(rules: js.Array[RuleProperties]) = this()
  def this(rules: js.Array[RuleProperties], options: EngineOptions) = this()
  def addFact[T](fact: Fact[T]): this.type = js.native
  def addFact[T](id: String, valueCallback: T): this.type = js.native
  def addFact[T](id: String, valueCallback: T, options: FactOptions): this.type = js.native
  def addFact[T](id: String, valueCallback: DynamicFactCallback[T]): this.type = js.native
  def addFact[T](id: String, valueCallback: DynamicFactCallback[T], options: FactOptions): this.type = js.native
  def addOperator(operator: Operator[_, _]): Map[String, Operator[_, _]] = js.native
  def addOperator[A, B](operatorName: String, callback: OperatorEvaluator[A, B]): Map[String, Operator[_, _]] = js.native
  def addRule(rule: RuleProperties): this.type = js.native
  def getFact[T](factId: String): Fact[T] = js.native
  def on(eventName: String, handler: EventHandler): this.type = js.native
  @JSName("on")
  def on_failure(eventName: failure, handler: EventHandler): this.type = js.native
  @JSName("on")
  def on_success(eventName: success, handler: EventHandler): this.type = js.native
  def removeFact(factOrId: String): Boolean = js.native
  def removeFact(factOrId: Fact[_]): Boolean = js.native
  def removeOperator(operator: String): Boolean = js.native
  def removeOperator(operator: Operator[_, _]): Boolean = js.native
  def removeRule(rule: Rule): Boolean = js.native
  def run(): js.Promise[EngineResult] = js.native
  def run(facts: Record[String, _]): js.Promise[EngineResult] = js.native
  def stop(): this.type = js.native
}

