package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "EncryptionSettings")
@js.native
/** Create a new `EncryptionSettings` with default values. */
open class EncryptionSettings () extends StObject {
  
  /** The encryption algorithm that should be used in the room. */
  var algorithm: EncryptionAlgorithm = js.native
  
  /**
    * The history visibility of the room when the session was
    * created.
    */
  var historyVisibility: HistoryVisibility = js.native
  
  /**
    * Should untrusted devices receive the room key, or should they be
    * excluded from the conversation.
    */
  var onlyAllowTrustedDevices: Boolean = js.native
  
  /**
    * How long the session should be used before changing it,
    * expressed in microseconds.
    */
  var rotationPeriod: js.BigInt = js.native
  
  /** How many messages should be sent before changing the session. */
  var rotationPeriodMessages: js.BigInt = js.native
}
