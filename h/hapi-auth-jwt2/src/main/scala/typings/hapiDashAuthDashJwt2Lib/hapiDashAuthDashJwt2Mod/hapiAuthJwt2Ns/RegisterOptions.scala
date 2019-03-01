package typings
package hapiDashAuthDashJwt2Lib.hapiDashAuthDashJwt2Mod.hapiAuthJwt2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions extends js.Object {
  /**
    * function which is run once the Token has been decoded (instead of a validate) with signature async function(decoded, request) where:
    */
  var verify: js.UndefOr[
    js.Function2[
      /* decoded */ js.Any, 
      /* request */ hapiLib.hapiMod.Request, 
      js.Promise[hapiDashAuthDashJwt2Lib.Anon_Credentials]
    ]
  ] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(
    verify: js.Function2[
      /* decoded */ js.Any, 
      /* request */ hapiLib.hapiMod.Request, 
      js.Promise[hapiDashAuthDashJwt2Lib.Anon_Credentials]
    ] = null
  ): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[RegisterOptions]
  }
}

