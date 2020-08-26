package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait CRLDistributionPoints extends Extension {
  def getExtnValueHex(): String = js.native
  def setByDPArray(dpArray: js.Array[ASN1Object]): Unit = js.native
  def setByOneURI(uri: String): Unit = js.native
}

object CRLDistributionPoints {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getExtnValueHex = js.Any.fromFunction0(getExtnValueHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByDPArray = js.Any.fromFunction1(setByDPArray), setByOneURI = js.Any.fromFunction1(setByOneURI))
    __obj.asInstanceOf[CRLDistributionPoints]
  }
  @scala.inline
  implicit class CRLDistributionPointsOps[Self <: CRLDistributionPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetExtnValueHex(value: () => String): Self = this.set("getExtnValueHex", js.Any.fromFunction0(value))
    @scala.inline
    def setSetByDPArray(value: js.Array[ASN1Object] => Unit): Self = this.set("setByDPArray", js.Any.fromFunction1(value))
    @scala.inline
    def setSetByOneURI(value: String => Unit): Self = this.set("setByOneURI", js.Any.fromFunction1(value))
  }
  
}

