package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.AnonUri
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
@JSGlobal("jsrsasign.KJUR.asn1.x509.CRLDistributionPoints")
@js.native
class CRLDistributionPoints () extends Extension {
  def this(params: AnonUri) = this()
  def getExtnValueHex(): String = js.native
  def setByDPArray(dpArray: js.Array[ASN1Object]): Unit = js.native
  def setByOneURI(uri: String): Unit = js.native
}

