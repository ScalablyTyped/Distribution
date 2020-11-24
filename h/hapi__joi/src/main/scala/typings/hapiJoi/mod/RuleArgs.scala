package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleArgs extends js.Object {
  
  var assert: js.UndefOr[(js.Function1[/* value */ js.Any, Boolean]) | AnySchema] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  /**
    * Undocumented properties
    */
  var normalize: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  var ref: js.UndefOr[Boolean] = js.native
}
object RuleArgs {
  
  @scala.inline
  def apply(name: String): RuleArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleArgs]
  }
  
  @scala.inline
  implicit class RuleArgsOps[Self <: RuleArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertFunction1(value: /* value */ js.Any => Boolean): Self = this.set("assert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssert(value: (js.Function1[/* value */ js.Any, Boolean]) | AnySchema): Self = this.set("assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssert: Self = this.set("assert", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setNormalize(value: /* value */ js.Any => _): Self = this.set("normalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setRef(value: Boolean): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
}
