package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`2`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
  - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
  - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`2`
  - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`3`
*/
trait DeviceKeyAlgorithmName extends StObject
object DeviceKeyAlgorithmName {
  
  /** The Curve25519 ECDH algorithm. */
  inline def Curve25519: `1` = 1.asInstanceOf[`1`]
  
  /** The Ed25519 signature algorithm. */
  inline def Ed25519: `0` = 0.asInstanceOf[`0`]
  
  /**
    * The Curve25519 ECDH algorithm, but the key also contains
    * signatures.
    */
  inline def SignedCurve25519: `2` = 2.asInstanceOf[`2`]
  
  /** An unknown device key algorithm. */
  inline def Unknown: `3` = 3.asInstanceOf[`3`]
}
