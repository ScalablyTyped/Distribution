package typings.jsrsasign.mod.KJUR.asn1.x509

import typings.jsrsasign.anon.Asn1params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AlgorithmIdentifier ASN.1 structure class
  * @param params associative array of parameters (ex. {'name': 'SHA1withRSA'})
  * @description
  * The 'params' argument is an associative array and has following parameters:
  *
  * - name: algorithm name (MANDATORY, ex. sha1, SHA256withRSA)
  * - asn1params: explicitly specify ASN.1 object for algorithm. (OPTION)
  * - paramempty: set algorithm parameter to NULL by force.
  * If paramempty is false, algorithm parameter will be set automatically.
  * If paramempty is false and algorithm name is "*withDSA" or "withECDSA" parameter field of
  * AlgorithmIdentifier will be ommitted otherwise
  * it will be NULL by default.
  * (OPTION, DEFAULT = false)
  *
  * @example
  * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "sha1"});
  * // set parameter to NULL authomatically if algorithm name is "*withRSA".
  * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "SHA256withRSA"});
  * // set parameter to NULL authomatically if algorithm name is "rsaEncryption".
  * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "rsaEncryption"});
  * // SHA256withRSA and set parameter empty by force
  * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "SHA256withRSA", paramempty: true});
  */
@JSImport("jsrsasign", "KJUR.asn1.x509.AlgorithmIdentifier")
@js.native
class AlgorithmIdentifier ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AlgorithmIdentifier {
  def this(params: Asn1params) = this()
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
}

