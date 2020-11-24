package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyConditions extends TopLevelCondition {
  
  var any: js.Array[NestedCondition] = js.native
}
object AnyConditions {
  
  @scala.inline
  def apply(any: js.Array[NestedCondition]): AnyConditions = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyConditions]
  }
  
  @scala.inline
  implicit class AnyConditionsOps[Self <: AnyConditions] (val x: Self) extends AnyVal {
    
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
    def setAnyVarargs(value: NestedCondition*): Self = this.set("any", js.Array(value :_*))
    
    @scala.inline
    def setAny(value: js.Array[NestedCondition]): Self = this.set("any", value.asInstanceOf[js.Any])
  }
}
