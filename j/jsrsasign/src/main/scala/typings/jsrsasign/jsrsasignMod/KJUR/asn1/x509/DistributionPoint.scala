package typings.jsrsasign.jsrsasignMod.KJUR.asn1.x509

import typings.jsrsasign.Anon_Dpobj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("jsrsasign", "KJUR.asn1.x509.DistributionPoint")
@js.native
class DistributionPoint ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.DistributionPoint {
  def this(params: Anon_Dpobj) = this()
}

