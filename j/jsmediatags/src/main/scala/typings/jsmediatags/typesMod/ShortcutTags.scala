package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutTags extends js.Object {
  var album: js.UndefOr[String] = js.undefined
  var artist: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var genre: js.UndefOr[String] = js.undefined
  var lyrics: js.UndefOr[String] = js.undefined
  var picture: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var track: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[String] = js.undefined
}

object ShortcutTags {
  @scala.inline
  def apply(
    album: String = null,
    artist: String = null,
    comment: String = null,
    genre: String = null,
    lyrics: String = null,
    picture: String = null,
    title: String = null,
    track: String = null,
    year: String = null
  ): ShortcutTags = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album)
    if (artist != null) __obj.updateDynamic("artist")(artist)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (genre != null) __obj.updateDynamic("genre")(genre)
    if (lyrics != null) __obj.updateDynamic("lyrics")(lyrics)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    if (title != null) __obj.updateDynamic("title")(title)
    if (track != null) __obj.updateDynamic("track")(track)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[ShortcutTags]
  }
}

