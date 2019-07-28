package typings.legalDashEagle.legalDashEagleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var omitPermissive: js.UndefOr[Boolean] = js.undefined
  var overrides: js.UndefOr[LicenseLookup] = js.undefined
  var path: String
}

object Options {
  @scala.inline
  def apply(path: String, omitPermissive: js.UndefOr[Boolean] = js.undefined, overrides: LicenseLookup = null): Options = {
    val __obj = js.Dynamic.literal(path = path)
    if (!js.isUndefined(omitPermissive)) __obj.updateDynamic("omitPermissive")(omitPermissive)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[Options]
  }
}

