package typings.jsrsasign.mod.KJUR.asn1.x509

import typings.jsrsasign.anon.Certissuer
import typings.jsrsasign.anon.StringParamcertissuerstri
import typings.jsrsasign.anon.X500NameParamcertissuerst
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X500NameParam
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
@JSImport("jsrsasign", "KJUR.asn1.x509.X500Name")
@js.native
class X500Name protected ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X500Name {
  def this(params: Certissuer) = this()
  def this(params: StringParamcertissuerstri) = this()
  def this(params: X500NameParamcertissuerst) = this()
  /** hexadecimal string of ASN.1 TLV length(L) */
  /* CompleteClass */
  override var hL: String = js.native
  /** hexadecimal string of ASN.1 TLV tag(T) */
  /* CompleteClass */
  override var hT: String = js.native
  /** hexadecimal string of ASN.1 TLV */
  /* CompleteClass */
  override var hTLV: String = js.native
  /** hexadecimal string of ASN.1 TLV value(V) */
  /* CompleteClass */
  override var hV: String = js.native
  /** flag whether internal data was changed */
  /* CompleteClass */
  override var isModified: String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  /* CompleteClass */
  override def getEncodedHex(): String = js.native
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  /* CompleteClass */
  override def getLengthHexFromValue(): String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  /* CompleteClass */
  override def getValueHex(): String = js.native
  /**
    * set DN by LDAP(RFC 2253) distinguished name string
    * @param dnStr distinguished name by LDAP string (ex. O=aaa,C=US)
    * @example
    * name = new KJUR.asn1.x509.X500Name();
    * name.setByLdapString("CN=foo@example.com,OU=bbb,O=aaa,C=US");
    */
  /* CompleteClass */
  override def setByLdapString(dnStr: String): Unit = js.native
  /**
    * set DN by associative array
    * @param dnObj associative array of DN (ex. {C: "US", O: "aaa"})
    * @example
    * name = new KJUR.asn1.x509.X500Name();
    * name.setByObject({C: "US", O: "aaa", CN="http://example.com/"1});
    */
  /* CompleteClass */
  override def setByObject(dnObj: X500NameParam): Unit = js.native
  /**
    * set DN by OpenSSL oneline distinguished name string
    * @param dnStr distinguished name by string (ex. /C=US/O=aaa)
    * @example
    * name = new KJUR.asn1.x509.X500Name();
    * name.setByString("/C=US/O=aaa/OU=bbb/CN=foo@example.com");
    */
  /* CompleteClass */
  override def setByString(dnStr: String): Unit = js.native
}

/* static members */
@JSImport("jsrsasign", "KJUR.asn1.x509.X500Name")
@js.native
object X500Name extends js.Object {
  /**
    * convert LDAP(RFC 2253) distinguished name format string to OpenSSL oneline format
    * @param s distinguished name string in LDAP(RFC 2253) format (ex. O=test,C=US)
    * @return distinguished name string in OpenSSL oneline format (ex. /C=US/O=test)
    * @description
    * This static method converts a distinguished name string in
    * LDAP(RFC 2253) format to OpenSSL oneline format.
    * @see [jsrsasign wiki](https://github.com/kjur/jsrsasign/wiki/NOTE-distinguished-name-representation-in-jsrsasign):
    * distinguished name string difference between OpenSSL oneline and LDAP(RFC 2253)
    * @example
    * KJUR.asn1.x509.X500Name.ldapToOneline('O=test,C=US') → '/C=US/O=test'
    * KJUR.asn1.x509.X500Name.ldapToOneline('O=a\,a,C=US') → '/C=US/O=a,a'
    * KJUR.asn1.x509.X500Name.ldapToOneline('O=a/a,C=US')  → '/C=US/O=a\/a'
    */
  def ldapToOneline(s: String): String = js.native
  /**
    * convert OpenSSL oneline distinguished name format string to LDAP(RFC 2253) format
    * @param s distinguished name string in OpenSSL oneline format (ex. /C=US/O=test)
    * @return distinguished name string in LDAP(RFC 2253) format (ex. O=test,C=US)
    * @description
    * This static method converts a distinguished name string in OpenSSL oneline
    * format to LDAP(RFC 2253) format.
    * @see [jsrsasign wiki](https://github.com/kjur/jsrsasign/wiki/NOTE-distinguished-name-representation-in-jsrsasign):
    * distinguished name string difference between OpenSSL oneline and LDAP(RFC 2253)
    *
    * @example
    * KJUR.asn1.x509.X500Name.onelineToLDAP("/C=US/O=test") → 'O=test,C=US'
    * KJUR.asn1.x509.X500Name.onelineToLDAP("/C=US/O=a,a") → 'O=a\,a,C=US'
    */
  def onelineToLDAP(s: String): String = js.native
}

