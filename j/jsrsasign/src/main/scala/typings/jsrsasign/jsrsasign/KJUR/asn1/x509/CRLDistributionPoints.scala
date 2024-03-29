package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CRLDistributionPoints ASN.1 structure class
  * @param params associative array of parameters (ex. {'uri': 'http://a.com/', 'critical': true})
  * @description
  * ```
  * id-ce-cRLDistributionPoints OBJECT IDENTIFIER ::=  { id-ce 31 }
  *
  * CRLDistributionPoints ::= SEQUENCE SIZE (1..MAX) OF DistributionPoint
  *
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
trait CRLDistributionPoints
  extends StObject
     with Extension {
  
  def getExtnValueHex(): String
  
  def setByDPArray(dpArray: js.Array[ASN1Object]): Unit
  
  def setByOneURI(uri: String): Unit
}
object CRLDistributionPoints {
  
  inline def apply(
    getEncodedHex: () => String,
    getExtnValueHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setByDPArray: js.Array[ASN1Object] => Unit,
    setByOneURI: String => Unit
  ): CRLDistributionPoints = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getExtnValueHex = js.Any.fromFunction0(getExtnValueHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByDPArray = js.Any.fromFunction1(setByDPArray), setByOneURI = js.Any.fromFunction1(setByOneURI), params = null)
    __obj.asInstanceOf[CRLDistributionPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CRLDistributionPoints] (val x: Self) extends AnyVal {
    
    inline def setGetExtnValueHex(value: () => String): Self = StObject.set(x, "getExtnValueHex", js.Any.fromFunction0(value))
    
    inline def setSetByDPArray(value: js.Array[ASN1Object] => Unit): Self = StObject.set(x, "setByDPArray", js.Any.fromFunction1(value))
    
    inline def setSetByOneURI(value: String => Unit): Self = StObject.set(x, "setByOneURI", js.Any.fromFunction1(value))
  }
}
