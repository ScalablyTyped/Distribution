package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cadesNs

import typings.jsrsasign.Anon_Hash
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs.Attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier")
@js.native
class SignaturePolicyIdentifier () extends Attribute {
  def this(params: Anon_Hash) = this()
}

