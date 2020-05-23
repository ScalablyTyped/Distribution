package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightSize extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object HeightSize {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, size: String = null): HeightSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightSize]
  }
}

