package typings.jose.mod.JWKS

import typings.jose.mod.JSONWebKeySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWKS.asKeyStore")
@js.native
object asKeyStore extends js.Object {
  def apply(jwks: JSONWebKeySet): KeyStore = js.native
  def apply(jwks: JSONWebKeySet, options: JWKSImportOptions): KeyStore = js.native
}

