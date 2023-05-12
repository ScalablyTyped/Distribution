package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "Signature")
@js.native
open class Signature () extends StObject {
  
  /** Get the Ed25519 signature, if this is one. */
  def ed25519: Ed25519Signature | Null = js.native
  
  /** Convert the signature to a base64 encoded string. */
  def toBase64(): String = js.native
}
