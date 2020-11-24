package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationGroup extends js.Object {
  
  var errors: js.UndefOr[KnockoutValidationErrors] = js.native
  
  var isAnyMessageShown: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
}
object KnockoutValidationGroup {
  
  @scala.inline
  def apply(): KnockoutValidationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationGroup]
  }
  
  @scala.inline
  implicit class KnockoutValidationGroupOps[Self <: KnockoutValidationGroup] (val x: Self) extends AnyVal {
    
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
    def setErrors(value: KnockoutValidationErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setIsAnyMessageShown(value: () => Boolean): Self = this.set("isAnyMessageShown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsAnyMessageShown: Self = this.set("isAnyMessageShown", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
  }
}
