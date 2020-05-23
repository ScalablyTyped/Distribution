package typings.jsrsasign.jsrsasign.KJUR.asn1.cms

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for EncapsulatedContentInfo ASN.1 structure for CMS
  * @param params associative array of parameters
  * @description
  * ```
  * EncapsulatedContentInfo ::= SEQUENCE {
  *    eContentType ContentType,
  *    eContent [0] EXPLICIT OCTET STRING OPTIONAL }
  * ContentType ::= OBJECT IDENTIFIER
  * ```
  * @example
  * o = new KJUR.asn1.cms.EncapsulatedContentInfo();
  * o.setContentType('1.2.3.4.5');     // specify eContentType by OID
  * o.setContentType('data');          // specify eContentType by name
  * o.setContentValueHex('a1a2a4...'); // specify eContent data by hex string
  * o.setContentValueStr('apple');     // specify eContent data by UTF-8 string
  * // for detached contents (i.e. data not concluded in eContent)
  * o.isDetached = true;               // false as default
  */
@js.native
trait EncapsulatedContentInfo extends ASN1Object {
  def setContentType(nameOrOid: String): Unit = js.native
  def setContentValue(params: HexParam): Unit = js.native
  def setContentValue(params: StringParam): Unit = js.native
  def setContentValueHex(valueHex: String): Unit = js.native
  def setContentValueStr(valueStr: String): Unit = js.native
}

