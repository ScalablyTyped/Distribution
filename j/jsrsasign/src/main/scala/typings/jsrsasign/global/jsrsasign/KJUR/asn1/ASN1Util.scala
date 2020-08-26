package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ASN1 utilities class */
@JSGlobal("jsrsasign.KJUR.asn1.ASN1Util")
@js.native
class ASN1Util ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Util

/* static members */
@JSGlobal("jsrsasign.KJUR.asn1.ASN1Util")
@js.native
object ASN1Util extends js.Object {
  /**
    * get PEM string from hexadecimal data and header string
    * @param dataHex hexadecimal string of PEM body
    * @param pemHeader PEM header string (ex. 'RSA PRIVATE KEY')
    * @return PEM formatted string of input data
    * @description
    * This method converts a hexadecimal string to a PEM string with
    * a specified header. Its line break will be CRLF("\r\n").
    * @example
    * var pem = KJUR.asn1.ASN1Util.getPEMStringFromHex('616161', 'RSA PRIVATE KEY');
    * // value of pem will be:
    * -----BEGIN PRIVATE KEY-----
    * YWFh
    * -----END PRIVATE KEY-----
    */
  def getPEMStringFromHex(dataHex: String, pemHeader: String): String = js.native
  /**
    * get dot noted oid number string from hexadecimal value of OID
    *
    * @param hex hexadecimal value of object identifier
    * @return dot noted string of object identifier
    * @description
    * This static method converts from hexadecimal string representation of
    * ASN.1 value of object identifier to oid number string.
    * @example
    * KJUR.asn1.ASN1Util.oidHexToInt('550406') → "2.5.4.6"
    */
  def oidHexToInt(hex: String): String = js.native
}

