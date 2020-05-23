package typings.keystonejsAppNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dev extends js.Object {
  var dev: js.UndefOr[Boolean] = js.undefined
  var distDir: js.UndefOr[js.Any] = js.undefined
}

object Dev {
  @scala.inline
  def apply(dev: js.UndefOr[Boolean] = js.undefined, distDir: js.Any = null): Dev = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (distDir != null) __obj.updateDynamic("distDir")(distDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dev]
  }
}

