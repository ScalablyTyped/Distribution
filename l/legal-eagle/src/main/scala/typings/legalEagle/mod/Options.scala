package typings.legalEagle.mod

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
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(omitPermissive)) __obj.updateDynamic("omitPermissive")(omitPermissive.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

