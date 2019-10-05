package typings.jose.joseMod.JWT

import typings.jose.joseMod.JWK.Key
import typings.jose.joseMod.JWKS.KeyStore
import typings.jose.joseNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.verify")
@js.native
object verify_false extends js.Object {
  def apply(jwt: String, key: Key, options: VerifyOptions[`false`]): js.Object = js.native
  def apply(jwt: String, key: KeyStore, options: VerifyOptions[`false`]): js.Object = js.native
}

