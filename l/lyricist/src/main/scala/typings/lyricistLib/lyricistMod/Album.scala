package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Album =================================================
trait Album extends js.Object {
  var api_path: java.lang.String
  var artist: ArtistBrief
  var comment_count: scala.Double
  var cover_art_url: java.lang.String
  var cover_arts: js.Array[_]
  var current_user_metadata: lyricistLib.Anon_ExcludedpermissionsInteractionsPermissionsAnonPyong
  var custom_header_image_url: js.UndefOr[js.Any] = js.undefined
  var description_annotation: DescriptionAnnotation
  var full_title: java.lang.String
  var header_image_url: java.lang.String
  var id: scala.Double
  var lock_state: java.lang.String
  var name: java.lang.String
  var performance_groups: js.Array[_]
  var pyongs_count: scala.Double
  var release_date: js.UndefOr[js.Any] = js.undefined
  var release_date_components: js.UndefOr[js.Any] = js.undefined
  var song_pageviews: scala.Double
  var song_performances: js.Array[_]
  var url: java.lang.String
}

object Album {
  @scala.inline
  def apply(
    api_path: java.lang.String,
    artist: ArtistBrief,
    comment_count: scala.Double,
    cover_art_url: java.lang.String,
    cover_arts: js.Array[_],
    current_user_metadata: lyricistLib.Anon_ExcludedpermissionsInteractionsPermissionsAnonPyong,
    description_annotation: DescriptionAnnotation,
    full_title: java.lang.String,
    header_image_url: java.lang.String,
    id: scala.Double,
    lock_state: java.lang.String,
    name: java.lang.String,
    performance_groups: js.Array[_],
    pyongs_count: scala.Double,
    song_pageviews: scala.Double,
    song_performances: js.Array[_],
    url: java.lang.String,
    custom_header_image_url: js.Any = null,
    release_date: js.Any = null,
    release_date_components: js.Any = null
  ): Album = {
    val __obj = js.Dynamic.literal(api_path = api_path, artist = artist, comment_count = comment_count, cover_art_url = cover_art_url, cover_arts = cover_arts, current_user_metadata = current_user_metadata, description_annotation = description_annotation, full_title = full_title, header_image_url = header_image_url, id = id, lock_state = lock_state, name = name, performance_groups = performance_groups, pyongs_count = pyongs_count, song_pageviews = song_pageviews, song_performances = song_performances, url = url)
    if (custom_header_image_url != null) __obj.updateDynamic("custom_header_image_url")(custom_header_image_url)
    if (release_date != null) __obj.updateDynamic("release_date")(release_date)
    if (release_date_components != null) __obj.updateDynamic("release_date_components")(release_date_components)
    __obj.asInstanceOf[Album]
  }
}

