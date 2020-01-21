package typings.keystonejsAppGraphql.mod

import typings.keystonejsKeystone.mod.Keystone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrepareMiddlewareOptions extends js.Object {
  var dev: js.UndefOr[Boolean] = js.undefined
  var keystone: Keystone[String]
}

object PrepareMiddlewareOptions {
  @scala.inline
  def apply(keystone: Keystone[String], dev: js.UndefOr[Boolean] = js.undefined): PrepareMiddlewareOptions = {
    val __obj = js.Dynamic.literal(keystone = keystone.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareMiddlewareOptions]
  }
}

