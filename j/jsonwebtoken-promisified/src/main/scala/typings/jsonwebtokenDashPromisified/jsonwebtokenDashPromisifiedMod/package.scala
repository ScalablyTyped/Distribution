package typings.jsonwebtokenDashPromisified

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonwebtokenDashPromisifiedMod {
  import typings.jsonwebtokenDashPromisified.Anon_Key
  import typings.node.Buffer
  import typings.std.Error

  type Secret = String | Buffer | Anon_Key
  type SignCallback = js.Function2[/* err */ Error, /* encoded */ String, Unit]
  type VerifyCallback = js.Function2[
    /* err */ JsonWebTokenError | NotBeforeError | TokenExpiredError, 
    /* decoded */ js.Object | String, 
    Unit
  ]
}
