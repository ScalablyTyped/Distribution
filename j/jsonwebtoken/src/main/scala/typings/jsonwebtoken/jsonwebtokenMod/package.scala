package typings.jsonwebtoken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonwebtokenMod {
  import typings.jsonwebtoken.Anon_Key
  import typings.node.Buffer
  import typings.std.Error

  type GetPublicKeyOrSecret = js.Function2[/* header */ JwtHeader, /* callback */ SigningKeyCallback, Unit]
  type Secret = String | Buffer | Anon_Key
  type SignCallback = js.Function2[/* err */ Error, /* encoded */ String, Unit]
  type SigningKeyCallback = js.Function2[/* err */ js.Any, /* signingKey */ js.UndefOr[Secret], Unit]
  type VerifyCallback = js.Function2[/* err */ VerifyErrors, /* decoded */ js.Object | String, Unit]
}
