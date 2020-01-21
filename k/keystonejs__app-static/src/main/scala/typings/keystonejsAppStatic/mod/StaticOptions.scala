package typings.keystonejsAppStatic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticOptions extends js.Object {
  var fallback: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object StaticOptions {
  @scala.inline
  def apply(fallback: String = null, path: String = null, src: String = null): StaticOptions = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
}

