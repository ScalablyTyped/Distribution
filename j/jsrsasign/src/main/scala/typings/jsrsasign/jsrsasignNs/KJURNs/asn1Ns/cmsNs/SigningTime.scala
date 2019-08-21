package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.StringParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.TypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for CMS SigningTime attribute
  * @param params associative array of parameters
  * @description
  * ```
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * AttributeSetValue ::= SET OF ANY
  * SigningTime  ::= Time
  * Time ::= CHOICE {
  *    utcTime UTCTime,
  *    generalTime GeneralizedTime }
  * ```
  * @example
  * o = new KJUR.asn1.cms.SigningTime(); // current time UTCTime by default
  * o = new KJUR.asn1.cms.SigningTime({type: 'gen'}); // current time GeneralizedTime
  * o = new KJUR.asn1.cms.SigningTime({str: '20140517093800Z'}); // specified GeneralizedTime
  * o = new KJUR.asn1.cms.SigningTime({str: '140517093800Z'}); // specified UTCTime
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.SigningTime")
@js.native
class SigningTime () extends Attribute {
  def this(params: StringParam) = this()
  def this(params: TypeParam) = this()
}

