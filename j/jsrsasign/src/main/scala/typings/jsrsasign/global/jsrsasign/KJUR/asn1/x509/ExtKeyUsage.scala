package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.anon.ArrayArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * KeyUsage ASN.1 structure class
  * @param params associative array of parameters
  * @example
  * e1 = new KJUR.asn1.x509.ExtKeyUsage({
  *   critical: true,
  *   array: [
  *     {oid: '2.5.29.37.0'},  // anyExtendedKeyUsage
  *     {name: 'clientAuth'}
  *   ]
  * });
  * // id-ce-extKeyUsage OBJECT IDENTIFIER ::= { id-ce 37 }
  * // ExtKeyUsageSyntax ::= SEQUENCE SIZE (1..MAX) OF KeyPurposeId
  * // KeyPurposeId ::= OBJECT IDENTIFIER
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.ExtKeyUsage")
@js.native
class ExtKeyUsage ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.ExtKeyUsage {
  def this(params: ArrayArray) = this()
}
