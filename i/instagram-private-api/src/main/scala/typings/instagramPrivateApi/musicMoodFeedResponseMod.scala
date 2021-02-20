package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicMoodFeedResponseMod {
  
  @js.native
  trait MusicMoodFeedResponseItemsItem extends StObject {
    
    var track: MusicMoodFeedResponseTrack = js.native
  }
  object MusicMoodFeedResponseItemsItem {
    
    @scala.inline
    def apply(track: MusicMoodFeedResponseTrack): MusicMoodFeedResponseItemsItem = {
      val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicMoodFeedResponseItemsItem]
    }
    
    @scala.inline
    implicit class MusicMoodFeedResponseItemsItemMutableBuilder[Self <: MusicMoodFeedResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrack(value: MusicMoodFeedResponseTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MusicMoodFeedResponsePageInfo extends StObject {
    
    var auto_load_more_available: Boolean = js.native
    
    var more_available: Boolean = js.native
    
    var next_max_id: String = js.native
  }
  object MusicMoodFeedResponsePageInfo {
    
    @scala.inline
    def apply(auto_load_more_available: Boolean, more_available: Boolean, next_max_id: String): MusicMoodFeedResponsePageInfo = {
      val __obj = js.Dynamic.literal(auto_load_more_available = auto_load_more_available.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicMoodFeedResponsePageInfo]
    }
    
    @scala.inline
    implicit class MusicMoodFeedResponsePageInfoMutableBuilder[Self <: MusicMoodFeedResponsePageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto_load_more_available(value: Boolean): Self = StObject.set(x, "auto_load_more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MusicMoodFeedResponseRootObject extends StObject {
    
    var alacorn_session_id: String = js.native
    
    var items: js.Array[MusicMoodFeedResponseItemsItem] = js.native
    
    var page_info: MusicMoodFeedResponsePageInfo = js.native
    
    var status: String = js.native
  }
  object MusicMoodFeedResponseRootObject {
    
    @scala.inline
    def apply(
      alacorn_session_id: String,
      items: js.Array[MusicMoodFeedResponseItemsItem],
      page_info: MusicMoodFeedResponsePageInfo,
      status: String
    ): MusicMoodFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicMoodFeedResponseRootObject]
    }
    
    @scala.inline
    implicit class MusicMoodFeedResponseRootObjectMutableBuilder[Self <: MusicMoodFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlacorn_session_id(value: String): Self = StObject.set(x, "alacorn_session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[MusicMoodFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: MusicMoodFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setPage_info(value: MusicMoodFeedResponsePageInfo): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MusicMoodFeedResponseTrack extends StObject {
    
    var audio_asset_id: Null = js.native
    
    var cover_artwork_thumbnail_uri: String = js.native
    
    var cover_artwork_uri: String = js.native
    
    var dash_manifest: String = js.native
    
    var display_artist: String = js.native
    
    var has_lyrics: Boolean = js.native
    
    var highlight_start_times_in_ms: js.Array[Double] = js.native
    
    var id: String = js.native
    
    var is_explicit: Boolean = js.native
    
    var progressive_download_url: String = js.native
    
    var subtitle: String = js.native
    
    var title: String = js.native
  }
  object MusicMoodFeedResponseTrack {
    
    @scala.inline
    def apply(
      audio_asset_id: Null,
      cover_artwork_thumbnail_uri: String,
      cover_artwork_uri: String,
      dash_manifest: String,
      display_artist: String,
      has_lyrics: Boolean,
      highlight_start_times_in_ms: js.Array[Double],
      id: String,
      is_explicit: Boolean,
      progressive_download_url: String,
      subtitle: String,
      title: String
    ): MusicMoodFeedResponseTrack = {
      val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id.asInstanceOf[js.Any], cover_artwork_thumbnail_uri = cover_artwork_thumbnail_uri.asInstanceOf[js.Any], cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], dash_manifest = dash_manifest.asInstanceOf[js.Any], display_artist = display_artist.asInstanceOf[js.Any], has_lyrics = has_lyrics.asInstanceOf[js.Any], highlight_start_times_in_ms = highlight_start_times_in_ms.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_explicit = is_explicit.asInstanceOf[js.Any], progressive_download_url = progressive_download_url.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicMoodFeedResponseTrack]
    }
    
    @scala.inline
    implicit class MusicMoodFeedResponseTrackMutableBuilder[Self <: MusicMoodFeedResponseTrack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio_asset_id(value: Null): Self = StObject.set(x, "audio_asset_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCover_artwork_thumbnail_uri(value: String): Self = StObject.set(x, "cover_artwork_thumbnail_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCover_artwork_uri(value: String): Self = StObject.set(x, "cover_artwork_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDash_manifest(value: String): Self = StObject.set(x, "dash_manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_artist(value: String): Self = StObject.set(x, "display_artist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_lyrics(value: Boolean): Self = StObject.set(x, "has_lyrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight_start_times_in_ms(value: js.Array[Double]): Self = StObject.set(x, "highlight_start_times_in_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight_start_times_in_msVarargs(value: Double*): Self = StObject.set(x, "highlight_start_times_in_ms", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_explicit(value: Boolean): Self = StObject.set(x, "is_explicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressive_download_url(value: String): Self = StObject.set(x, "progressive_download_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
