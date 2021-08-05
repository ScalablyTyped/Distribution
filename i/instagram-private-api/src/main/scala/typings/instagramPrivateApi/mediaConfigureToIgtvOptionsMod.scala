package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Androidversion
import typings.instagramPrivateApi.anon.Cropbottom
import typings.instagramPrivateApi.anon.LengthSourcetype
import typings.instagramPrivateApi.anon.Numreupload
import typings.instagramPrivateApi.anon.Sourceheight
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaConfigureToIgtvOptionsMod {
  
  trait MediaConfigureToIgtvOptions extends StObject {
    
    var audio_muted: js.UndefOr[Boolean] = js.undefined
    
    var caption: js.UndefOr[String] = js.undefined
    
    var clips: js.UndefOr[js.Array[LengthSourcetype]] = js.undefined
    
    var date_time_original: js.UndefOr[String] = js.undefined
    
    var device: js.UndefOr[Androidversion] = js.undefined
    
    var extra: Sourceheight
    
    var feed_preview_crop: js.UndefOr[Cropbottom | String] = js.undefined
    
    var filter_type: js.UndefOr[String] = js.undefined
    
    var igtv_share_preview_to_feed: js.UndefOr[`1` | `0`] = js.undefined
    
    var length: Double
    
    var media_folder: js.UndefOr[String] = js.undefined
    
    var poster_frame_index: js.UndefOr[Double] = js.undefined
    
    var retryContext: js.UndefOr[Numreupload] = js.undefined
    
    var source_type: js.UndefOr[`3` | `4`] = js.undefined
    
    var timezone_offset: js.UndefOr[String] = js.undefined
    
    var title: String
    
    var upload_id: String
  }
  object MediaConfigureToIgtvOptions {
    
    inline def apply(extra: Sourceheight, length: Double, title: String, upload_id: String): MediaConfigureToIgtvOptions = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureToIgtvOptions]
    }
    
    extension [Self <: MediaConfigureToIgtvOptions](x: Self) {
      
      inline def setAudio_muted(value: Boolean): Self = StObject.set(x, "audio_muted", value.asInstanceOf[js.Any])
      
      inline def setAudio_mutedUndefined: Self = StObject.set(x, "audio_muted", js.undefined)
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setClips(value: js.Array[LengthSourcetype]): Self = StObject.set(x, "clips", value.asInstanceOf[js.Any])
      
      inline def setClipsUndefined: Self = StObject.set(x, "clips", js.undefined)
      
      inline def setClipsVarargs(value: LengthSourcetype*): Self = StObject.set(x, "clips", js.Array(value :_*))
      
      inline def setDate_time_original(value: String): Self = StObject.set(x, "date_time_original", value.asInstanceOf[js.Any])
      
      inline def setDate_time_originalUndefined: Self = StObject.set(x, "date_time_original", js.undefined)
      
      inline def setDevice(value: Androidversion): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setExtra(value: Sourceheight): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setFeed_preview_crop(value: Cropbottom | String): Self = StObject.set(x, "feed_preview_crop", value.asInstanceOf[js.Any])
      
      inline def setFeed_preview_cropUndefined: Self = StObject.set(x, "feed_preview_crop", js.undefined)
      
      inline def setFilter_type(value: String): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      inline def setFilter_typeUndefined: Self = StObject.set(x, "filter_type", js.undefined)
      
      inline def setIgtv_share_preview_to_feed(value: `1` | `0`): Self = StObject.set(x, "igtv_share_preview_to_feed", value.asInstanceOf[js.Any])
      
      inline def setIgtv_share_preview_to_feedUndefined: Self = StObject.set(x, "igtv_share_preview_to_feed", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMedia_folder(value: String): Self = StObject.set(x, "media_folder", value.asInstanceOf[js.Any])
      
      inline def setMedia_folderUndefined: Self = StObject.set(x, "media_folder", js.undefined)
      
      inline def setPoster_frame_index(value: Double): Self = StObject.set(x, "poster_frame_index", value.asInstanceOf[js.Any])
      
      inline def setPoster_frame_indexUndefined: Self = StObject.set(x, "poster_frame_index", js.undefined)
      
      inline def setRetryContext(value: Numreupload): Self = StObject.set(x, "retryContext", value.asInstanceOf[js.Any])
      
      inline def setRetryContextUndefined: Self = StObject.set(x, "retryContext", js.undefined)
      
      inline def setSource_type(value: `3` | `4`): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      inline def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      inline def setTimezone_offset(value: String): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      inline def setTimezone_offsetUndefined: Self = StObject.set(x, "timezone_offset", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
    }
  }
}
