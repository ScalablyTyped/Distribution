package typings.insight.insightMod.insight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var config: js.UndefOr[IConfigstore] = js.undefined
  var packageName: js.UndefOr[String] = js.undefined
  var packageVersion: js.UndefOr[String] = js.undefined
  var pkg: js.UndefOr[IPackage] = js.undefined
  var trackingCode: String
  var trackingProvider: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    trackingCode: String,
    config: IConfigstore = null,
    packageName: String = null,
    packageVersion: String = null,
    pkg: IPackage = null,
    trackingProvider: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(trackingCode = trackingCode)
    if (config != null) __obj.updateDynamic("config")(config)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (packageVersion != null) __obj.updateDynamic("packageVersion")(packageVersion)
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (trackingProvider != null) __obj.updateDynamic("trackingProvider")(trackingProvider)
    __obj.asInstanceOf[IOptions]
  }
}

