package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.Anon_Hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for CMS MessageDigest attribute
  * @param params associative array of parameters
  * @description
  * ```
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * AttributeSetValue ::= SET OF ANY
  * MessageDigest ::= OCTET STRING
  * ```
  * @example
  * o = new KJUR.asn1.cms.MessageDigest({hex: 'a1a2a3a4...'});
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.MessageDigest")
@js.native
class MessageDigest () extends Attribute {
  def this(params: Anon_Hex) = this()
}

