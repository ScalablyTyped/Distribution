package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectorySiteSettings extends StObject {
  
  /** Whether this directory site has disabled active view creatives. */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  
  /** Directory site Ad Manager settings. */
  var dfpSettings: js.UndefOr[DfpSettings] = js.native
  
  /** Whether this site accepts in-stream video ads. */
  var instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.native
  
  /** Whether this site accepts interstitial ads. */
  var interstitialPlacementAccepted: js.UndefOr[Boolean] = js.native
}
object DirectorySiteSettings {
  
  @scala.inline
  def apply(): DirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySiteSettings]
  }
  
  @scala.inline
  implicit class DirectorySiteSettingsMutableBuilder[Self <: DirectorySiteSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveViewOptOut(value: Boolean): Self = StObject.set(x, "activeViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveViewOptOutUndefined: Self = StObject.set(x, "activeViewOptOut", js.undefined)
    
    @scala.inline
    def setDfpSettings(value: DfpSettings): Self = StObject.set(x, "dfpSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfpSettingsUndefined: Self = StObject.set(x, "dfpSettings", js.undefined)
    
    @scala.inline
    def setInstreamVideoPlacementAccepted(value: Boolean): Self = StObject.set(x, "instreamVideoPlacementAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstreamVideoPlacementAcceptedUndefined: Self = StObject.set(x, "instreamVideoPlacementAccepted", js.undefined)
    
    @scala.inline
    def setInterstitialPlacementAccepted(value: Boolean): Self = StObject.set(x, "interstitialPlacementAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterstitialPlacementAcceptedUndefined: Self = StObject.set(x, "interstitialPlacementAccepted", js.undefined)
  }
}
