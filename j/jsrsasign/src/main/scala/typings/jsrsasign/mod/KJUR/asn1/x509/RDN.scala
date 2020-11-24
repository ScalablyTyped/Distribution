package typings.jsrsasign.mod.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSImport("jsrsasign", "KJUR.asn1.x509.RDN")
@js.native
class RDN ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.RDN {
  def this(params: StringParam) = this()
}
/* static members */
@JSImport("jsrsasign", "KJUR.asn1.x509.RDN")
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
