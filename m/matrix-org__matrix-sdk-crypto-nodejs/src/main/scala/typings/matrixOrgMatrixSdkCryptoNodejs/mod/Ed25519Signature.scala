package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Ed25519Signature")
@js.native
open class Ed25519Signature protected () extends StObject {
  /**
    * Try to create an Ed25519 signature from an unpadded base64
    * representation.
    */
  def this(signature: String) = this()
  
  /**
    * Serialize a Ed25519 signature to an unpadded base64
    * representation.
    */
  def toBase64(): String = js.native
}
