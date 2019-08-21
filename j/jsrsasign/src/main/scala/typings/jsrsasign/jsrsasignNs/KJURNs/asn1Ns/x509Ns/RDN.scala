package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("jsrsasign.KJUR.asn1.x509.RDN")
@js.native
class RDN () extends ASN1Object {
  def this(params: StringParam) = this()
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
  def addByMultiValuedString(s: String): Unit = js.native
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
  def addByString(s: String): Unit = js.native
}

/* static members */
@JSGlobal("jsrsasign.KJUR.asn1.x509.RDN")
@js.native
object RDN extends js.Object {
  /**
    * parse multi-valued RDN string and split into array of 'AttributeTypeAndValue'
    * @param s multi-valued string of RDN
    * @return array of string of AttributeTypeAndValue
    * @description
    * This static method parses multi-valued RDN string and split into
    * array of AttributeTypeAndValue.
    * @example
    * KJUR.asn1.x509.RDN.parseString("CN=john") → ["CN=john"]
    * KJUR.asn1.x509.RDN.parseString("CN=john+OU=test") → ["CN=john", "OU=test"]
    * KJUR.asn1.x509.RDN.parseString('CN="jo+hn"+OU=test') → ["CN=jo+hn", "OU=test"]
    * KJUR.asn1.x509.RDN.parseString('CN=jo\+hn+OU=test') → ["CN=jo+hn", "OU=test"]
    * KJUR.asn1.x509.RDN.parseString("CN=john+OU=test+OU=t1") → ["CN=john", "OU=test", "OU=t1"]
    */
  def parseString(s: String): js.Array[String] = js.native
}

