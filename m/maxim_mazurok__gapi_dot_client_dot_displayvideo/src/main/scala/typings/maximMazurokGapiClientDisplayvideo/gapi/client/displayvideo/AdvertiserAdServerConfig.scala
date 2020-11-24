package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserAdServerConfig extends js.Object {
  
  /** The configuration for advertisers that use both Campaign Manager 360 (CM360) and third-party ad servers. */
  var cmHybridConfig: js.UndefOr[CmHybridConfig] = js.native
  
  /** The configuration for advertisers that use third-party ad servers only. */
  var thirdPartyOnlyConfig: js.UndefOr[ThirdPartyOnlyConfig] = js.native
}
object AdvertiserAdServerConfig {
  
  @scala.inline
  def apply(): AdvertiserAdServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserAdServerConfig]
  }
  
  @scala.inline
  implicit class AdvertiserAdServerConfigOps[Self <: AdvertiserAdServerConfig] (val x: Self) extends AnyVal {
    
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
    def setCmHybridConfig(value: CmHybridConfig): Self = this.set("cmHybridConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmHybridConfig: Self = this.set("cmHybridConfig", js.undefined)
    
    @scala.inline
    def setThirdPartyOnlyConfig(value: ThirdPartyOnlyConfig): Self = this.set("thirdPartyOnlyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyOnlyConfig: Self = this.set("thirdPartyOnlyConfig", js.undefined)
  }
}
