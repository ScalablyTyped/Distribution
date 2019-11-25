package typings.atKeystonejsKeystone

import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apps extends js.Object {
  var apps: js.UndefOr[js.Array[BaseApp]] = js.undefined
  var dev: js.UndefOr[Boolean] = js.undefined
}

object Anon_Apps {
  @scala.inline
  def apply(apps: js.Array[BaseApp] = null, dev: js.UndefOr[Boolean] = js.undefined): Anon_Apps = {
    val __obj = js.Dynamic.literal()
    if (apps != null) __obj.updateDynamic("apps")(apps.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Apps]
  }
}

