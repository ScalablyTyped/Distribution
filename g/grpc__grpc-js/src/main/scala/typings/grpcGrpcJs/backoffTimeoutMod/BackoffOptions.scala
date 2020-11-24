package typings.grpcGrpcJs.backoffTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackoffOptions extends js.Object {
  
  var initialDelay: js.UndefOr[Double] = js.native
  
  var jitter: js.UndefOr[Double] = js.native
  
  var maxDelay: js.UndefOr[Double] = js.native
  
  var multiplier: js.UndefOr[Double] = js.native
}
object BackoffOptions {
  
  @scala.inline
  def apply(): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackoffOptions]
  }
  
  @scala.inline
  implicit class BackoffOptionsOps[Self <: BackoffOptions] (val x: Self) extends AnyVal {
    
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
    def setInitialDelay(value: Double): Self = this.set("initialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDelay: Self = this.set("initialDelay", js.undefined)
    
    @scala.inline
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJitter: Self = this.set("jitter", js.undefined)
    
    @scala.inline
    def setMaxDelay(value: Double): Self = this.set("maxDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDelay: Self = this.set("maxDelay", js.undefined)
    
    @scala.inline
    def setMultiplier(value: Double): Self = this.set("multiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplier: Self = this.set("multiplier", js.undefined)
  }
}
