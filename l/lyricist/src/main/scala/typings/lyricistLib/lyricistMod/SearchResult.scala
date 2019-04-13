package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Search ================================================
trait SearchResult extends js.Object {
  var annotation_count: scala.Double
  var api_path: java.lang.String
  var full_title: java.lang.String
  var header_image_thumbnail_url: java.lang.String
  var header_image_url: java.lang.String
  var id: scala.Double
  var lyrics_owner_id: scala.Double
  var lyrics_state: java.lang.String
  var path: java.lang.String
  var primary_artist: ArtistBrief
  var pyongs_count: js.UndefOr[js.Any] = js.undefined
  var song_art_image_thumbnail_url: java.lang.String
  var stats: lyricistLib.Anon_Hot
  var title: java.lang.String
  var title_with_featured: java.lang.String
  var url: java.lang.String
}

object SearchResult {
  @scala.inline
  def apply(
    annotation_count: scala.Double,
    api_path: java.lang.String,
    full_title: java.lang.String,
    header_image_thumbnail_url: java.lang.String,
    header_image_url: java.lang.String,
    id: scala.Double,
    lyrics_owner_id: scala.Double,
    lyrics_state: java.lang.String,
    path: java.lang.String,
    primary_artist: ArtistBrief,
    song_art_image_thumbnail_url: java.lang.String,
    stats: lyricistLib.Anon_Hot,
    title: java.lang.String,
    title_with_featured: java.lang.String,
    url: java.lang.String,
    pyongs_count: js.Any = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count, api_path = api_path, full_title = full_title, header_image_thumbnail_url = header_image_thumbnail_url, header_image_url = header_image_url, id = id, lyrics_owner_id = lyrics_owner_id, lyrics_state = lyrics_state, path = path, primary_artist = primary_artist, song_art_image_thumbnail_url = song_art_image_thumbnail_url, stats = stats, title = title, title_with_featured = title_with_featured, url = url)
    if (pyongs_count != null) __obj.updateDynamic("pyongs_count")(pyongs_count)
    __obj.asInstanceOf[SearchResult]
  }
}

