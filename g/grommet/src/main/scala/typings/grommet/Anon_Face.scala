package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Face extends js.Object {
  var face: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Anon_Face {
  @scala.inline
  def apply(
    face: String = null,
    family: String = null,
    height: String = null,
    maxWidth: String = null,
    size: String = null
  ): Anon_Face = {
    val __obj = js.Dynamic.literal()
    if (face != null) __obj.updateDynamic("face")(face)
    if (family != null) __obj.updateDynamic("family")(family)
    if (height != null) __obj.updateDynamic("height")(height)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Face]
  }
}

