package typings.jose.joseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JWK {
  import typings.node.Buffer
  import typings.node.cryptoMod.PrivateKeyInput
  import typings.node.cryptoMod.PublicKeyInput

  type KeyInput = PrivateKeyInput | PublicKeyInput | String | Buffer
}
