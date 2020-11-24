package typings.instagramPrivateApi.musicGenreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicGenreFeedResponseTrack extends js.Object {
  
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
object MusicGenreFeedResponseTrack {
  
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
  ): MusicGenreFeedResponseTrack = {
    val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id.asInstanceOf[js.Any], cover_artwork_thumbnail_uri = cover_artwork_thumbnail_uri.asInstanceOf[js.Any], cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], dash_manifest = dash_manifest.asInstanceOf[js.Any], display_artist = display_artist.asInstanceOf[js.Any], has_lyrics = has_lyrics.asInstanceOf[js.Any], highlight_start_times_in_ms = highlight_start_times_in_ms.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_explicit = is_explicit.asInstanceOf[js.Any], progressive_download_url = progressive_download_url.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicGenreFeedResponseTrack]
  }
  
  @scala.inline
  implicit class MusicGenreFeedResponseTrackOps[Self <: MusicGenreFeedResponseTrack] (val x: Self) extends AnyVal {
    
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
    def setAudio_asset_id(value: Null): Self = this.set("audio_asset_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_artwork_thumbnail_uri(value: String): Self = this.set("cover_artwork_thumbnail_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_artwork_uri(value: String): Self = this.set("cover_artwork_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDash_manifest(value: String): Self = this.set("dash_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_artist(value: String): Self = this.set("display_artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_lyrics(value: Boolean): Self = this.set("has_lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight_start_times_in_msVarargs(value: Double*): Self = this.set("highlight_start_times_in_ms", js.Array(value :_*))
    
    @scala.inline
    def setHighlight_start_times_in_ms(value: js.Array[Double]): Self = this.set("highlight_start_times_in_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_explicit(value: Boolean): Self = this.set("is_explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressive_download_url(value: String): Self = this.set("progressive_download_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
