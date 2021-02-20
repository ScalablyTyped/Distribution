package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Androidversion
import typings.instagramPrivateApi.anon.Cropcenter
import typings.instagramPrivateApi.anon.Length
import typings.instagramPrivateApi.anon.Sourceheight
import typings.instagramPrivateApi.mediaConfigureOptionsMod.MediaLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaConfigureSidecarOptionsMod {
  
  @js.native
  trait MediaConfigureSidecarItem extends StObject {
    
    var caption: js.UndefOr[Null] = js.native
    
    var device: js.UndefOr[Androidversion | String] = js.native
    
    var edits: js.UndefOr[Cropcenter | String] = js.native
    
    var extra: js.UndefOr[Sourceheight | String] = js.native
    
    var height: Double = js.native
    
    var source_type: js.UndefOr[String] = js.native
    
    var timezone_offset: js.UndefOr[String] = js.native
    
    var upload_id: String = js.native
    
    var usertags: js.UndefOr[PostingUsertags | String] = js.native
    
    var width: Double = js.native
  }
  object MediaConfigureSidecarItem {
    
    @scala.inline
    def apply(height: Double, upload_id: String, width: Double): MediaConfigureSidecarItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureSidecarItem]
    }
    
    @scala.inline
    implicit class MediaConfigureSidecarItemMutableBuilder[Self <: MediaConfigureSidecarItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: Androidversion | String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setEdits(value: Cropcenter | String): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
      
      @scala.inline
      def setExtra(value: Sourceheight | String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      @scala.inline
      def setTimezone_offset(value: String): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone_offsetUndefined: Self = StObject.set(x, "timezone_offset", js.undefined)
      
      @scala.inline
      def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertags(value: PostingUsertags | String): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaConfigureSidecarOptions extends StObject {
    
    var _csrftoken: js.UndefOr[String] = js.native
    
    var _uid: js.UndefOr[String] = js.native
    
    var _uuid: js.UndefOr[String] = js.native
    
    var caption: js.UndefOr[String] = js.native
    
    var children_metadata: js.Array[MediaConfigureSidecarItem] = js.native
    
    var client_sidecar_id: js.UndefOr[String] = js.native
    
    var device: js.UndefOr[Androidversion] = js.native
    
    var device_id: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[MediaLocation | String] = js.native
    
    var source_type: js.UndefOr[String] = js.native
    
    var timezone_offset: js.UndefOr[String] = js.native
    
    var upload_id: js.UndefOr[String] = js.native
  }
  object MediaConfigureSidecarOptions {
    
    @scala.inline
    def apply(children_metadata: js.Array[MediaConfigureSidecarItem]): MediaConfigureSidecarOptions = {
      val __obj = js.Dynamic.literal(children_metadata = children_metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureSidecarOptions]
    }
    
    @scala.inline
    implicit class MediaConfigureSidecarOptionsMutableBuilder[Self <: MediaConfigureSidecarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setChildren_metadata(value: js.Array[MediaConfigureSidecarItem]): Self = StObject.set(x, "children_metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren_metadataVarargs(value: MediaConfigureSidecarItem*): Self = StObject.set(x, "children_metadata", js.Array(value :_*))
      
      @scala.inline
      def setClient_sidecar_id(value: String): Self = StObject.set(x, "client_sidecar_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_sidecar_idUndefined: Self = StObject.set(x, "client_sidecar_id", js.undefined)
      
      @scala.inline
      def setDevice(value: Androidversion): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
      
      @scala.inline
      def setLocation(value: MediaLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      @scala.inline
      def setTimezone_offset(value: String): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone_offsetUndefined: Self = StObject.set(x, "timezone_offset", js.undefined)
      
      @scala.inline
      def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_idUndefined: Self = StObject.set(x, "upload_id", js.undefined)
      
      @scala.inline
      def set_csrftoken(value: String): Self = StObject.set(x, "_csrftoken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_csrftokenUndefined: Self = StObject.set(x, "_csrftoken", js.undefined)
      
      @scala.inline
      def set_uid(value: String): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
      
      @scala.inline
      def set_uuid(value: String): Self = StObject.set(x, "_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_uuidUndefined: Self = StObject.set(x, "_uuid", js.undefined)
    }
  }
  
  @js.native
  trait MediaConfigureSidecarVideoItem extends MediaConfigureSidecarItem {
    
    var audio_muted: js.UndefOr[String] = js.native
    
    var clips: js.UndefOr[js.Array[Length] | String] = js.native
    
    var date_time_original: js.UndefOr[String] = js.native
    
    var filter_type: js.UndefOr[String] = js.native
    
    var length: String = js.native
    
    var poster_frame_index: js.UndefOr[String] = js.native
    
    var video_result: js.UndefOr[String] = js.native
  }
  object MediaConfigureSidecarVideoItem {
    
    @scala.inline
    def apply(height: Double, length: String, upload_id: String, width: Double): MediaConfigureSidecarVideoItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureSidecarVideoItem]
    }
    
    @scala.inline
    implicit class MediaConfigureSidecarVideoItemMutableBuilder[Self <: MediaConfigureSidecarVideoItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio_muted(value: String): Self = StObject.set(x, "audio_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudio_mutedUndefined: Self = StObject.set(x, "audio_muted", js.undefined)
      
      @scala.inline
      def setClips(value: js.Array[Length] | String): Self = StObject.set(x, "clips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipsUndefined: Self = StObject.set(x, "clips", js.undefined)
      
      @scala.inline
      def setClipsVarargs(value: Length*): Self = StObject.set(x, "clips", js.Array(value :_*))
      
      @scala.inline
      def setDate_time_original(value: String): Self = StObject.set(x, "date_time_original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_time_originalUndefined: Self = StObject.set(x, "date_time_original", js.undefined)
      
      @scala.inline
      def setFilter_type(value: String): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_typeUndefined: Self = StObject.set(x, "filter_type", js.undefined)
      
      @scala.inline
      def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoster_frame_index(value: String): Self = StObject.set(x, "poster_frame_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoster_frame_indexUndefined: Self = StObject.set(x, "poster_frame_index", js.undefined)
      
      @scala.inline
      def setVideo_result(value: String): Self = StObject.set(x, "video_result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_resultUndefined: Self = StObject.set(x, "video_result", js.undefined)
    }
  }
}
