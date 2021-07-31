package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Length
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`4`
import typings.instagramPrivateApi.mediaConfigureOptionsMod.MediaLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaConfigureVideoOptionsMod {
  
  trait MediaConfigureTimelineVideoOptions
    extends StObject
       with MediaConfigureVideoOptions {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var date_time_original: js.UndefOr[String] = js.undefined
    
    var device_id: js.UndefOr[String] = js.undefined
    
    var filter_type: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[MediaLocation | String] = js.undefined
    
    var source_type: js.UndefOr[`4`] = js.undefined
    
    var timezone_offset: js.UndefOr[String] = js.undefined
    
    var usertags: js.UndefOr[PostingUsertags | String] = js.undefined
  }
  object MediaConfigureTimelineVideoOptions {
    
    @scala.inline
    def apply(height: Double, length: Double, upload_id: String, width: Double): MediaConfigureTimelineVideoOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureTimelineVideoOptions]
    }
    
    @scala.inline
    implicit class MediaConfigureTimelineVideoOptionsMutableBuilder[Self <: MediaConfigureTimelineVideoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setDate_time_original(value: String): Self = StObject.set(x, "date_time_original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_time_originalUndefined: Self = StObject.set(x, "date_time_original", js.undefined)
      
      @scala.inline
      def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
      
      @scala.inline
      def setFilter_type(value: String): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_typeUndefined: Self = StObject.set(x, "filter_type", js.undefined)
      
      @scala.inline
      def setLocation(value: MediaLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setSource_type(value: `4`): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      @scala.inline
      def setTimezone_offset(value: String): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone_offsetUndefined: Self = StObject.set(x, "timezone_offset", js.undefined)
      
      @scala.inline
      def setUsertags(value: PostingUsertags | String): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    }
  }
  
  trait MediaConfigureVideoOptions extends StObject {
    
    var audio_muted: js.UndefOr[Boolean] = js.undefined
    
    var clips: js.UndefOr[js.Array[Length]] = js.undefined
    
    var geotag_enabled: js.UndefOr[`1` | `0`] = js.undefined
    
    var height: Double
    
    var length: Double
    
    var media_latitude: js.UndefOr[String] = js.undefined
    
    var media_longitude: js.UndefOr[String] = js.undefined
    
    var poster_frame_index: js.UndefOr[Double] = js.undefined
    
    var posting_latitude: js.UndefOr[String] = js.undefined
    
    var posting_longitude: js.UndefOr[String] = js.undefined
    
    var upload_id: String
    
    var width: Double
  }
  object MediaConfigureVideoOptions {
    
    @scala.inline
    def apply(height: Double, length: Double, upload_id: String, width: Double): MediaConfigureVideoOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureVideoOptions]
    }
    
    @scala.inline
    implicit class MediaConfigureVideoOptionsMutableBuilder[Self <: MediaConfigureVideoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio_muted(value: Boolean): Self = StObject.set(x, "audio_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudio_mutedUndefined: Self = StObject.set(x, "audio_muted", js.undefined)
      
      @scala.inline
      def setClips(value: js.Array[Length]): Self = StObject.set(x, "clips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipsUndefined: Self = StObject.set(x, "clips", js.undefined)
      
      @scala.inline
      def setClipsVarargs(value: Length*): Self = StObject.set(x, "clips", js.Array(value :_*))
      
      @scala.inline
      def setGeotag_enabled(value: `1` | `0`): Self = StObject.set(x, "geotag_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeotag_enabledUndefined: Self = StObject.set(x, "geotag_enabled", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_latitude(value: String): Self = StObject.set(x, "media_latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_latitudeUndefined: Self = StObject.set(x, "media_latitude", js.undefined)
      
      @scala.inline
      def setMedia_longitude(value: String): Self = StObject.set(x, "media_longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_longitudeUndefined: Self = StObject.set(x, "media_longitude", js.undefined)
      
      @scala.inline
      def setPoster_frame_index(value: Double): Self = StObject.set(x, "poster_frame_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoster_frame_indexUndefined: Self = StObject.set(x, "poster_frame_index", js.undefined)
      
      @scala.inline
      def setPosting_latitude(value: String): Self = StObject.set(x, "posting_latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosting_latitudeUndefined: Self = StObject.set(x, "posting_latitude", js.undefined)
      
      @scala.inline
      def setPosting_longitude(value: String): Self = StObject.set(x, "posting_longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosting_longitudeUndefined: Self = StObject.set(x, "posting_longitude", js.undefined)
      
      @scala.inline
      def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
