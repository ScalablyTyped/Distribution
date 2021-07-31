package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a single promoted item id. It is a union of various possible
  * types.
  */
trait SchemaPromotedItemId extends StObject {
  
  /**
    * If type is recentUpload, this field identifies the channel from which to
    * take the recent upload. If missing, the channel is assumed to be the same
    * channel for which the invideoPromotion is set.
    */
  var recentlyUploadedBy: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the type of the promoted item.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * If the promoted item represents a video, this field represents the unique
    * YouTube ID identifying it. This field will be present only if type has
    * the value video.
    */
  var videoId: js.UndefOr[String] = js.undefined
  
  /**
    * If the promoted item represents a website, this field represents the url
    * pointing to the website. This field will be present only if type has the
    * value website.
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
}
object SchemaPromotedItemId {
  
  @scala.inline
  def apply(): SchemaPromotedItemId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPromotedItemId]
  }
  
  @scala.inline
  implicit class SchemaPromotedItemIdMutableBuilder[Self <: SchemaPromotedItemId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecentlyUploadedBy(value: String): Self = StObject.set(x, "recentlyUploadedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecentlyUploadedByUndefined: Self = StObject.set(x, "recentlyUploadedBy", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
