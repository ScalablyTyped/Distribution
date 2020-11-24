package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerListConfigurationsResponse extends js.Object {
  
  /** The configurations. */
  var configurations: js.UndefOr[js.Array[Configuration]] = js.native
}
object CustomerListConfigurationsResponse {
  
  @scala.inline
  def apply(): CustomerListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerListConfigurationsResponse]
  }
  
  @scala.inline
  implicit class CustomerListConfigurationsResponseOps[Self <: CustomerListConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setConfigurationsVarargs(value: Configuration*): Self = this.set("configurations", js.Array(value :_*))
    
    @scala.inline
    def setConfigurations(value: js.Array[Configuration]): Self = this.set("configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurations: Self = this.set("configurations", js.undefined)
  }
}
