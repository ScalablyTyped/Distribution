package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "KeysUploadRequest")
@js.native
open class KeysUploadRequest () extends StObject {
  
  /**
    * A JSON-encoded string containing the rest of the payload: `device_keys`,
    * `one_time_keys`, `fallback_keys`.
    *
    * It represents the body of the HTTP request.
    */
  val body: String = js.native
  
  /** The request ID. */
  val id: String = js.native
  
  /** Get its request type. */
  def `type`: RequestType = js.native
}
