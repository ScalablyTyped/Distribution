package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "RoomMessageRequest")
@js.native
open class RoomMessageRequest () extends StObject {
  
  /** A JSON-encoded string containing the message's content. */
  val body: String = js.native
  
  /** A string representing the type of event to be sent. */
  val eventType: String = js.native
  
  /** The request ID. */
  val id: String = js.native
  
  /** A string representing the room to send the event to. */
  val roomId: String = js.native
  
  /**
    * A string representing the transaction ID for this event.
    *
    * Clients should generate an ID unique across requests with the same
    * access token; it will be used by the server to ensure idempotency of
    * requests.
    */
  val txnId: String = js.native
  
  /** Get its request type. */
  def `type`: RequestType = js.native
}
