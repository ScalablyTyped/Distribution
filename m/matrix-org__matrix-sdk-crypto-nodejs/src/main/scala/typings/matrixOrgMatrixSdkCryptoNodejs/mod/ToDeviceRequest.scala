package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "ToDeviceRequest")
@js.native
open class ToDeviceRequest () extends StObject {
  
  /**
    * A JSON-encoded string containing the rest of the payload: `messages`.
    *
    * It represents the body of the HTTP request.
    */
  val body: String = js.native
  
  /** A string representing the type of event being sent to each devices. */
  val eventType: String = js.native
  
  /** The request ID. */
  val id: String = js.native
  
  /**
    * A string representing a request identifier unique to the access token
    * used to send the request.
    */
  val txnId: String = js.native
  
  /** Get its request type. */
  def `type`: RequestType = js.native
}
