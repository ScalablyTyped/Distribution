package typings.jshamcrest.JsHamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BetweenBuilder extends js.Object {
  
  def and(end: js.Any): SimpleMatcher = js.native
}
object BetweenBuilder {
  
  @scala.inline
  def apply(and: js.Any => SimpleMatcher): BetweenBuilder = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and))
    __obj.asInstanceOf[BetweenBuilder]
  }
  
  @scala.inline
  implicit class BetweenBuilderOps[Self <: BetweenBuilder] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: js.Any => SimpleMatcher): Self = this.set("and", js.Any.fromFunction1(value))
  }
}
