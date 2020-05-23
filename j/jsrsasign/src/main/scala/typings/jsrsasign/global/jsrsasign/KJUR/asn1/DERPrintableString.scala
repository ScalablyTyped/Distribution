package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER PrintableString
  * @param params associative array of parameters (ex. {'str': 'aaa'})
  */
@JSGlobal("jsrsasign.KJUR.asn1.DERPrintableString")
@js.native
class DERPrintableString protected ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractString {
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

