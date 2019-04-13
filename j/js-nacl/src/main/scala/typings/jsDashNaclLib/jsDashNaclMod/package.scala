package typings
package jsDashNaclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDashNaclMod {
  type BoxPublicKey = stdLib.Uint8Array
  type BoxSecretKey = stdLib.Uint8Array
  type CipherText = stdLib.Uint8Array
  type Message = stdLib.Uint8Array
  type MessageWithSignature = stdLib.Uint8Array
  type NaclCallback = js.Function1[/* nacl */ Nacl, scala.Unit]
  type NaclOpts = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Nonce = stdLib.Uint8Array
  type Signature = stdLib.Uint8Array
  type SignerPublicKey = stdLib.Uint8Array
  type SignerSecretKey = stdLib.Uint8Array
  type Stream = stdLib.Uint8Array
  type StreamKey = stdLib.Uint8Array
}
