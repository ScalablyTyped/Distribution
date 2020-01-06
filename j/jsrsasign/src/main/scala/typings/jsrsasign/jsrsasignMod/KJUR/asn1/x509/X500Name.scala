package typings.jsrsasign.jsrsasignMod.KJUR.asn1.x509

import typings.jsrsasign.Anon_Certissuer
import typings.jsrsasign.Anon_CertissuerCertsubject
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
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
  def this(params: X500NameParam with Anon_Certissuer) = this()
  def this(params: StringParam with Anon_Certissuer) = this()
  def this(params: Anon_CertissuerCertsubject) = this()
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

