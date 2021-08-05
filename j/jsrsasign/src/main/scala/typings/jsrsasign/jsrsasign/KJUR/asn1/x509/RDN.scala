package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RDN (Relative Distinguished Name) ASN.1 structure class
  * @param params associative array of parameters (ex. {'str': 'C=US'})
  * @see KJUR.asn1.x509.X500Name
  * @see KJUR.asn1.x509.RDN
  * @see KJUR.asn1.x509.AttributeTypeAndValue
  * @description
  * This class provides RelativeDistinguishedName ASN.1 class structure
  * defined in [RFC 2253 section 2](https://tools.ietf.org/html/rfc2253#section-2).
  * ```
  * RelativeDistinguishedName ::= SET SIZE (1..MAX) OF
  *   AttributeTypeAndValue
  *
  * AttributeTypeAndValue ::= SEQUENCE {
  *   type  AttributeType,
  *   value AttributeValue }
  * ```
  *
  * NOTE: Multi-valued RDN is supported since jsrsasign 6.2.1 asn1x509 1.0.17.
  * @example
  * rdn = new KJUR.asn1.x509.RDN({str: "CN=test"});
  * rdn = new KJUR.asn1.x509.RDN({str: "O=a+O=bb+O=c"}); // multi-valued
  * rdn = new KJUR.asn1.x509.RDN({str: "O=a+O=b\\+b+O=c"}); // plus escaped
  * rdn = new KJUR.asn1.x509.RDN({str: "O=a+O=\"b+b\"+O=c"}); // double quoted
  */
trait RDN
  extends StObject
     with ASN1Object {
  
  /**
    * add one AttributeTypeAndValue by multi-valued string
    * @param s string of multi-valued RDN
    * @description
    * This method add multi-valued RDN to RDN object.
    * @example
    * rdn = new KJUR.asn1.x509.RDN();
    * rdn.addByMultiValuedString("CN=john+O=test");
    * rdn.addByMultiValuedString("O=a+O=b\+b\+b+O=c"); // multi-valued RDN with quoted plus
    * rdn.addByMultiValuedString("O=a+O=\"b+b+b\"+O=c"); // multi-valued RDN with quoted quotation
    */
  def addByMultiValuedString(s: String): Unit
  
  /**
    * add one AttributeTypeAndValue by string
    * @param s string of AttributeTypeAndValue
    * @return unspecified
    * @description
    * This method adds one AttributeTypeAndValue to RDN object.
    * @example
    * rdn = new KJUR.asn1.x509.RDN();
    * rdn.addByString("CN=john");
    * rdn.addByString("serialNumber=1234"); // for multi-valued RDN
    */
  def addByString(s: String): Unit
}
object RDN {
  
  inline def apply(
    addByMultiValuedString: String => Unit,
    addByString: String => Unit,
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String
  ): RDN = {
    val __obj = js.Dynamic.literal(addByMultiValuedString = js.Any.fromFunction1(addByMultiValuedString), addByString = js.Any.fromFunction1(addByString), getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDN]
  }
  
  extension [Self <: RDN](x: Self) {
    
    inline def setAddByMultiValuedString(value: String => Unit): Self = StObject.set(x, "addByMultiValuedString", js.Any.fromFunction1(value))
    
    inline def setAddByString(value: String => Unit): Self = StObject.set(x, "addByString", js.Any.fromFunction1(value))
  }
}
