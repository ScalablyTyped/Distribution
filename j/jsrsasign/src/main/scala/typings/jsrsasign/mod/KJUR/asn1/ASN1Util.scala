package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.jsrsasign.BigInteger
import typings.jsrsasign.jsrsasign.KJUR.asn1.ASNObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ASN1 utilities class */
@JSImport("jsrsasign", "KJUR.asn1.ASN1Util")
@js.native
open class ASN1Util ()
  extends StObject
     with typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Util {
  
  /* CompleteClass */
  override def bigIntToMinTwosComplementsHex(bigIntegerValue: BigInteger): String = js.native
  
  /* CompleteClass */
  override def integerToByteHex(i: Double): String = js.native
  
  /**
    * get encoded hexadecimal string of ASN1Object specifed by JSON parameters
    *
    * @param param JSON parameter to generate ASN1Object
    * @return hexadecimal string of ASN1Object
    * @description
    * As for ASN.1 object representation of JSON object,
    * please see `newObject`.
    * @example
    * jsonToASN1HEX({'prnstr': 'aaa'});
    */
  /* CompleteClass */
  override def jsonToASN1HEX(param: ASNObject): String = js.native
  
  /**
    * generate ASN1Object specifed by JSON parameters
    * @param param JSON parameter to generate ASN1Object
    * @description
    * generate any ASN1Object specified by JSON param
    * including ASN.1 primitive or structured.
    * Generally 'param' can be described as follows:
    * ```
    * {TYPE-OF-ASNOBJ: ASN1OBJ-PARAMETER}
    * ```
    * 'TYPE-OF-ASN1OBJ' can be one of following symbols:
    *
    * - 'bool' - DERBoolean
    * - 'int' - DERInteger
    * - 'bitstr' - DERBitString
    * - 'octstr' - DEROctetString
    * - 'null' - DERNull
    * - 'oid' - DERObjectIdentifier
    * - 'enum' - DEREnumerated
    * - 'utf8str' - DERUTF8String
    * - 'numstr' - DERNumericString
    * - 'prnstr' - DERPrintableString
    * - 'telstr' - DERTeletexString
    * - 'ia5str' - DERIA5String
    * - 'utctime' - DERUTCTime
    * - 'gentime' - DERGeneralizedTime
    * - 'seq' - DERSequence
    * - 'set' - DERSet
    * - 'tag' - DERTaggedObject
    *
    * @example
    * newObject({'prnstr': 'aaa'});
    * newObject({'seq': [{'int': 3}, {'prnstr': 'aaa'}]})
    * // ASN.1 Tagged Object
    * newObject({'tag': {'tag': 'a1',
    *                    'explicit': true,
    *                    'obj': {'seq': [{'int': 3}, {'prnstr': 'aaa'}]}}});
    * // more simple representation of ASN.1 Tagged Object
    * newObject({'tag': ['a1',
    *                    true,
    *                    {'seq': [
    *                      {'int': 3},
    *                      {'prnstr': 'aaa'}]}
    *                   ]});
    */
  /* CompleteClass */
  override def newObject(param: ASNObject): typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object = js.native
}
object ASN1Util {
  
  @JSImport("jsrsasign", "KJUR.asn1.ASN1Util")
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
