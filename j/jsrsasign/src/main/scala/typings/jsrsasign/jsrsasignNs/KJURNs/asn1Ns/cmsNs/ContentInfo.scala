package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1ObjectParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.TypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ContentInfo ASN.1 structure for CMS
  * @param params associative array of parameters
  * @description
  * ```
  * ContentInfo ::= SEQUENCE {
  *    contentType ContentType,
  *    content [0] EXPLICIT ANY DEFINED BY contentType }
  * ContentType ::= OBJECT IDENTIFIER
  * ```
  * @example
  * a = [new KJUR.asn1.DERInteger({int: 1}),
  *      new KJUR.asn1.DERInteger({int: 2})];
  * seq = new KJUR.asn1.DERSequence({array: a});
  * o = new KJUR.asn1.cms.ContentInfo({type: 'data', obj: seq});
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.ContentInfo")
@js.native
class ContentInfo () extends ASN1Object {
  def this(params: ASN1ObjectParam) = this()
  def this(params: TypeParam) = this()
  def setContentType(params: String): Unit = js.native
}

