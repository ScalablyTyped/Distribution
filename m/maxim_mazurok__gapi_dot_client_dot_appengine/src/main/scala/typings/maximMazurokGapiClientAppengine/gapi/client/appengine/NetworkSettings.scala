package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkSettings extends js.Object {
  
  /** The ingress settings for version or service. */
  var ingressTrafficAllowed: js.UndefOr[String] = js.native
}
object NetworkSettings {
  
  @scala.inline
  def apply(): NetworkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkSettings]
  }
  
  @scala.inline
  implicit class NetworkSettingsOps[Self <: NetworkSettings] (val x: Self) extends AnyVal {
    
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
    def setIngressTrafficAllowed(value: String): Self = this.set("ingressTrafficAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngressTrafficAllowed: Self = this.set("ingressTrafficAllowed", js.undefined)
  }
}
