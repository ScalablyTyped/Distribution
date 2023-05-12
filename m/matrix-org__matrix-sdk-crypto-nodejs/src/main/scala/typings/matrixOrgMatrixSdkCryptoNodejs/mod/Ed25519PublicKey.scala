package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Ed25519PublicKey")
@js.native
open class Ed25519PublicKey () extends StObject {
  
  /** The number of bytes an Ed25519 public key has. */
  def length: Double = js.native
  
  /**
    * Serialize an Ed25519 public key to an unpadded base64
    * representation.
    */
  def toBase64(): String = js.native
}
