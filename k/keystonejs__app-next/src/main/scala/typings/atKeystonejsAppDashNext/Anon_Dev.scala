package typings.atKeystonejsAppDashNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dev extends js.Object {
  var dev: js.UndefOr[Boolean] = js.undefined
}

object Anon_Dev {
  @scala.inline
  def apply(dev: js.UndefOr[Boolean] = js.undefined): Anon_Dev = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev)
    __obj.asInstanceOf[Anon_Dev]
  }
}

