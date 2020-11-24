package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserSdfConfig extends js.Object {
  
  /**
    * Whether or not this advertiser overrides the SDF configuration of its parent partner. By default, an advertiser inherits the SDF configuration from the parent partner. To override
    * the partner configuration, set this field to `true` and provide the new configuration in sdfConfig.
    */
  var overridePartnerSdfConfig: js.UndefOr[Boolean] = js.native
  
  /** The SDF configuration for the advertiser. * Required when overridePartnerSdfConfig is `true`. * Output only when overridePartnerSdfConfig is `false`. */
  var sdfConfig: js.UndefOr[SdfConfig] = js.native
}
object AdvertiserSdfConfig {
  
  @scala.inline
  def apply(): AdvertiserSdfConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserSdfConfig]
  }
  
  @scala.inline
  implicit class AdvertiserSdfConfigOps[Self <: AdvertiserSdfConfig] (val x: Self) extends AnyVal {
    
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
    def setOverridePartnerSdfConfig(value: Boolean): Self = this.set("overridePartnerSdfConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverridePartnerSdfConfig: Self = this.set("overridePartnerSdfConfig", js.undefined)
    
    @scala.inline
    def setSdfConfig(value: SdfConfig): Self = this.set("sdfConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdfConfig: Self = this.set("sdfConfig", js.undefined)
  }
}
