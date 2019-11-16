package typings.atKeystonejsAppDashStatic.atKeystonejsAppDashStaticMod

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
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (path != null) __obj.updateDynamic("path")(path)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[StaticOptions]
  }
}

