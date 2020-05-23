package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
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
class DERSequence ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERSequence {
  def this(params: ArrayParam[typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]) = this()
  /* CompleteClass */
  override var asn1Array: js.Array[typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object] = js.native
  /**
    * append an ASN1Object to internal array
    * @param asn1Object object to add
    */
  /* CompleteClass */
  override def appendASN1Object(asn1Object: typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object): Unit = js.native
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  /**
    * set value by array of ASN1Object
    * @param asn1ObjectArray array of ASN1Object to set
    */
  /* CompleteClass */
  override def setByASN1ObjectArray(asn1ObjectArray: js.Array[typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]): String = js.native
}

