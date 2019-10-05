package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** base class for ASN.1 DER structured class */
@JSGlobal("jsrsasign.KJUR.asn1.DERAbstractStructured")
@js.native
class DERAbstractStructured () extends js.Object {
  def this(asn1Array: ArrayParam[ASN1Object]) = this()
  var asn1Array: js.Array[ASN1Object] = js.native
  /**
    * append an ASN1Object to internal array
    * @param asn1Object object to add
    */
  def appendASN1Object(asn1Object: ASN1Object): Unit = js.native
  /**
    * set value by array of ASN1Object
    * @param asn1ObjectArray array of ASN1Object to set
    */
  def setByASN1ObjectArray(asn1ObjectArray: js.Array[ASN1Object]): String = js.native
}

