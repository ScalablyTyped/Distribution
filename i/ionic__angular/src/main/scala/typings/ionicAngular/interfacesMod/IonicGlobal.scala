package typings.ionicAngular.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicGlobal extends js.Object {
  var asyncQueue: js.UndefOr[Boolean] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
}

object IonicGlobal {
  @scala.inline
  def apply(asyncQueue: js.UndefOr[Boolean] = js.undefined, config: js.Any = null): IonicGlobal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asyncQueue)) __obj.updateDynamic("asyncQueue")(asyncQueue.get.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicGlobal]
  }
}

