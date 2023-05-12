package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "CrossSigningStatus")
@js.native
open class CrossSigningStatus () extends StObject {
  
  /** Do we have the master key. */
  def hasMaster: Boolean = js.native
  
  /**
    * Do we have the self signing key, this one is necessary to sign
    * our own devices.
    */
  def hasSelfSigning: Boolean = js.native
  
  /**
    * Do we have the user signing key, this one is necessary to sign
    * other users.
    */
  def hasUserSigning: Boolean = js.native
}
