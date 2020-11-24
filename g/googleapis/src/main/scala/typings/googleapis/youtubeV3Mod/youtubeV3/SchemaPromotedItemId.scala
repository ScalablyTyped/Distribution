package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a single promoted item id. It is a union of various possible
  * types.
  */
@js.native
trait SchemaPromotedItemId extends js.Object {
  
  /**
    * If type is recentUpload, this field identifies the channel from which to
    * take the recent upload. If missing, the channel is assumed to be the same
    * channel for which the invideoPromotion is set.
    */
  var recentlyUploadedBy: js.UndefOr[String] = js.native
  
  /**
    * Describes the type of the promoted item.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * If the promoted item represents a video, this field represents the unique
    * YouTube ID identifying it. This field will be present only if type has
    * the value video.
    */
  var videoId: js.UndefOr[String] = js.native
  
  /**
    * If the promoted item represents a website, this field represents the url
    * pointing to the website. This field will be present only if type has the
    * value website.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}
object SchemaPromotedItemId {
  
  @scala.inline
  def apply(): SchemaPromotedItemId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPromotedItemId]
  }
  
  @scala.inline
  implicit class SchemaPromotedItemIdOps[Self <: SchemaPromotedItemId] (val x: Self) extends AnyVal {
    
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
    def setRecentlyUploadedBy(value: String): Self = this.set("recentlyUploadedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentlyUploadedBy: Self = this.set("recentlyUploadedBy", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
}
