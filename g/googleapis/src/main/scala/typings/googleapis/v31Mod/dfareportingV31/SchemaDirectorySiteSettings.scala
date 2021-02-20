package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directory Site Settings
  */
@js.native
trait SchemaDirectorySiteSettings extends StObject {
  
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
  implicit class SchemaDirectorySiteSettingsMutableBuilder[Self <: SchemaDirectorySiteSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveViewOptOut(value: Boolean): Self = StObject.set(x, "activeViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveViewOptOutUndefined: Self = StObject.set(x, "activeViewOptOut", js.undefined)
    
    @scala.inline
    def setDfpSettings(value: SchemaDfpSettings): Self = StObject.set(x, "dfpSettings", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setNielsenOcrOptOut(value: Boolean): Self = StObject.set(x, "nielsenOcrOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNielsenOcrOptOutUndefined: Self = StObject.set(x, "nielsenOcrOptOut", js.undefined)
    
    @scala.inline
    def setVerificationTagOptOut(value: Boolean): Self = StObject.set(x, "verificationTagOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationTagOptOutUndefined: Self = StObject.set(x, "verificationTagOptOut", js.undefined)
    
    @scala.inline
    def setVideoActiveViewOptOut(value: Boolean): Self = StObject.set(x, "videoActiveViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoActiveViewOptOutUndefined: Self = StObject.set(x, "videoActiveViewOptOut", js.undefined)
  }
}
