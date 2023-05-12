package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Curve25519PublicKey")
@js.native
open class Curve25519PublicKey () extends StObject {
  
  /** The number of bytes a Curve25519 public key has. */
  def length: Double = js.native
  
  /**
    * Serialize an Curve25519 public key to an unpadded base64
    * representation.
    */
  def toBase64(): String = js.native
}
