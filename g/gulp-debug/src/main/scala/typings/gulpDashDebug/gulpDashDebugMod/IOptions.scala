package typings.gulpDashDebug.gulpDashDebugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var minimal: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(minimal: js.UndefOr[Boolean] = js.undefined, title: String = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IOptions]
  }
}

