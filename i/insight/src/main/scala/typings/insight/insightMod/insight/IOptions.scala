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
    val __obj = js.Dynamic.literal(trackingCode = trackingCode.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (packageVersion != null) __obj.updateDynamic("packageVersion")(packageVersion.asInstanceOf[js.Any])
    if (pkg != null) __obj.updateDynamic("pkg")(pkg.asInstanceOf[js.Any])
    if (trackingProvider != null) __obj.updateDynamic("trackingProvider")(trackingProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

