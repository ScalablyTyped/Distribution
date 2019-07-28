package typings.jss.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToCssOptions extends js.Object {
  var indent: js.UndefOr[Double] = js.undefined
}

object ToCssOptions {
  @scala.inline
  def apply(indent: Int | Double = null): ToCssOptions = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToCssOptions]
  }
}

