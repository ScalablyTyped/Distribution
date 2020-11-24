package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StringDictionary
import typings.leafletRoutingMachine.anon.LegCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSRMOptions extends js.Object {
  
  var language: js.UndefOr[String] = js.native
  
  var polylinePrecision: js.UndefOr[Double] = js.native
  
  var profile: js.UndefOr[String] = js.native
  
  var requestParameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var routingOptions: js.UndefOr[js.Any] = js.native
  
  var serviceUrl: js.UndefOr[String] = js.native
  
  var stepToText: js.UndefOr[js.Function2[/* step */ js.Any, /* leg */ LegCount, _]] = js.native
  
  var suppressDemoServerWarning: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var useHints: js.UndefOr[Boolean] = js.native
}
object OSRMOptions {
  
  @scala.inline
  def apply(): OSRMOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSRMOptions]
  }
  
  @scala.inline
  implicit class OSRMOptionsOps[Self <: OSRMOptions] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setPolylinePrecision(value: Double): Self = this.set("polylinePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylinePrecision: Self = this.set("polylinePrecision", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setRequestParameters(value: StringDictionary[js.Any]): Self = this.set("requestParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestParameters: Self = this.set("requestParameters", js.undefined)
    
    @scala.inline
    def setRoutingOptions(value: js.Any): Self = this.set("routingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingOptions: Self = this.set("routingOptions", js.undefined)
    
    @scala.inline
    def setServiceUrl(value: String): Self = this.set("serviceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUrl: Self = this.set("serviceUrl", js.undefined)
    
    @scala.inline
    def setStepToText(value: (/* step */ js.Any, /* leg */ LegCount) => _): Self = this.set("stepToText", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStepToText: Self = this.set("stepToText", js.undefined)
    
    @scala.inline
    def setSuppressDemoServerWarning(value: Boolean): Self = this.set("suppressDemoServerWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressDemoServerWarning: Self = this.set("suppressDemoServerWarning", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUseHints(value: Boolean): Self = this.set("useHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHints: Self = this.set("useHints", js.undefined)
  }
}
