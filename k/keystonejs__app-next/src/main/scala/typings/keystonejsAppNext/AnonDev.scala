package typings.keystonejsAppNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDev extends js.Object {
  var dev: js.UndefOr[Boolean] = js.undefined
  var distDir: js.UndefOr[js.Any] = js.undefined
}

object AnonDev {
  @scala.inline
  def apply(dev: js.UndefOr[Boolean] = js.undefined, distDir: js.Any = null): AnonDev = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (distDir != null) __obj.updateDynamic("distDir")(distDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDev]
  }
}

