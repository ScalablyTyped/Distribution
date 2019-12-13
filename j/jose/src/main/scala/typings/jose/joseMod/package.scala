package typings.jose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object joseMod {
  import typings.jose.joseStrings.id_token
  import typings.node.Buffer
  import typings.node.cryptoMod.KeyObject
  import typings.node.cryptoMod.PrivateKeyInput
  import typings.node.cryptoMod.PublicKeyInput

  /* Rewritten from type alias, can be one of: 
    - typings.jose.joseMod.ProduceKeyInput
    - typings.jose.joseMod.JWKS.KeyStore
  */
  type ConsumeKeyInput = _ConsumeKeyInput | KeyObject | KeyInput
  type JWTProfiles = id_token
  type KeyInput = PrivateKeyInput | PublicKeyInput | String | Buffer
  /* Rewritten from type alias, can be one of: 
    - typings.jose.joseMod.JWK.Key
    - typings.node.cryptoMod.KeyObject
    - typings.jose.joseMod.KeyInput
    - typings.jose.joseMod.JWKOctKey
    - typings.jose.joseMod.JWKRSAKey
    - typings.jose.joseMod.JWKECKey
    - typings.jose.joseMod.JWKOKPKey
  */
  type ProduceKeyInput = _ProduceKeyInput | KeyObject | KeyInput
}
