package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ASN1 utilities class */
@JSGlobal("jsrsasign.KJUR.asn1.ASN1Util")
@js.native
class ASN1Util ()
  extends typings.jsrsasign.mod.KJUR.asn1.ASN1Util
object ASN1Util {
  
  @JSGlobal("jsrsasign.KJUR.asn1.ASN1Util")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def getPEMStringFromHex(dataHex: String, pemHeader: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPEMStringFromHex")(dataHex.asInstanceOf[js.Any], pemHeader.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  /* static member */
  inline def oidHexToInt(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("oidHexToInt")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
}
