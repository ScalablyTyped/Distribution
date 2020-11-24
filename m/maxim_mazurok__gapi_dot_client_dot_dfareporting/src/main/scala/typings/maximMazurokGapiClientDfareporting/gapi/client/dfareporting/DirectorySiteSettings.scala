package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectorySiteSettings extends js.Object {
  
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
  implicit class DirectorySiteSettingsOps[Self <: DirectorySiteSettings] (val x: Self) extends AnyVal {
    
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
    def setActiveViewOptOut(value: Boolean): Self = this.set("activeViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveViewOptOut: Self = this.set("activeViewOptOut", js.undefined)
    
    @scala.inline
    def setDfpSettings(value: DfpSettings): Self = this.set("dfpSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDfpSettings: Self = this.set("dfpSettings", js.undefined)
    
    @scala.inline
    def setInstreamVideoPlacementAccepted(value: Boolean): Self = this.set("instreamVideoPlacementAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstreamVideoPlacementAccepted: Self = this.set("instreamVideoPlacementAccepted", js.undefined)
    
    @scala.inline
    def setInterstitialPlacementAccepted(value: Boolean): Self = this.set("interstitialPlacementAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterstitialPlacementAccepted: Self = this.set("interstitialPlacementAccepted", js.undefined)
  }
}
