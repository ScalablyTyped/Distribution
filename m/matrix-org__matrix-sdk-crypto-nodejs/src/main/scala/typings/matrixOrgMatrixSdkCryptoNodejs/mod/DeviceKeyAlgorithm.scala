package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "DeviceKeyAlgorithm")
@js.native
open class DeviceKeyAlgorithm () extends StObject {
  
  /**
    * Read the device key algorithm's name. If the name is
    * `Unknown`, one may be interested by the `to_string` method to
    * read the original name.
    */
  def name: DeviceKeyAlgorithmName = js.native
}
