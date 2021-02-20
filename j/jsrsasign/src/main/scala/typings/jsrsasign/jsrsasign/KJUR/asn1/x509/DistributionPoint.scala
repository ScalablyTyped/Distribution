package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DistributionPoint ASN.1 structure class
  * @description
  * ```
  * DistributionPoint ::= SEQUENCE {
  *      distributionPoint       [0]     DistributionPointName OPTIONAL,
  *      reasons                 [1]     ReasonFlags OPTIONAL,
  *      cRLIssuer               [2]     GeneralNames OPTIONAL }
  *
  * DistributionPointName ::= CHOICE {
  *      fullName                [0]     GeneralNames,
  *      nameRelativeToCRLIssuer [1]     RelativeDistinguishedName }
  *
  * ReasonFlags ::= BIT STRING {
  *      unused                  (0),
  *      keyCompromise           (1),
  *      cACompromise            (2),
  *      affiliationChanged      (3),
  *      superseded              (4),
  *      cessationOfOperation    (5),
  *      certificateHold         (6),
  *      privilegeWithdrawn      (7),
  *      aACompromise            (8) }
  * ```
  */
@js.native
trait DistributionPoint extends StObject {
  
  def getEncodedHex(): String = js.native
}
object DistributionPoint {
  
  @scala.inline
  def apply(getEncodedHex: () => String): DistributionPoint = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex))
    __obj.asInstanceOf[DistributionPoint]
  }
  
  @scala.inline
  implicit class DistributionPointMutableBuilder[Self <: DistributionPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEncodedHex(value: () => String): Self = StObject.set(x, "getEncodedHex", js.Any.fromFunction0(value))
  }
}
