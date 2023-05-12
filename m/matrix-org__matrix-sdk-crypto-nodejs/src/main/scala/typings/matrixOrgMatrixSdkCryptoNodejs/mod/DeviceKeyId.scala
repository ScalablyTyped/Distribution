package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "DeviceKeyId")
@js.native
open class DeviceKeyId protected () extends StObject {
  /** Parse/validate and create a new `DeviceKeyId`. */
  def this(id: String) = this()
  
  /** Returns key algorithm of the device key ID. */
  def algorithm: DeviceKeyAlgorithm = js.native
  
  /** Returns device ID of the device key ID. */
  def deviceId: DeviceId = js.native
}
