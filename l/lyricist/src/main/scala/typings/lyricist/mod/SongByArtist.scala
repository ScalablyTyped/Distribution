package typings.lyricist.mod

import typings.lyricist.AnonHot
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
  var stats: AnonHot
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
    stats: AnonHot,
    title: String,
    title_with_featured: String,
    url: String
  ): SongByArtist = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_thumbnail_url = header_image_thumbnail_url.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lyrics_owner_id = lyrics_owner_id.asInstanceOf[js.Any], lyrics_state = lyrics_state.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], primary_artist = primary_artist.asInstanceOf[js.Any], pyongs_count = pyongs_count.asInstanceOf[js.Any], song_art_image_thumbnail_url = song_art_image_thumbnail_url.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_with_featured = title_with_featured.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SongByArtist]
  }
}

