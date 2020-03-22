package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Required<json-rules-engine.json-rules-engine.RuleProperties>, 'conditions' | 'event' | 'name' | 'priority'> */
trait RuleSerializable extends js.Object {
  var conditions: TopLevelCondition
  var event: Event
  var name: String
  var priority: Double
}

object RuleSerializable {
  @scala.inline
  def apply(conditions: TopLevelCondition, event: Event, name: String, priority: Double): RuleSerializable = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuleSerializable]
  }
}

