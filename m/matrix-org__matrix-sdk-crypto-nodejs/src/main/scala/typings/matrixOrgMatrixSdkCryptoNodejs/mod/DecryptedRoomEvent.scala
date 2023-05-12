package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "DecryptedRoomEvent")
@js.native
open class DecryptedRoomEvent () extends StObject {
  
  /** The JSON-encoded decrypted event. */
  val event: String = js.native
  
  /**
    * Chain of Curve25519 keys through which this session was
    * forwarded, via `m.forwarded_room_key` events.
    */
  def forwardingCurve25519KeyChain: js.Array[String] = js.native
  
  /**
    * The user ID of the event sender, note this is untrusted data
    * unless the `verification_state` is as well trusted.
    */
  def sender: UserId | Null = js.native
  
  /**
    * The signing Ed25519 key that have created the megolm key that
    * was used to decrypt this session.
    */
  def senderClaimedEd25519Key: String | Null = js.native
  
  /**
    * The Curve25519 key of the device that created the megolm
    * decryption key originally.
    */
  def senderCurve25519Key: String | Null = js.native
  
  /**
    * The device ID of the device that sent us the event, note this
    * is untrusted data unless `verification_state` is as well
    * trusted.
    */
  def senderDevice: DeviceId | Null = js.native
  
  /**
    * The verification state of the device that sent us the event,
    * note this is the state of the device at the time of
    * decryption. It may change in the future if a device gets
    * verified or deleted.
    */
  def shieldState(strict: Boolean): ShieldState | Null = js.native
}
