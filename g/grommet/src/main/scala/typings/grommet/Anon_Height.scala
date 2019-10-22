package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(height: Int | Double = null, size: String = null): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Height]
  }
}

