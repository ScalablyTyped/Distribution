package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute class for base of CMS attribute
  * @param params associative array of parameters
  * @description
  * ```
  * Attributes ::= SET OF Attribute
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * AttributeSetValue ::= SET OF ANY
  * ```
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.Attribute")
@js.native
class Attribute () extends ASN1Object

