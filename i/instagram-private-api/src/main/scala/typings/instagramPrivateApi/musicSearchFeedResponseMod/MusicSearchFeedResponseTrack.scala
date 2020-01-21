package typings.instagramPrivateApi.musicSearchFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicSearchFeedResponseTrack extends js.Object {
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

object MusicSearchFeedResponseTrack {
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
  ): MusicSearchFeedResponseTrack = {
    val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id.asInstanceOf[js.Any], cover_artwork_thumbnail_uri = cover_artwork_thumbnail_uri.asInstanceOf[js.Any], cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], dash_manifest = dash_manifest.asInstanceOf[js.Any], display_artist = display_artist.asInstanceOf[js.Any], has_lyrics = has_lyrics.asInstanceOf[js.Any], highlight_start_times_in_ms = highlight_start_times_in_ms.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_explicit = is_explicit.asInstanceOf[js.Any], progressive_download_url = progressive_download_url.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicSearchFeedResponseTrack]
  }
}

