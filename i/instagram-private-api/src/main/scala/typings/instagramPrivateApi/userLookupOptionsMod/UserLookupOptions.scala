package typings.instagramPrivateApi.userLookupOptionsMod

import typings.instagramPrivateApi.anon.Countrycode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLookupOptions extends js.Object {
  var countryCodes: js.UndefOr[js.Array[Countrycode]] = js.undefined
  var directlySignIn: js.UndefOr[Boolean] = js.undefined
  var query: String
  var waterfallId: js.UndefOr[String] = js.undefined
}

object UserLookupOptions {
  @scala.inline
  def apply(
    query: String,
    countryCodes: js.Array[Countrycode] = null,
    directlySignIn: js.UndefOr[Boolean] = js.undefined,
    waterfallId: String = null
  ): UserLookupOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (countryCodes != null) __obj.updateDynamic("countryCodes")(countryCodes.asInstanceOf[js.Any])
    if (!js.isUndefined(directlySignIn)) __obj.updateDynamic("directlySignIn")(directlySignIn.get.asInstanceOf[js.Any])
    if (waterfallId != null) __obj.updateDynamic("waterfallId")(waterfallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLookupOptions]
  }
}

