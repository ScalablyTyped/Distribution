package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllConditions extends TopLevelCondition {
  
  var all: js.Array[NestedCondition] = js.native
}
object AllConditions {
  
  @scala.inline
  def apply(all: js.Array[NestedCondition]): AllConditions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllConditions]
  }
  
  @scala.inline
  implicit class AllConditionsOps[Self <: AllConditions] (val x: Self) extends AnyVal {
    
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
    def setAllVarargs(value: NestedCondition*): Self = this.set("all", js.Array(value :_*))
    
    @scala.inline
    def setAll(value: js.Array[NestedCondition]): Self = this.set("all", value.asInstanceOf[js.Any])
  }
}
