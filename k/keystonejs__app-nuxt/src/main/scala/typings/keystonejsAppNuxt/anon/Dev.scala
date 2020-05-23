package typings.keystonejsAppNuxt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dev extends js.Object {
  var dev: js.UndefOr[Boolean] = js.undefined
}

object Dev {
  @scala.inline
  def apply(dev: js.UndefOr[Boolean] = js.undefined): Dev = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dev]
  }
}

