package typings.hapiDashAuthDashJwt2.hapiDashAuthDashJwt2Mod

import typings.atHapiHapi.atHapiHapiMod.Request
import typings.hapiDashAuthDashJwt2.Anon_Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions extends js.Object {
  /**
    * function which is run once the Token has been decoded (instead of a validate) with signature async function(decoded, request) where:
    */
  var verify: js.UndefOr[
    js.Function2[/* decoded */ js.Any, /* request */ Request, js.Promise[Anon_Credentials]]
  ] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(verify: (/* decoded */ js.Any, /* request */ Request) => js.Promise[Anon_Credentials] = null): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction2(verify))
    __obj.asInstanceOf[RegisterOptions]
  }
}

