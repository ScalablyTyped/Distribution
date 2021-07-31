package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Site Settings
  */
trait SchemaSiteSettings extends StObject {
  
  /**
    * Whether active view creatives are disabled for this site.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this site opts out of ad blocking. When true, ad blocking is
    * disabled for all placements under the site, regardless of the individual
    * placement settings. When false, the campaign and placement settings take
    * effect.
    */
  var adBlockingOptOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether new cookies are disabled for this site.
    */
  var disableNewCookie: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration settings for dynamic and image floodlight tags.
    */
  var tagSetting: js.UndefOr[SchemaTagSetting] = js.undefined
  
  /**
    * Whether Verification and ActiveView for in-stream video creatives are
    * disabled by default for new placements created under this site. This
    * value will be used to populate the placement.videoActiveViewOptOut field,
    * when no value is specified for the new placement.
    */
  var videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default VPAID adapter setting for new placements created under this site.
    * This value will be used to populate the placements.vpaidAdapterChoice
    * field, when no value is specified for the new placement. Controls which
    * VPAID format the measurement adapter will use for in-stream video
    * creatives assigned to the placement. The publisher&#39;s specifications
    * will typically determine this setting. For VPAID creatives, the adapter
    * format will match the VPAID format (HTML5 VPAID creatives use the HTML5
    * adapter).  Note: Flash is no longer supported. This field now defaults to
    * HTML5 when the following values are provided: FLASH, BOTH.
    */
  var vpaidAdapterChoiceTemplate: js.UndefOr[String] = js.undefined
}
object SchemaSiteSettings {
  
  @scala.inline
  def apply(): SchemaSiteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteSettings]
  }
  
  @scala.inline
  implicit class SchemaSiteSettingsMutableBuilder[Self <: SchemaSiteSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveViewOptOut(value: Boolean): Self = StObject.set(x, "activeViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveViewOptOutUndefined: Self = StObject.set(x, "activeViewOptOut", js.undefined)
    
    @scala.inline
    def setAdBlockingOptOut(value: Boolean): Self = StObject.set(x, "adBlockingOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdBlockingOptOutUndefined: Self = StObject.set(x, "adBlockingOptOut", js.undefined)
    
    @scala.inline
    def setDisableNewCookie(value: Boolean): Self = StObject.set(x, "disableNewCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNewCookieUndefined: Self = StObject.set(x, "disableNewCookie", js.undefined)
    
    @scala.inline
    def setTagSetting(value: SchemaTagSetting): Self = StObject.set(x, "tagSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSettingUndefined: Self = StObject.set(x, "tagSetting", js.undefined)
    
    @scala.inline
    def setVideoActiveViewOptOutTemplate(value: Boolean): Self = StObject.set(x, "videoActiveViewOptOutTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoActiveViewOptOutTemplateUndefined: Self = StObject.set(x, "videoActiveViewOptOutTemplate", js.undefined)
    
    @scala.inline
    def setVpaidAdapterChoiceTemplate(value: String): Self = StObject.set(x, "vpaidAdapterChoiceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpaidAdapterChoiceTemplateUndefined: Self = StObject.set(x, "vpaidAdapterChoiceTemplate", js.undefined)
  }
}
