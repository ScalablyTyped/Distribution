package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Androidversion
import typings.instagramPrivateApi.anon.Cropcenter
import typings.instagramPrivateApi.anon.Length
import typings.instagramPrivateApi.anon.Sourceheight
import typings.instagramPrivateApi.mediaConfigureOptionsMod.MediaLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaConfigureSidecarOptionsMod {
  
  trait MediaConfigureSidecarItem extends StObject {
    
    var caption: js.UndefOr[Null] = js.undefined
    
    var device: js.UndefOr[Androidversion | String] = js.undefined
    
    var edits: js.UndefOr[Cropcenter | String] = js.undefined
    
    var extra: js.UndefOr[Sourceheight | String] = js.undefined
    
    var height: Double
    
    var source_type: js.UndefOr[String] = js.undefined
    
    var timezone_offset: js.UndefOr[String] = js.undefined
    
    var upload_id: String
    
    var usertags: js.UndefOr[PostingUsertags | String] = js.undefined
    
    var width: Double
  }
  object MediaConfigureSidecarItem {
    
    inline def apply(height: Double, upload_id: String, width: Double): MediaConfigureSidecarItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureSidecarItem]
    }
    
    extension [Self <: MediaConfigureSidecarItem](x: Self) {
      
      inline def setDevice(value: Androidversion | String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setEdits(value: Cropcenter | String): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
      
      inline def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
      
      inline def setExtra(value: Sourceheight | String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      inline def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      inline def setTimezone_offset(value: String): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      inline def setTimezone_offsetUndefined: Self = StObject.set(x, "timezone_offset", js.undefined)
      
      inline def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
      
      inline def setUsertags(value: PostingUsertags | String): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      inline def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaConfigureSidecarOptions extends StObject {
    
    var _csrftoken: js.UndefOr[String] = js.undefined
    
    var _uid: js.UndefOr[String] = js.undefined
    
    var _uuid: js.UndefOr[String] = js.undefined
    
    var caption: js.UndefOr[String] = js.undefined
    
    var children_metadata: js.Array[MediaConfigureSidecarItem]
    
    var client_sidecar_id: js.UndefOr[String] = js.undefined
    
    var device: js.UndefOr[Androidversion] = js.undefined
    
    var device_id: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[MediaLocation | String] = js.undefined
    
    var source_type: js.UndefOr[String] = js.undefined
    
    var timezone_offset: js.UndefOr[String] = js.undefined
    
    var upload_id: js.UndefOr[String] = js.undefined
  }
  object MediaConfigureSidecarOptions {
    
    inline def apply(children_metadata: js.Array[MediaConfigureSidecarItem]): MediaConfigureSidecarOptions = {
      val __obj = js.Dynamic.literal(children_metadata = children_metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureSidecarOptions]
    }
    
    extension [Self <: MediaConfigureSidecarOptions](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChildren_metadata(value: js.Array[MediaConfigureSidecarItem]): Self = StObject.set(x, "children_metadata", value.asInstanceOf[js.Any])
      
      inline def setChildren_metadataVarargs(value: MediaConfigureSidecarItem*): Self = StObject.set(x, "children_metadata", js.Array(value :_*))
      
      inline def setClient_sidecar_id(value: String): Self = StObject.set(x, "client_sidecar_id", value.asInstanceOf[js.Any])
      
      inline def setClient_sidecar_idUndefined: Self = StObject.set(x, "client_sidecar_id", js.undefined)
      
      inline def setDevice(value: Androidversion): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
      
      inline def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
      
      inline def setLocation(value: MediaLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      inline def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      inline def setTimezone_offset(value: String): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      inline def setTimezone_offsetUndefined: Self = StObject.set(x, "timezone_offset", js.undefined)
      
      inline def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
      
      inline def setUpload_idUndefined: Self = StObject.set(x, "upload_id", js.undefined)
      
      inline def set_csrftoken(value: String): Self = StObject.set(x, "_csrftoken", value.asInstanceOf[js.Any])
      
      inline def set_csrftokenUndefined: Self = StObject.set(x, "_csrftoken", js.undefined)
      
      inline def set_uid(value: String): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
      
      inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
      
      inline def set_uuid(value: String): Self = StObject.set(x, "_uuid", value.asInstanceOf[js.Any])
      
      inline def set_uuidUndefined: Self = StObject.set(x, "_uuid", js.undefined)
    }
  }
  
  trait MediaConfigureSidecarVideoItem
    extends StObject
       with MediaConfigureSidecarItem {
    
    var audio_muted: js.UndefOr[String] = js.undefined
    
    var clips: js.UndefOr[js.Array[Length] | String] = js.undefined
    
    var date_time_original: js.UndefOr[String] = js.undefined
    
    var filter_type: js.UndefOr[String] = js.undefined
    
    var length: String
    
    var poster_frame_index: js.UndefOr[String] = js.undefined
    
    var video_result: js.UndefOr[String] = js.undefined
  }
  object MediaConfigureSidecarVideoItem {
    
    inline def apply(height: Double, length: String, upload_id: String, width: Double): MediaConfigureSidecarVideoItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureSidecarVideoItem]
    }
    
    extension [Self <: MediaConfigureSidecarVideoItem](x: Self) {
      
      inline def setAudio_muted(value: String): Self = StObject.set(x, "audio_muted", value.asInstanceOf[js.Any])
      
      inline def setAudio_mutedUndefined: Self = StObject.set(x, "audio_muted", js.undefined)
      
      inline def setClips(value: js.Array[Length] | String): Self = StObject.set(x, "clips", value.asInstanceOf[js.Any])
      
      inline def setClipsUndefined: Self = StObject.set(x, "clips", js.undefined)
      
      inline def setClipsVarargs(value: Length*): Self = StObject.set(x, "clips", js.Array(value :_*))
      
      inline def setDate_time_original(value: String): Self = StObject.set(x, "date_time_original", value.asInstanceOf[js.Any])
      
      inline def setDate_time_originalUndefined: Self = StObject.set(x, "date_time_original", js.undefined)
      
      inline def setFilter_type(value: String): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      inline def setFilter_typeUndefined: Self = StObject.set(x, "filter_type", js.undefined)
      
      inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPoster_frame_index(value: String): Self = StObject.set(x, "poster_frame_index", value.asInstanceOf[js.Any])
      
      inline def setPoster_frame_indexUndefined: Self = StObject.set(x, "poster_frame_index", js.undefined)
      
      inline def setVideo_result(value: String): Self = StObject.set(x, "video_result", value.asInstanceOf[js.Any])
      
      inline def setVideo_resultUndefined: Self = StObject.set(x, "video_result", js.undefined)
    }
  }
}
