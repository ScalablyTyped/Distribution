package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.`success-events`
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Almanac extends js.Object {
  var allowUndefinedFacts: Boolean
  var factMap: Map[String | `success-events`, Event]
  var factResultCache: Map[Double, js.Promise[Event]]
  def addRuntimeFact(factId: String, value: js.Any): Unit
  def factValue(fact: js.Object, params: js.Object, path: String): js.Promise[Unit]
}

object Almanac {
  @scala.inline
  def apply(
    addRuntimeFact: (String, js.Any) => Unit,
    allowUndefinedFacts: Boolean,
    factMap: Map[String | `success-events`, Event],
    factResultCache: Map[Double, js.Promise[Event]],
    factValue: (js.Object, js.Object, String) => js.Promise[Unit]
  ): Almanac = {
    val __obj = js.Dynamic.literal(addRuntimeFact = js.Any.fromFunction2(addRuntimeFact), allowUndefinedFacts = allowUndefinedFacts, factMap = factMap, factResultCache = factResultCache, factValue = js.Any.fromFunction3(factValue))
  
    __obj.asInstanceOf[Almanac]
  }
}

