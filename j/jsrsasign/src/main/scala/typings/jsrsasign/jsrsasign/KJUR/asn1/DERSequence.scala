package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER Sequence
  *
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - array - specify array of ASN1Object to set elements of content
  *
  * NOTE: 'params' can be omitted.
  */
@JSGlobal("jsrsasign.KJUR.asn1.DERSequence")
@js.native
class DERSequence () extends DERAbstractStructured {
  def this(params: ArrayParam[ASN1Object]) = this()
  def getFreshValueHex(): String = js.native
}

