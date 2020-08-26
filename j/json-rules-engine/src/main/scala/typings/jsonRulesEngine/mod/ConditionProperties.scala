package typings.jsonRulesEngine.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionProperties extends NestedCondition {
  var fact: String = js.native
  var operator: String = js.native
  var params: js.UndefOr[Record[String, _]] = js.native
  var path: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Double] = js.native
  var value: typings.jsonRulesEngine.anon.Fact | js.Any = js.native
}

object ConditionProperties {
  @scala.inline
  def apply(fact: String, operator: String, value: typings.jsonRulesEngine.anon.Fact | js.Any): ConditionProperties = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionProperties]
  }
  @scala.inline
  implicit class ConditionPropertiesOps[Self <: ConditionProperties] (val x: Self) extends AnyVal {
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
    def setFact(value: String): Self = this.set("fact", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: typings.jsonRulesEngine.anon.Fact | js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: Record[String, _]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

