package typings.jsDashNacl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDashNaclMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Uint8Array

  type BoxPublicKey = Uint8Array
  type BoxSecretKey = Uint8Array
  type CipherText = Uint8Array
  type Message = Uint8Array
  type MessageWithSignature = Uint8Array
  type NaclCallback = js.Function1[/* nacl */ Nacl, Unit]
  type NaclOpts = StringDictionary[js.Any]
  type Nonce = Uint8Array
  type Signature = Uint8Array
  type SignerPublicKey = Uint8Array
  type SignerSecretKey = Uint8Array
  type Stream = Uint8Array
  type StreamKey = Uint8Array
}
