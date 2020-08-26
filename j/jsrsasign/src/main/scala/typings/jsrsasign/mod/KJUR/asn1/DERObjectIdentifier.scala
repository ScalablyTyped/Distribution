package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER ObjectIdentifier
  * @param params associative array of parameters (ex. {'oid': '2.5.4.5'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - oid - specify initial ASN.1 value(V) by a oid string (ex. 2.5.4.13)
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
@JSImport("jsrsasign", "KJUR.asn1.DERObjectIdentifier")
@js.native
class DERObjectIdentifier ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERObjectIdentifier {
  def this(params: HexParam) = this()
  def this(params: NameParam) = this()
  def this(params: ObjectIdentifierParam) = this()
}

