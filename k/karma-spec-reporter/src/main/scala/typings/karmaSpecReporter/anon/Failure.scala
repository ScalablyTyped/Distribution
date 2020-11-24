package typings.karmaSpecReporter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Failure extends js.Object {
  
  var failure: js.UndefOr[String] = js.native
  
  var skipped: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[String] = js.native
}
object Failure {
  
  @scala.inline
  def apply(): Failure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Failure]
  }
  
  @scala.inline
  implicit class FailureOps[Self <: Failure] (val x: Self) extends AnyVal {
    
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
    def setFailure(value: String): Self = this.set("failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    
    @scala.inline
    def setSkipped(value: String): Self = this.set("skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipped: Self = this.set("skipped", js.undefined)
    
    @scala.inline
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
