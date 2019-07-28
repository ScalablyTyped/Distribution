package typings.hapi.hapiMod

import typings.hapi.hapiStrings.`private`
import typings.hapi.hapiStrings.default
import typings.hapi.hapiStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsCache extends js.Object {
  var expiresAt: js.UndefOr[String] = js.undefined
  var expiresIn: js.UndefOr[Double] = js.undefined
  var otherwise: js.UndefOr[String] = js.undefined
  var privacy: js.UndefOr[default | public | `private`] = js.undefined
  var statuses: js.UndefOr[js.Array[Double]] = js.undefined
}

object RouteOptionsCache {
  @scala.inline
  def apply(
    expiresAt: js.UndefOr[scala.Nothing] = js.undefined,
    expiresIn: Int | Double = null,
    otherwise: String = null,
    privacy: default | public | `private` = null,
    statuses: js.Array[Double] = null
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

