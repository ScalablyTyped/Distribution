package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** base class for ASN.1 DER structured class */
trait DERAbstractStructured extends js.Object {
  var asn1Array: js.Array[ASN1Object]
  /**
    * append an ASN1Object to internal array
    * @param asn1Object object to add
    */
  def appendASN1Object(asn1Object: ASN1Object): Unit
  /**
    * set value by array of ASN1Object
    * @param asn1ObjectArray array of ASN1Object to set
    */
  def setByASN1ObjectArray(asn1ObjectArray: js.Array[ASN1Object]): String
}

object DERAbstractStructured {
  @scala.inline
  def apply(
    appendASN1Object: ASN1Object => Unit,
    asn1Array: js.Array[ASN1Object],
    setByASN1ObjectArray: js.Array[ASN1Object] => String
  ): DERAbstractStructured = {
    val __obj = js.Dynamic.literal(appendASN1Object = js.Any.fromFunction1(appendASN1Object), asn1Array = asn1Array.asInstanceOf[js.Any], setByASN1ObjectArray = js.Any.fromFunction1(setByASN1ObjectArray))
    __obj.asInstanceOf[DERAbstractStructured]
  }
}

