package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseCarouselMediaItem extends StObject {
  
  var ad_action: js.UndefOr[String] = js.undefined
  
  var ad_link_type: js.UndefOr[Double] = js.undefined
  
  var ad_metadata: js.UndefOr[js.Array[TimelineFeedResponseAdMetadataItem]] = js.undefined
  
  var android_links: js.UndefOr[js.Array[TimelineFeedResponseAndroidLinksItem]] = js.undefined
  
  var carousel_parent_id: String
  
  var dominant_color: js.UndefOr[String] = js.undefined
  
  var force_overlay: js.UndefOr[Boolean] = js.undefined
  
  var headline: js.UndefOr[TimelineFeedResponseHeadline] = js.undefined
  
  var hide_nux_text: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var image_versions2: TimelineFeedResponseImageVersions2
  
  var link: js.UndefOr[String] = js.undefined
  
  var link_hint_text: js.UndefOr[String] = js.undefined
  
  var link_text: js.UndefOr[String] = js.undefined
  
  var media_type: Double
  
  var original_height: Double
  
  var original_width: Double
  
  var overlay_subtitle: js.UndefOr[String] = js.undefined
  
  var overlay_text: js.UndefOr[String] = js.undefined
  
  var overlay_title: js.UndefOr[String] = js.undefined
  
  var pk: String
  
  var usertags: js.UndefOr[TimelineFeedResponseUsertags] = js.undefined
  
  var video_subtitles_uri: js.UndefOr[Null] = js.undefined
}
object TimelineFeedResponseCarouselMediaItem {
  
  @scala.inline
  def apply(
    carousel_parent_id: String,
    id: String,
    image_versions2: TimelineFeedResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String
  ): TimelineFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseCarouselMediaItem]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseCarouselMediaItemMutableBuilder[Self <: TimelineFeedResponseCarouselMediaItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAd_action(value: String): Self = StObject.set(x, "ad_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAd_actionUndefined: Self = StObject.set(x, "ad_action", js.undefined)
    
    @scala.inline
    def setAd_link_type(value: Double): Self = StObject.set(x, "ad_link_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAd_link_typeUndefined: Self = StObject.set(x, "ad_link_type", js.undefined)
    
    @scala.inline
    def setAd_metadata(value: js.Array[TimelineFeedResponseAdMetadataItem]): Self = StObject.set(x, "ad_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAd_metadataUndefined: Self = StObject.set(x, "ad_metadata", js.undefined)
    
    @scala.inline
    def setAd_metadataVarargs(value: TimelineFeedResponseAdMetadataItem*): Self = StObject.set(x, "ad_metadata", js.Array(value :_*))
    
    @scala.inline
    def setAndroid_links(value: js.Array[TimelineFeedResponseAndroidLinksItem]): Self = StObject.set(x, "android_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid_linksUndefined: Self = StObject.set(x, "android_links", js.undefined)
    
    @scala.inline
    def setAndroid_linksVarargs(value: TimelineFeedResponseAndroidLinksItem*): Self = StObject.set(x, "android_links", js.Array(value :_*))
    
    @scala.inline
    def setCarousel_parent_id(value: String): Self = StObject.set(x, "carousel_parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominant_color(value: String): Self = StObject.set(x, "dominant_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominant_colorUndefined: Self = StObject.set(x, "dominant_color", js.undefined)
    
    @scala.inline
    def setForce_overlay(value: Boolean): Self = StObject.set(x, "force_overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce_overlayUndefined: Self = StObject.set(x, "force_overlay", js.undefined)
    
    @scala.inline
    def setHeadline(value: TimelineFeedResponseHeadline): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    @scala.inline
    def setHide_nux_text(value: Boolean): Self = StObject.set(x, "hide_nux_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_nux_textUndefined: Self = StObject.set(x, "hide_nux_text", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: TimelineFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLink_hint_text(value: String): Self = StObject.set(x, "link_hint_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_hint_textUndefined: Self = StObject.set(x, "link_hint_text", js.undefined)
    
    @scala.inline
    def setLink_text(value: String): Self = StObject.set(x, "link_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_textUndefined: Self = StObject.set(x, "link_text", js.undefined)
    
    @scala.inline
    def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay_subtitle(value: String): Self = StObject.set(x, "overlay_subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay_subtitleUndefined: Self = StObject.set(x, "overlay_subtitle", js.undefined)
    
    @scala.inline
    def setOverlay_text(value: String): Self = StObject.set(x, "overlay_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay_textUndefined: Self = StObject.set(x, "overlay_text", js.undefined)
    
    @scala.inline
    def setOverlay_title(value: String): Self = StObject.set(x, "overlay_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay_titleUndefined: Self = StObject.set(x, "overlay_title", js.undefined)
    
    @scala.inline
    def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertags(value: TimelineFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
  }
}
