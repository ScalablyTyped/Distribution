package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserSdfConfig extends StObject {
  
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
  implicit class AdvertiserSdfConfigMutableBuilder[Self <: AdvertiserSdfConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverridePartnerSdfConfig(value: Boolean): Self = StObject.set(x, "overridePartnerSdfConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridePartnerSdfConfigUndefined: Self = StObject.set(x, "overridePartnerSdfConfig", js.undefined)
    
    @scala.inline
    def setSdfConfig(value: SdfConfig): Self = StObject.set(x, "sdfConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdfConfigUndefined: Self = StObject.set(x, "sdfConfig", js.undefined)
  }
}
