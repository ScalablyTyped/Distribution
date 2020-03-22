package typings.lyricist.mod

import typings.lyricist.AnonExcludedpermissionsInteractions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Album =================================================
trait Album extends js.Object {
  var api_path: String
  var artist: ArtistBrief
  var comment_count: Double
  var cover_art_url: String
  var cover_arts: js.Array[_]
  var current_user_metadata: AnonExcludedpermissionsInteractions
  var custom_header_image_url: js.UndefOr[js.Any] = js.undefined
  var description_annotation: DescriptionAnnotation
  var full_title: String
  var header_image_url: String
  var id: Double
  var lock_state: String
  var name: String
  var performance_groups: js.Array[_]
  var pyongs_count: Double
  var release_date: js.UndefOr[js.Any] = js.undefined
  var release_date_components: js.UndefOr[js.Any] = js.undefined
  var song_pageviews: Double
  var song_performances: js.Array[_]
  var url: String
}

object Album {
  @scala.inline
  def apply(
    api_path: String,
    artist: ArtistBrief,
    comment_count: Double,
    cover_art_url: String,
    cover_arts: js.Array[_],
    current_user_metadata: AnonExcludedpermissionsInteractions,
    description_annotation: DescriptionAnnotation,
    full_title: String,
    header_image_url: String,
    id: Double,
    lock_state: String,
    name: String,
    performance_groups: js.Array[_],
    pyongs_count: Double,
    song_pageviews: Double,
    song_performances: js.Array[_],
    url: String,
    custom_header_image_url: js.Any = null,
    release_date: js.Any = null,
    release_date_components: js.Any = null
  ): Album = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], cover_art_url = cover_art_url.asInstanceOf[js.Any], cover_arts = cover_arts.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_state = lock_state.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], performance_groups = performance_groups.asInstanceOf[js.Any], pyongs_count = pyongs_count.asInstanceOf[js.Any], song_pageviews = song_pageviews.asInstanceOf[js.Any], song_performances = song_performances.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (custom_header_image_url != null) __obj.updateDynamic("custom_header_image_url")(custom_header_image_url.asInstanceOf[js.Any])
    if (release_date != null) __obj.updateDynamic("release_date")(release_date.asInstanceOf[js.Any])
    if (release_date_components != null) __obj.updateDynamic("release_date_components")(release_date_components.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
}

