package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.Anon_Sorted
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for Attributes ASN.1 structure for CMS
  * @param params associative array of parameters
  * @description
  * ```
  * Attributes ::= SET OF Attribute
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * ```
  * @example
  * // specify by X500Name and DERInteger
  * o = new KJUR.asn1.cms.AttributeList({sorted: false}); // ASN.1 BER unsorted SET OF
  * o = new KJUR.asn1.cms.AttributeList();  // ASN.1 DER sorted by default
  * o.clear();                              // clear list of Attributes
  * n = o.length();                         // get number of Attribute
  * o.add(new KJUR.asn1.cms.SigningTime()); // add SigningTime attribute
  * hex = o.getEncodedHex();                // get hex encoded ASN.1 data
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.AttributeList")
@js.native
class AttributeList () extends ASN1Object {
  def this(params: Anon_Sorted) = this()
  def add(item: Attribute): Unit = js.native
  def clear(): Unit = js.native
  def length(): Double = js.native
}

