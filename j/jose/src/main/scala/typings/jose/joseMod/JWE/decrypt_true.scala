package typings.jose.joseMod.JWE

import typings.jose.joseMod.JWK.Key
import typings.jose.joseMod.JWKS.KeyStore
import typings.jose.joseNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt_true extends js.Object {
  def apply(jwe: String, key: Key, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def apply(jwe: String, key: KeyStore, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def apply(jwe: FlattenedJWE, key: Key, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def apply(jwe: FlattenedJWE, key: KeyStore, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def apply(jwe: GeneralJWE, key: Key, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def apply(jwe: GeneralJWE, key: KeyStore, options: DecryptOptions[`true`]): completeDecrypt = js.native
}

