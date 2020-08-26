package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Required<json-rules-engine.json-rules-engine.RuleProperties>, 'conditions' | 'event' | 'name' | 'priority'> */
@js.native
trait RuleSerializable extends js.Object {
  var conditions: TopLevelCondition = js.native
  var event: Event = js.native
  var name: String = js.native
  var priority: Double = js.native
}

object RuleSerializable {
  @scala.inline
  def apply(conditions: TopLevelCondition, event: Event, name: String, priority: Double): RuleSerializable = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSerializable]
  }
  @scala.inline
  implicit class RuleSerializableOps[Self <: RuleSerializable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConditions(value: TopLevelCondition): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
  
}

