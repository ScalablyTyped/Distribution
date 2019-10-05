package typings.jsrsasign.jsrsasign.KJUR.asn1.csr

import typings.jsrsasign.Anon_Csrinfo
import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ASN.1 CertificationRequest structure class
  * @param params associative array of parameters (ex. {})
  * @example
  * csri = new KJUR.asn1.csr.CertificationRequestInfo();
  * csri.setSubjectByParam({'str': '/C=US/O=Test/CN=example.com'});
  * csri.setSubjectPublicKeyByGetKey(pubKeyObj);
  * csr = new KJUR.asn1.csr.CertificationRequest({'csrinfo': csri});
  * csr.sign("SHA256withRSA", prvKeyObj);
  * pem = csr.getPEMString();
  *
  * // -- DEFINITION OF ASN.1 SYNTAX --
  * // CertificationRequest ::= SEQUENCE {
  * //   certificationRequestInfo CertificationRequestInfo,
  * //   signatureAlgorithm       AlgorithmIdentifier{{ SignatureAlgorithms }},
  * //   signature                BIT STRING }
  * //
  * // CertificationRequestInfo ::= SEQUENCE {
  * //   version       INTEGER { v1(0) } (v1,...),
  * //   subject       Name,
  * //   subjectPKInfo SubjectPublicKeyInfo{{ PKInfoAlgorithms }},
  * //   attributes    [0] Attributes{{ CRIAttributes }} }
  */
@JSGlobal("jsrsasign.KJUR.asn1.csr.CertificationRequest")
@js.native
class CertificationRequest () extends ASN1Object {
  def this(params: Anon_Csrinfo) = this()
  /**
    * get PEM formatted certificate signing request (CSR/PKCS#10)
    * @return PEM formatted string of CSR/PKCS#10
    * @description
    * This method is to a get CSR PEM string after signed.
    *
    * @example
    * csr = new KJUR.asn1.csr.CertificationRequest({'csrinfo': csri});
    * csr.sign();
    * pem =  csr.getPEMString();
    * // pem will be following:
    * // -----BEGIN CERTIFICATE REQUEST-----
    * // MII ...snip...
    * // -----END CERTIFICATE REQUEST-----
    */
  def getPEMString(): String = js.native
  /**
    * sign CertificationRequest and set signature value internally
    * @description
    * This method self-signs CertificateRequestInfo with a subject's
    * private key and set signature value internally.
    *
    * @example
    * csr = new KJUR.asn1.csr.CertificationRequest({'csrinfo': csri});
    * csr.sign("SHA256withRSA", prvKeyObj);
    */
  def sign(sigAlgName: String, prvKeyObj: js.Any): Unit = js.native
}

