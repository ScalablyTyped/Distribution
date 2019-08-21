package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.Anon_E
import typings.jsrsasign.Anon_EciObj
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import typings.jsrsasign.jsrsasignNs.KJURNs.cryptoNs.DSA
import typings.jsrsasign.jsrsasignNs.KJURNs.cryptoNs.ECDSA
import typings.jsrsasign.jsrsasignNs.KJURNs.jwsNs.JWSNs.JsonWebKey
import typings.jsrsasign.jsrsasignNs.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for SignerInfo ASN.1 structure of CMS SignedData
  * @param params associative array of parameters
  * @description
  * ```
  * SignerInfo ::= SEQUENCE {
  *    version CMSVersion,
  *    sid SignerIdentifier,
  *    digestAlgorithm DigestAlgorithmIdentifier,
  *    signedAttrs [0] IMPLICIT SignedAttributes OPTIONAL,
  *    signatureAlgorithm SignatureAlgorithmIdentifier,
  *    signature SignatureValue,
  *    unsignedAttrs [1] IMPLICIT UnsignedAttributes OPTIONAL }
  * ```
  * @example
  * o = new KJUR.asn1.cms.SignerInfo();
  * o.setSignerIdentifier(certPEMstring);
  * o.dSignedAttrs.add(new KJUR.asn1.cms.ContentType({name: 'data'}));
  * o.dSignedAttrs.add(new KJUR.asn1.cms.MessageDigest({hex: 'a1b2...'}));
  * o.dSignedAttrs.add(new KJUR.asn1.cms.SigningTime());
  * o.sign(privteKeyParam, "SHA1withRSA");
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.SignerInfo")
@js.native
class SignerInfo () extends ASN1Object {
  def this(params: String) = this()
  def addUnsigned(attr: Attribute): Unit = js.native
  /**
    * set ContentType/MessageDigest/DigestAlgorithms for SignerInfo/SignedData
    * @param params JSON parameter to set content related field
    * @description
    * This method will specify following fields by a parameters:
    *
    * - add ContentType signed attribute by encapContentInfo
    * - add MessageDigest signed attribute by encapContentInfo and hashAlg
    * - add a hash algorithm used in MessageDigest to digestAlgorithms field of SignedData
    * - set a hash algorithm used in MessageDigest to digestAlgorithm field of SignerInfo
    *
    * Argument 'params' is an associative array having following elements:
    *
    * - eciObj - `KJUR.asn1.cms.EncapsulatedContentInfo` object
    * - sdObj - `KJUR.asn1.cms.SignedData` object (Option) to set DigestAlgorithms
    * - hashAlg - string of hash algorithm name which is used for MessageDigest attribute
    *
    * some of elements can be omited.
    * @example
    * sd = new KJUR.asn1.cms.SignedData();
    * signerInfo.setForContentAndHash({sdObj: sd,
    *                                  eciObj: sd.dEncapContentInfo,
    *                                  hashAlg: 'sha256'});
    */
  def setForContentAndHash(params: Anon_EciObj): Unit = js.native
  def setSignerIdentifier(params: String): Unit = js.native
  def sign(keyParam: String, sigAlg: String): Unit = js.native
  def sign(keyParam: Anon_E, sigAlg: String): Unit = js.native
  def sign(keyParam: DSA, sigAlg: String): Unit = js.native
  def sign(keyParam: ECDSA, sigAlg: String): Unit = js.native
  def sign(keyParam: JsonWebKey, sigAlg: String): Unit = js.native
  def sign(keyParam: RSAKey, sigAlg: String): Unit = js.native
}

