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
  var picture: js.UndefOr[PictureType] = js.undefined
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
    picture: PictureType = null,
    title: String = null,
    track: String = null,
    year: String = null
  ): ShortcutTags = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre.asInstanceOf[js.Any])
    if (lyrics != null) __obj.updateDynamic("lyrics")(lyrics.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutTags]
  }
}

