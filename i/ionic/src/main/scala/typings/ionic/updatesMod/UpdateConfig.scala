package typings.ionic.updatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfig extends js.Object {
  var lastNotify: js.UndefOr[String] = js.undefined
  var lastUpdate: js.UndefOr[String] = js.undefined
  var packages: js.Array[PersistedPackage]
}

object UpdateConfig {
  @scala.inline
  def apply(packages: js.Array[PersistedPackage], lastNotify: String = null, lastUpdate: String = null): UpdateConfig = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    if (lastNotify != null) __obj.updateDynamic("lastNotify")(lastNotify.asInstanceOf[js.Any])
    if (lastUpdate != null) __obj.updateDynamic("lastUpdate")(lastUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfig]
  }
}

