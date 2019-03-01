package typings
package insightLib.insightMod.insightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var config: js.UndefOr[IConfigstore] = js.undefined
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  var packageVersion: js.UndefOr[java.lang.String] = js.undefined
  var pkg: js.UndefOr[IPackage] = js.undefined
  var trackingCode: java.lang.String
  var trackingProvider: js.UndefOr[java.lang.String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    trackingCode: java.lang.String,
    config: IConfigstore = null,
    packageName: java.lang.String = null,
    packageVersion: java.lang.String = null,
    pkg: IPackage = null,
    trackingProvider: java.lang.String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trackingCode")(trackingCode)
    if (config != null) __obj.updateDynamic("config")(config)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (packageVersion != null) __obj.updateDynamic("packageVersion")(packageVersion)
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (trackingProvider != null) __obj.updateDynamic("trackingProvider")(trackingProvider)
    __obj.asInstanceOf[IOptions]
  }
}

