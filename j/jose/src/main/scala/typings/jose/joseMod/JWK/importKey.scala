package typings.jose.joseMod.JWK

import typings.jose.joseMod.JWKECKey
import typings.jose.joseMod.JWKOKPKey
import typings.jose.joseMod.JWKOctKey
import typings.jose.joseMod.JWKRSAKey
import typings.jose.joseMod.KeyParameters
import typings.node.cryptoMod.KeyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.importKey")
@js.native
object importKey extends js.Object {
  def apply(jwk: JWKECKey): ECKey = js.native
  def apply(jwk: JWKOKPKey): OKPKey = js.native
  def apply(jwk: JWKOctKey): OctKey = js.native
  def apply(jwk: JWKRSAKey): RSAKey = js.native
  def apply(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  /*
    * @deprecated in favor of asKey
    */
  def apply(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
}

