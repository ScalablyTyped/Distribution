package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.Anon_Name
import typings.jsrsasign.Anon_Oid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for CMS ContentType attribute
  * @param params associative array of parameters
  * @description
  * ```
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * AttributeSetValue ::= SET OF ANY
  * ContentType ::= OBJECT IDENTIFIER
  * ```
  * @example
  * o = new KJUR.asn1.cms.ContentType({name: 'data'});
  * o = new KJUR.asn1.cms.ContentType({oid: '1.2.840.113549.1.9.16.1.4'});
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.ContentType")
@js.native
class ContentType () extends Attribute {
  def this(params: Anon_Name) = this()
  def this(params: Anon_Oid) = this()
}

