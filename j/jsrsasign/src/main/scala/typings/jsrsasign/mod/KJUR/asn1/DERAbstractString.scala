package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * base class for ASN.1 DER string classes
  * @param params associative array of parameters (ex. {'str': 'aaa'})
  * @description
  *
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
@JSImport("jsrsasign", "KJUR.asn1.DERAbstractString")
@js.native
class DERAbstractString ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractString {
  def this(params: HexParam) = this()
  def this(params: StringParam) = this()
  /* CompleteClass */
  override var s: String = js.native
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  /**
    * get string value of this string object
    * @return string value of this string object
    */
  /* CompleteClass */
  override def getString(): String = js.native
  /**
    * set value by a string
    * @param newS value by a string to set
    */
  /* CompleteClass */
  override def setString(newS: String): Unit = js.native
  /**
    * set value by a hexadecimal string
    * @param newHexString value by a hexadecimal string to set
    */
  /* CompleteClass */
  override def setStringHex(newHexString: String): Unit = js.native
}

