package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ASN.1 CertID class for OCSP
  * @param params associative array of parameters
  * @description
  * CertID ASN.1 class is defined in
  * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
  * ```
  * CertID ::= SEQUENCE {
  *   hashAlgorithm   AlgorithmIdentifier,
  *   issuerNameHash  OCTET STRING, -- Hash of issuer's DN
  *   issuerKeyHash   OCTET STRING, -- Hash of issuer's public key
  *   serialNumber    CertificateSerialNumber }
  * ```
  * @example
  * // default constructor
  * o = new KJUR.asn1.ocsp.CertID();
  * // constructor with certs (sha1 is used by default)
  * o = new KJUR.asn1.ocsp.CertID({issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN..."});
  * // constructor with certs and sha256
  * o = new KJUR.asn1.ocsp.CertID({issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"});
  * // constructor with values
  * o = new KJUR.asn1.ocsp.CertID({namehash: "1a...", keyhash: "ad...", serial: "1234", alg: "sha256"});
  */
@js.native
trait CertID extends ASN1Object {
  /**
    * set CertID ASN.1 object by PEM certificates.
    * @param issuerCert string of PEM issuer certificate
    * @param subjectCert string of PEM subject certificate to be verified by OCSP
    * @param algName hash algorithm name used for above arguments (ex. "sha1") DEFAULT: sha1
    * @example
    * o = new KJUR.asn1.ocsp.CertID();
    * o.setByCert("-----BEGIN...", "-----BEGIN..."); // sha1 is used by default
    * o.setByCert("-----BEGIN...", "-----BEGIN...", "sha256");
    */
  def setByCert(issuerCert: String, subjectCert: String): Unit = js.native
  def setByCert(issuerCert: String, subjectCert: String, algName: String): Unit = js.native
  /**
    * set CertID ASN.1 object by values.
    * @param issuerNameHashHex hexadecimal string of hash value of issuer name
    * @param issuerKeyHashHex hexadecimal string of hash value of issuer public key
    * @param serialNumberHex hexadecimal string of certificate serial number to be verified
    * @param algName hash algorithm name used for above arguments (ex. "sha1") DEFAULT: sha1
    * @example
    * o = new KJUR.asn1.ocsp.CertID();
    * o.setByValue("1fac...", "fd3a...", "1234"); // sha1 is used by default
    * o.setByValue("1fac...", "fd3a...", "1234", "sha256");
    */
  def setByValue(issuerNameHashHex: String, issuerKeyHashHex: String, serialNumberHex: String): Unit = js.native
  def setByValue(issuerNameHashHex: String, issuerKeyHashHex: String, serialNumberHex: String, algName: String): Unit = js.native
}

