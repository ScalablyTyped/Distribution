package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * X500Name ASN.1 structure class
  * @param params associative array of parameters (ex. {'str': '/C=US/O=a'})
  * @see KJUR.asn1.x509.X500Name
  * @see KJUR.asn1.x509.RDN
  * @see KJUR.asn1.x509.AttributeTypeAndValue
  * @description
  * This class provides DistinguishedName ASN.1 class structure
  * defined in [RFC 2253 section 2](https://tools.ietf.org/html/rfc2253#section-2).
  * ```
  * DistinguishedName ::= RDNSequence
  *
  * RDNSequence ::= SEQUENCE OF RelativeDistinguishedName
  *
  * RelativeDistinguishedName ::= SET SIZE (1..MAX) OF
  *   AttributeTypeAndValue
  *
  * AttributeTypeAndValue ::= SEQUENCE {
  *   type  AttributeType,
  *   value AttributeValue }
  * ```
  *
  * For string representation of distinguished name in jsrsasign,
  * OpenSSL oneline format is used. Please see [wiki article](https://github.com/kjur/jsrsasign/wiki/NOTE-distinguished-name-representation-in-jsrsasign) for it.
  *
  * NOTE: Multi-valued RDN is supported since jsrsasign 6.2.1 asn1x509 1.0.17.
  * @example
  * // 1. construct with string
  * o = new KJUR.asn1.x509.X500Name({str: "/C=US/O=aaa/OU=bbb/CN=foo@example.com"});
  * o = new KJUR.asn1.x509.X500Name({str: "/C=US/O=aaa+CN=contact@example.com"}); // multi valued
  * // 2. construct by object
  * o = new KJUR.asn1.x509.X500Name({C: "US", O: "aaa", CN: "http://example.com/"});
  */
trait X500Name extends ASN1Object {
  /**
    * set DN by LDAP(RFC 2253) distinguished name string
    * @param dnStr distinguished name by LDAP string (ex. O=aaa,C=US)
    * @example
    * name = new KJUR.asn1.x509.X500Name();
    * name.setByLdapString("CN=foo@example.com,OU=bbb,O=aaa,C=US");
    */
  def setByLdapString(dnStr: String): Unit
  /**
    * set DN by associative array
    * @param dnObj associative array of DN (ex. {C: "US", O: "aaa"})
    * @example
    * name = new KJUR.asn1.x509.X500Name();
    * name.setByObject({C: "US", O: "aaa", CN="http://example.com/"1});
    */
  def setByObject(dnObj: X500NameParam): Unit
  /**
    * set DN by OpenSSL oneline distinguished name string
    * @param dnStr distinguished name by string (ex. /C=US/O=aaa)
    * @example
    * name = new KJUR.asn1.x509.X500Name();
    * name.setByString("/C=US/O=aaa/OU=bbb/CN=foo@example.com");
    */
  def setByString(dnStr: String): Unit
}

object X500Name {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setByLdapString: String => Unit,
    setByObject: X500NameParam => Unit,
    setByString: String => Unit
  ): X500Name = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByLdapString = js.Any.fromFunction1(setByLdapString), setByObject = js.Any.fromFunction1(setByObject), setByString = js.Any.fromFunction1(setByString))
    __obj.asInstanceOf[X500Name]
  }
}

