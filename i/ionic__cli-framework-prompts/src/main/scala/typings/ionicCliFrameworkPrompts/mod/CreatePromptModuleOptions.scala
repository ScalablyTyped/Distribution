package typings.ionicCliFrameworkPrompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePromptModuleOptions extends js.Object {
  
  val interactive: js.UndefOr[Boolean] = js.native
  
  val onFallback: js.UndefOr[js.Function1[/* question */ PromptQuestion, PromptValue | Unit]] = js.native
}
object CreatePromptModuleOptions {
  
  @scala.inline
  def apply(): CreatePromptModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePromptModuleOptions]
  }
  
  @scala.inline
  implicit class CreatePromptModuleOptionsOps[Self <: CreatePromptModuleOptions] (val x: Self) extends AnyVal {
    
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
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setOnFallback(value: /* question */ PromptQuestion => PromptValue | Unit): Self = this.set("onFallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFallback: Self = this.set("onFallback", js.undefined)
  }
}
