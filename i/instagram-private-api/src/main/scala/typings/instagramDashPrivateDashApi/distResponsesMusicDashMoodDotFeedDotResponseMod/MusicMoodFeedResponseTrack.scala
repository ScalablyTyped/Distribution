package typings.instagramDashPrivateDashApi.distResponsesMusicDashMoodDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicMoodFeedResponseTrack extends js.Object {
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
    val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id, cover_artwork_thumbnail_uri = cover_artwork_thumbnail_uri, cover_artwork_uri = cover_artwork_uri, dash_manifest = dash_manifest, display_artist = display_artist, has_lyrics = has_lyrics, highlight_start_times_in_ms = highlight_start_times_in_ms, id = id, is_explicit = is_explicit, progressive_download_url = progressive_download_url, subtitle = subtitle, title = title)
  
    __obj.asInstanceOf[MusicMoodFeedResponseTrack]
  }
}

