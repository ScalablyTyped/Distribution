package typings.jsNacl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoxPublicKey = typings.std.Uint8Array
  type BoxSecretKey = typings.std.Uint8Array
  type CipherText = typings.std.Uint8Array
  type Message = typings.std.Uint8Array
  type MessageWithSignature = typings.std.Uint8Array
  type NaclCallback = js.Function1[/* nacl */ typings.jsNacl.mod.Nacl, scala.Unit]
  type NaclOpts = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Nonce = typings.std.Uint8Array
  type Signature = typings.std.Uint8Array
  type SignerPublicKey = typings.std.Uint8Array
  type SignerSecretKey = typings.std.Uint8Array
  type Stream = typings.std.Uint8Array
  type StreamKey = typings.std.Uint8Array
}
