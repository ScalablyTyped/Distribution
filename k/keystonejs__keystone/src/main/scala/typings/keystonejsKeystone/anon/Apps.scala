package typings.keystonejsKeystone.anon

import typings.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apps extends js.Object {
  var apps: js.UndefOr[js.Array[BaseApp]] = js.undefined
  var dev: js.UndefOr[Boolean] = js.undefined
}

object Apps {
  @scala.inline
  def apply(apps: js.Array[BaseApp] = null, dev: js.UndefOr[Boolean] = js.undefined): Apps = {
    val __obj = js.Dynamic.literal()
    if (apps != null) __obj.updateDynamic("apps")(apps.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apps]
  }
}

