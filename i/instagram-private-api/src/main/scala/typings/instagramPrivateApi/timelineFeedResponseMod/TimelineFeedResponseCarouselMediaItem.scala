package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseCarouselMediaItem extends js.Object {
  
  var ad_action: js.UndefOr[String] = js.native
  
  var ad_link_type: js.UndefOr[Double] = js.native
  
  var ad_metadata: js.UndefOr[js.Array[TimelineFeedResponseAdMetadataItem]] = js.native
  
  var android_links: js.UndefOr[js.Array[TimelineFeedResponseAndroidLinksItem]] = js.native
  
  var carousel_parent_id: String = js.native
  
  var dominant_color: js.UndefOr[String] = js.native
  
  var force_overlay: js.UndefOr[Boolean] = js.native
  
  var headline: js.UndefOr[TimelineFeedResponseHeadline] = js.native
  
  var hide_nux_text: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var image_versions2: TimelineFeedResponseImageVersions2 = js.native
  
  var link: js.UndefOr[String] = js.native
  
  var link_hint_text: js.UndefOr[String] = js.native
  
  var link_text: js.UndefOr[String] = js.native
  
  var media_type: Double = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var overlay_subtitle: js.UndefOr[String] = js.native
  
  var overlay_text: js.UndefOr[String] = js.native
  
  var overlay_title: js.UndefOr[String] = js.native
  
  var pk: String = js.native
  
  var usertags: js.UndefOr[TimelineFeedResponseUsertags] = js.native
  
  var video_subtitles_uri: js.UndefOr[Null] = js.native
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
  implicit class TimelineFeedResponseCarouselMediaItemOps[Self <: TimelineFeedResponseCarouselMediaItem] (val x: Self) extends AnyVal {
    
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
    def setCarousel_parent_id(value: String): Self = this.set("carousel_parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: TimelineFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = this.set("original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = this.set("original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAd_action(value: String): Self = this.set("ad_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAd_action: Self = this.set("ad_action", js.undefined)
    
    @scala.inline
    def setAd_link_type(value: Double): Self = this.set("ad_link_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAd_link_type: Self = this.set("ad_link_type", js.undefined)
    
    @scala.inline
    def setAd_metadataVarargs(value: TimelineFeedResponseAdMetadataItem*): Self = this.set("ad_metadata", js.Array(value :_*))
    
    @scala.inline
    def setAd_metadata(value: js.Array[TimelineFeedResponseAdMetadataItem]): Self = this.set("ad_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAd_metadata: Self = this.set("ad_metadata", js.undefined)
    
    @scala.inline
    def setAndroid_linksVarargs(value: TimelineFeedResponseAndroidLinksItem*): Self = this.set("android_links", js.Array(value :_*))
    
    @scala.inline
    def setAndroid_links(value: js.Array[TimelineFeedResponseAndroidLinksItem]): Self = this.set("android_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid_links: Self = this.set("android_links", js.undefined)
    
    @scala.inline
    def setDominant_color(value: String): Self = this.set("dominant_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominant_color: Self = this.set("dominant_color", js.undefined)
    
    @scala.inline
    def setForce_overlay(value: Boolean): Self = this.set("force_overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce_overlay: Self = this.set("force_overlay", js.undefined)
    
    @scala.inline
    def setHeadline(value: TimelineFeedResponseHeadline): Self = this.set("headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadline: Self = this.set("headline", js.undefined)
    
    @scala.inline
    def setHide_nux_text(value: Boolean): Self = this.set("hide_nux_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide_nux_text: Self = this.set("hide_nux_text", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLink_hint_text(value: String): Self = this.set("link_hint_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink_hint_text: Self = this.set("link_hint_text", js.undefined)
    
    @scala.inline
    def setLink_text(value: String): Self = this.set("link_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink_text: Self = this.set("link_text", js.undefined)
    
    @scala.inline
    def setOverlay_subtitle(value: String): Self = this.set("overlay_subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay_subtitle: Self = this.set("overlay_subtitle", js.undefined)
    
    @scala.inline
    def setOverlay_text(value: String): Self = this.set("overlay_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay_text: Self = this.set("overlay_text", js.undefined)
    
    @scala.inline
    def setOverlay_title(value: String): Self = this.set("overlay_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay_title: Self = this.set("overlay_title", js.undefined)
    
    @scala.inline
    def setUsertags(value: TimelineFeedResponseUsertags): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsertags: Self = this.set("usertags", js.undefined)
  }
}
