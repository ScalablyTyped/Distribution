package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** base class for ASN.1 DER structured class */
@JSImport("jsrsasign", "KJUR.asn1.DERAbstractStructured")
@js.native
class DERAbstractStructured ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractStructured {
  def this(asn1Array: ArrayParam[typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]) = this()
  /* CompleteClass */
  override var asn1Array: js.Array[typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object] = js.native
  /**
    * append an ASN1Object to internal array
    * @param asn1Object object to add
    */
  /* CompleteClass */
  override def appendASN1Object(asn1Object: typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object): Unit = js.native
  /**
    * set value by array of ASN1Object
    * @param asn1ObjectArray array of ASN1Object to set
    */
  /* CompleteClass */
  override def setByASN1ObjectArray(asn1ObjectArray: js.Array[typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]): String = js.native
}

