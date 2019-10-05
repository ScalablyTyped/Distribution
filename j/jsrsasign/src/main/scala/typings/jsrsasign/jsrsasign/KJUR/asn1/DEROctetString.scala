package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER OctetString
  * @param params associative array of parameters (ex. {'str': 'aaa'})
  * @description
  * This class provides ASN.1 OctetString simple type.
  * Supported "params" attributes are:
  *
  * - str - to set a string as a value
  * - hex - to set a hexadecimal string as a value
  * - obj - to set a encapsulated ASN.1 value by JSON object
  *    which is defined in `KJUR.asn1.ASN1Util.newObject`
  *
  * NOTE: A parameter 'obj' have been supported
  * for "OCTET STRING, encapsulates" structure.
  * since asn1 1.0.11, jsrsasign 6.1.1 (2016-Sep-25).
  * @see KJUR.asn1.DERAbstractString - superclass
  * @example
  * // default constructor
  * o = new KJUR.asn1.DEROctetString();
  * // initialize with string
  * o = new KJUR.asn1.DEROctetString({str: "aaa"});
  * // initialize with hexadecimal string
  * o = new KJUR.asn1.DEROctetString({hex: "616161"});
  * // initialize with ASN1Util.newObject argument
  * o = new KJUR.asn1.DEROctetString({obj: {seq: [{int: 3}, {prnstr: 'aaa'}]}});
  * // above generates a ASN.1 data like this:
  * // OCTET STRING, encapsulates {
  * //   SEQUENCE {
  * //     INTEGER 3
  * //     PrintableString 'aaa'
  * //     }
  * //   }
  */
@JSGlobal("jsrsasign.KJUR.asn1.DEROctetString")
@js.native
class DEROctetString () extends DERAbstractString {
  def this(params: ASN1ObjectParam) = this()
  def this(params: HexParam) = this()
  def this(params: StringParam) = this()
}

