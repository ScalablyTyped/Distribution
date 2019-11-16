package typings.atKeystonejsAppDashGraphql.atKeystonejsAppDashGraphqlMod

import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.Keystone
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
    val __obj = js.Dynamic.literal(keystone = keystone)
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev)
    __obj.asInstanceOf[PrepareMiddlewareOptions]
  }
}

