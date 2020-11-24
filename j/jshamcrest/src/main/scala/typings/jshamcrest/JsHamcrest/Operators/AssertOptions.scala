package typings.jshamcrest.JsHamcrest.Operators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the options accepted by assert().
  */
@js.native
trait AssertOptions extends js.Object {
  
  var fail: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.native
  
  var message: js.UndefOr[js.Any] = js.native
  
  var pass: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.native
}
object AssertOptions {
  
  @scala.inline
  def apply(): AssertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertOptions]
  }
  
  @scala.inline
  implicit class AssertOptionsOps[Self <: AssertOptions] (val x: Self) extends AnyVal {
    
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
    def setFail(value: /* description */ String => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setPass(value: /* description */ String => Unit): Self = this.set("pass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
  }
}
