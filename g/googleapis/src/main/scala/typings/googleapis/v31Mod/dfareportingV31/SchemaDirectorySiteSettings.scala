package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directory Site Settings
  */
@js.native
trait SchemaDirectorySiteSettings extends js.Object {
  
  /**
    * Whether this directory site has disabled active view creatives.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  
  /**
    * Directory site Ad Manager settings.
    */
  var dfpSettings: js.UndefOr[SchemaDfpSettings] = js.native
  
  /**
    * Whether this site accepts in-stream video ads.
    */
  var instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this site accepts interstitial ads.
    */
  var interstitialPlacementAccepted: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this directory site has disabled Nielsen OCR reach ratings.
    */
  var nielsenOcrOptOut: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this directory site has disabled generation of Verification ins
    * tags.
    */
  var verificationTagOptOut: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this directory site has disabled active view for in-stream video
    * creatives. This is a read-only field.
    */
  var videoActiveViewOptOut: js.UndefOr[Boolean] = js.native
}
object SchemaDirectorySiteSettings {
  
  @scala.inline
  def apply(): SchemaDirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteSettings]
  }
  
  @scala.inline
  implicit class SchemaDirectorySiteSettingsOps[Self <: SchemaDirectorySiteSettings] (val x: Self) extends AnyVal {
    
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
    def setDfpSettings(value: SchemaDfpSettings): Self = this.set("dfpSettings", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setNielsenOcrOptOut(value: Boolean): Self = this.set("nielsenOcrOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenOcrOptOut: Self = this.set("nielsenOcrOptOut", js.undefined)
    
    @scala.inline
    def setVerificationTagOptOut(value: Boolean): Self = this.set("verificationTagOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationTagOptOut: Self = this.set("verificationTagOptOut", js.undefined)
    
    @scala.inline
    def setVideoActiveViewOptOut(value: Boolean): Self = this.set("videoActiveViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoActiveViewOptOut: Self = this.set("videoActiveViewOptOut", js.undefined)
  }
}
