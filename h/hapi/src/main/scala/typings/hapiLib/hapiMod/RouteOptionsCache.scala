package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsCache extends js.Object {
  var expiresAt: js.UndefOr[scala.Nothing | java.lang.String] = js.undefined
  var expiresIn: js.UndefOr[scala.Double | scala.Nothing] = js.undefined
  var otherwise: js.UndefOr[java.lang.String] = js.undefined
  var privacy: js.UndefOr[
    hapiLib.hapiLibStrings.default | hapiLib.hapiLibStrings.public | hapiLib.hapiLibStrings.`private`
  ] = js.undefined
  var statuses: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object RouteOptionsCache {
  @scala.inline
  def apply(
    expiresAt: js.UndefOr[scala.Nothing] = js.undefined,
    expiresIn: scala.Int | scala.Double = null,
    otherwise: java.lang.String = null,
    privacy: hapiLib.hapiLibStrings.default | hapiLib.hapiLibStrings.public | hapiLib.hapiLibStrings.`private` = null,
    statuses: js.Array[scala.Double] = null
  ): RouteOptionsCache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiresAt)) __obj.updateDynamic("expiresAt")(expiresAt)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (otherwise != null) __obj.updateDynamic("otherwise")(otherwise)
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    __obj.asInstanceOf[RouteOptionsCache]
  }
}

