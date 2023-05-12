package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "IdentityKeys")
@js.native
open class IdentityKeys () extends StObject {
  
  /** The Curve25519 public key, used for establish shared secrets. */
  def curve25519: Curve25519PublicKey = js.native
  
  /** The Ed25519 public key, used for signing. */
  def ed25519: Ed25519PublicKey = js.native
}
