package typings
package hellojsLib.hellojsMod.helloNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSOAuth2Def extends HelloJSOAuthDef {
  var grant: js.UndefOr[java.lang.String] = js.undefined
  var response_type: js.UndefOr[HelloJSTokenResponseType] = js.undefined
}

object HelloJSOAuth2Def {
  @scala.inline
  def apply(
    version: java.lang.String | scala.Double,
    auth: java.lang.String = null,
    grant: java.lang.String = null,
    response_type: HelloJSTokenResponseType = null
  ): HelloJSOAuth2Def = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (grant != null) __obj.updateDynamic("grant")(grant)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    __obj.asInstanceOf[HelloJSOAuth2Def]
  }
}

