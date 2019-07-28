package typings.lyricist.lyricistMod

import typings.lyricist.Anon_Hot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Song by Artist =========================================
trait SongByArtist extends js.Object {
  var annotation_count: Double
  var api_path: String
  var full_title: String
  var header_image_thumbnail_url: String
  var header_image_url: String
  var id: Double
  var lyrics_owner_id: Double
  var lyrics_state: String
  var path: String
  var primary_artist: ArtistBrief
  var pyongs_count: Double
  var song_art_image_thumbnail_url: String
  var stats: Anon_Hot
  var title: String
  var title_with_featured: String
  var url: String
}

object SongByArtist {
  @scala.inline
  def apply(
    annotation_count: Double,
    api_path: String,
    full_title: String,
    header_image_thumbnail_url: String,
    header_image_url: String,
    id: Double,
    lyrics_owner_id: Double,
    lyrics_state: String,
    path: String,
    primary_artist: ArtistBrief,
    pyongs_count: Double,
    song_art_image_thumbnail_url: String,
    stats: Anon_Hot,
    title: String,
    title_with_featured: String,
    url: String
  ): SongByArtist = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count, api_path = api_path, full_title = full_title, header_image_thumbnail_url = header_image_thumbnail_url, header_image_url = header_image_url, id = id, lyrics_owner_id = lyrics_owner_id, lyrics_state = lyrics_state, path = path, primary_artist = primary_artist, pyongs_count = pyongs_count, song_art_image_thumbnail_url = song_art_image_thumbnail_url, stats = stats, title = title, title_with_featured = title_with_featured, url = url)
  
    __obj.asInstanceOf[SongByArtist]
  }
}

