package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "MaybeSignature")
@js.native
open class MaybeSignature () extends StObject {
  
  /**
    * The base64 encoded string that is claimed to contain a
    * signature but could not be decoded, if any.
    */
  def invalidSignatureSource: String | Null = js.native
  
  /** Check whether the signature could not be successfully decoded. */
  def isInvalid: Boolean = js.native
  
  /** Check whether the signature has been successfully decoded. */
  def isValid: Boolean = js.native
  
  /** The signature, if successfully decoded. */
  def signature: Signature | Null = js.native
}
