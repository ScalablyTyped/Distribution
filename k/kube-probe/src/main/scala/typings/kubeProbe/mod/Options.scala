package typings.kubeProbe.mod

import typings.overloadProtection.mod.ProtectionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var bypassProtection: js.UndefOr[Boolean] = js.native
  
  var livenessCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var livenessUrl: js.UndefOr[String] = js.native
  
  var protectionConfig: js.UndefOr[ProtectionConfig] = js.native
  
  var readinessCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var readinessUrl: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBypassProtection(value: Boolean): Self = this.set("bypassProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassProtection: Self = this.set("bypassProtection", js.undefined)
    
    @scala.inline
    def setLivenessCallback(value: () => Unit): Self = this.set("livenessCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLivenessCallback: Self = this.set("livenessCallback", js.undefined)
    
    @scala.inline
    def setLivenessUrl(value: String): Self = this.set("livenessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLivenessUrl: Self = this.set("livenessUrl", js.undefined)
    
    @scala.inline
    def setProtectionConfig(value: ProtectionConfig): Self = this.set("protectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectionConfig: Self = this.set("protectionConfig", js.undefined)
    
    @scala.inline
    def setReadinessCallback(value: () => Unit): Self = this.set("readinessCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReadinessCallback: Self = this.set("readinessCallback", js.undefined)
    
    @scala.inline
    def setReadinessUrl(value: String): Self = this.set("readinessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadinessUrl: Self = this.set("readinessUrl", js.undefined)
  }
}
