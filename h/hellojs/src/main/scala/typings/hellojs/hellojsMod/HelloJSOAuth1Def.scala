package typings.hellojs.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSOAuth1Def extends HelloJSOAuthDef {
  var request: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object HelloJSOAuth1Def {
  @scala.inline
  def apply(version: String | Double, auth: String = null, request: String = null, token: String = null): HelloJSOAuth1Def = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSOAuth1Def]
  }
}

