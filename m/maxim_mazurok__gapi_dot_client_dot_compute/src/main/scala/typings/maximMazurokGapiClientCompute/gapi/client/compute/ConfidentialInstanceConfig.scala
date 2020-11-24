package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfidentialInstanceConfig extends js.Object {
  
  /** Defines whether the instance should have confidential compute enabled. */
  var enableConfidentialCompute: js.UndefOr[Boolean] = js.native
}
object ConfidentialInstanceConfig {
  
  @scala.inline
  def apply(): ConfidentialInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfidentialInstanceConfig]
  }
  
  @scala.inline
  implicit class ConfidentialInstanceConfigOps[Self <: ConfidentialInstanceConfig] (val x: Self) extends AnyVal {
    
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
    def setEnableConfidentialCompute(value: Boolean): Self = this.set("enableConfidentialCompute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableConfidentialCompute: Self = this.set("enableConfidentialCompute", js.undefined)
  }
}
