package typings.jose.joseMod.JWS

import typings.jose.joseMod.JWK.Key
import typings.jose.joseMod.JWKS.KeyStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify extends js.Object {
  def apply(jws: String, key: Key): String | js.Object = js.native
  def apply(jws: String, key: KeyStore): String | js.Object = js.native
  def apply(jws: FlattenedJWS, key: Key): String | js.Object = js.native
  def apply(jws: FlattenedJWS, key: KeyStore): String | js.Object = js.native
  def apply(jws: GeneralJWS, key: Key): String | js.Object = js.native
  def apply(jws: GeneralJWS, key: KeyStore): String | js.Object = js.native
}

