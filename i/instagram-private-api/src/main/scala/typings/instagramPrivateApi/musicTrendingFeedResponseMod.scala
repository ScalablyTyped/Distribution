package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicTrendingFeedResponseMod {
  
  trait MusicTrendingFeedResponseItemsItem extends StObject {
    
    var track: MusicTrendingFeedResponseTrack
  }
  object MusicTrendingFeedResponseItemsItem {
    
    inline def apply(track: MusicTrendingFeedResponseTrack): MusicTrendingFeedResponseItemsItem = {
      val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicTrendingFeedResponseItemsItem]
    }
    
    extension [Self <: MusicTrendingFeedResponseItemsItem](x: Self) {
      
      inline def setTrack(value: MusicTrendingFeedResponseTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicTrendingFeedResponsePageInfo extends StObject {
    
    var auto_load_more_available: Boolean
    
    var more_available: Boolean
    
    var next_max_id: String
  }
  object MusicTrendingFeedResponsePageInfo {
    
    inline def apply(auto_load_more_available: Boolean, more_available: Boolean, next_max_id: String): MusicTrendingFeedResponsePageInfo = {
      val __obj = js.Dynamic.literal(auto_load_more_available = auto_load_more_available.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicTrendingFeedResponsePageInfo]
    }
    
    extension [Self <: MusicTrendingFeedResponsePageInfo](x: Self) {
      
      inline def setAuto_load_more_available(value: Boolean): Self = StObject.set(x, "auto_load_more_available", value.asInstanceOf[js.Any])
      
      inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      inline def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicTrendingFeedResponseRootObject extends StObject {
    
    var alacorn_session_id: String
    
    var items: js.Array[MusicTrendingFeedResponseItemsItem]
    
    var page_info: MusicTrendingFeedResponsePageInfo
    
    var status: String
  }
  object MusicTrendingFeedResponseRootObject {
    
    inline def apply(
      alacorn_session_id: String,
      items: js.Array[MusicTrendingFeedResponseItemsItem],
      page_info: MusicTrendingFeedResponsePageInfo,
      status: String
    ): MusicTrendingFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicTrendingFeedResponseRootObject]
    }
    
    extension [Self <: MusicTrendingFeedResponseRootObject](x: Self) {
      
      inline def setAlacorn_session_id(value: String): Self = StObject.set(x, "alacorn_session_id", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[MusicTrendingFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: MusicTrendingFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setPage_info(value: MusicTrendingFeedResponsePageInfo): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicTrendingFeedResponseTrack extends StObject {
    
    var audio_asset_id: Null
    
    var cover_artwork_thumbnail_uri: String
    
    var cover_artwork_uri: String
    
    var dash_manifest: String
    
    var display_artist: String
    
    var has_lyrics: Boolean
    
    var highlight_start_times_in_ms: js.Array[Double]
    
    var id: String
    
    var is_explicit: Boolean
    
    var progressive_download_url: String
    
    var subtitle: String
    
    var title: String
  }
  object MusicTrendingFeedResponseTrack {
    
    inline def apply(
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
    ): MusicTrendingFeedResponseTrack = {
      val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id.asInstanceOf[js.Any], cover_artwork_thumbnail_uri = cover_artwork_thumbnail_uri.asInstanceOf[js.Any], cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], dash_manifest = dash_manifest.asInstanceOf[js.Any], display_artist = display_artist.asInstanceOf[js.Any], has_lyrics = has_lyrics.asInstanceOf[js.Any], highlight_start_times_in_ms = highlight_start_times_in_ms.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_explicit = is_explicit.asInstanceOf[js.Any], progressive_download_url = progressive_download_url.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicTrendingFeedResponseTrack]
    }
    
    extension [Self <: MusicTrendingFeedResponseTrack](x: Self) {
      
      inline def setAudio_asset_id(value: Null): Self = StObject.set(x, "audio_asset_id", value.asInstanceOf[js.Any])
      
      inline def setCover_artwork_thumbnail_uri(value: String): Self = StObject.set(x, "cover_artwork_thumbnail_uri", value.asInstanceOf[js.Any])
      
      inline def setCover_artwork_uri(value: String): Self = StObject.set(x, "cover_artwork_uri", value.asInstanceOf[js.Any])
      
      inline def setDash_manifest(value: String): Self = StObject.set(x, "dash_manifest", value.asInstanceOf[js.Any])
      
      inline def setDisplay_artist(value: String): Self = StObject.set(x, "display_artist", value.asInstanceOf[js.Any])
      
      inline def setHas_lyrics(value: Boolean): Self = StObject.set(x, "has_lyrics", value.asInstanceOf[js.Any])
      
      inline def setHighlight_start_times_in_ms(value: js.Array[Double]): Self = StObject.set(x, "highlight_start_times_in_ms", value.asInstanceOf[js.Any])
      
      inline def setHighlight_start_times_in_msVarargs(value: Double*): Self = StObject.set(x, "highlight_start_times_in_ms", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIs_explicit(value: Boolean): Self = StObject.set(x, "is_explicit", value.asInstanceOf[js.Any])
      
      inline def setProgressive_download_url(value: String): Self = StObject.set(x, "progressive_download_url", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
