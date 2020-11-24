package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleProperties extends js.Object {
  
  var conditions: TopLevelCondition = js.native
  
  var event: Event = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onFailure: js.UndefOr[EventHandler] = js.native
  
  var onSuccess: js.UndefOr[EventHandler] = js.native
  
  var priority: js.UndefOr[Double] = js.native
}
object RuleProperties {
  
  @scala.inline
  def apply(conditions: TopLevelCondition, event: Event): RuleProperties = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleProperties]
  }
  
  @scala.inline
  implicit class RulePropertiesOps[Self <: RuleProperties] (val x: Self) extends AnyVal {
    
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
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnFailure(value: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Unit): Self = this.set("onFailure", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Unit): Self = this.set("onSuccess", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
