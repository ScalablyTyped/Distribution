package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_HashAlgHashValue
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP MessageImprint ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * MessageImprint ::= SEQUENCE  {
  *      hashAlgorithm                AlgorithmIdentifier,
  *      hashedMessage                OCTET STRING  }
  * ```
  * @example
  * o = new KJUR.asn1.tsp.MessageImprint({hashAlg: 'sha1',
  *                                       hashValue: '1f3dea...'});
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.MessageImprint")
@js.native
class MessageImprint () extends ASN1Object {
  def this(params: Anon_HashAlgHashValue) = this()
}

