package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cadesNs

import typings.jsrsasign.Anon_Alg
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("jsrsasign.KJUR.asn1.cades.OtherHashAlgAndValue")
@js.native
class OtherHashAlgAndValue () extends ASN1Object {
  def this(params: Anon_Alg) = this()
}

