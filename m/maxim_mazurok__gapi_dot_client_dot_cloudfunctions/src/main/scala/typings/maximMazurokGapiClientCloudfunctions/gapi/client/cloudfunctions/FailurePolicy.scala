package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailurePolicy extends js.Object {
  
  /** If specified, then the function will be retried in case of a failure. */
  var retry: js.UndefOr[js.Any] = js.native
}
object FailurePolicy {
  
  @scala.inline
  def apply(): FailurePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailurePolicy]
  }
  
  @scala.inline
  implicit class FailurePolicyOps[Self <: FailurePolicy] (val x: Self) extends AnyVal {
    
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
    def setRetry(value: js.Any): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
  }
}
