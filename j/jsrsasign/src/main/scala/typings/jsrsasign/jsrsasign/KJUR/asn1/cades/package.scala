package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cades {
  
  /**
    * class for OtherHashAlgAndValue ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * OtherHashAlgAndValue ::= SEQUENCE {
    *    hashAlgorithm   AlgorithmIdentifier,
    *    hashValue       OtherHashValue }
    * OtherHashValue ::= OCTET STRING
    * ```
    */
  type OtherHashAlgAndValue = typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
  
  /**
    * class for RFC 5126 CAdES SignaturePolicyIdentifier attribute
    * @param params associative array of parameters
    * @description
    * ```
    * SignaturePolicyIdentifier ::= CHOICE {
    *    signaturePolicyId       SignaturePolicyId,
    *    signaturePolicyImplied  SignaturePolicyImplied } -- not used
    *
    * SignaturePolicyImplied ::= NULL
    * SignaturePolicyId ::= SEQUENCE {
    *    sigPolicyId           SigPolicyId,
    *    sigPolicyHash         SigPolicyHash,
    *    sigPolicyQualifiers   SEQUENCE SIZE (1..MAX) OF
    *                             SigPolicyQualifierInfo OPTIONAL }
    * SigPolicyId ::= OBJECT IDENTIFIER
    * SigPolicyHash ::= OtherHashAlgAndValue
    * ```
    * @example
    * var o = new KJUR.asn1.cades.SignaturePolicyIdentifier({
    *   oid: '1.2.3.4.5',
    *   hash: {alg: 'sha1', hash: 'a1a2a3a4...'}
    * });
    */
  type SignaturePolicyIdentifier = typings.jsrsasign.jsrsasign.KJUR.asn1.cms.Attribute
  
  /**
    * class for RFC 5126 CAdES SignatureTimeStamp attribute
    * @param params associative array of parameters
    * @description
    * ```
    * id-aa-signatureTimeStampToken OBJECT IDENTIFIER ::=
    *    1.2.840.113549.1.9.16.2.14
    * SignatureTimeStampToken ::= TimeStampToken
    * ```
    */
  type SignatureTimeStamp = typings.jsrsasign.jsrsasign.KJUR.asn1.cms.Attribute
}
