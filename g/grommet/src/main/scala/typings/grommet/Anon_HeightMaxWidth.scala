package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightMaxWidth extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Anon_HeightMaxWidth {
  @scala.inline
  def apply(height: String = null, maxWidth: String = null, size: String = null): Anon_HeightMaxWidth = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_HeightMaxWidth]
  }
}

