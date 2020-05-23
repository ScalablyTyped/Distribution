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
trait DERSequence extends DERAbstractStructured {
  def getFreshValueHex(): String
}

object DERSequence {
  @scala.inline
  def apply(
    appendASN1Object: ASN1Object => Unit,
    asn1Array: js.Array[ASN1Object],
    getFreshValueHex: () => String,
    setByASN1ObjectArray: js.Array[ASN1Object] => String
  ): DERSequence = {
    val __obj = js.Dynamic.literal(appendASN1Object = js.Any.fromFunction1(appendASN1Object), asn1Array = asn1Array.asInstanceOf[js.Any], getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), setByASN1ObjectArray = js.Any.fromFunction1(setByASN1ObjectArray))
    __obj.asInstanceOf[DERSequence]
  }
}

