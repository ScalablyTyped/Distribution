package typings.jsrsasign.jsrsasign.KJUR.asn1

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
trait DERAbstractString extends js.Object {
  var s: String
  def getFreshValueHex(): String
  /**
    * get string value of this string object
    * @return string value of this string object
    */
  def getString(): String
  /**
    * set value by a string
    * @param newS value by a string to set
    */
  def setString(newS: String): Unit
  /**
    * set value by a hexadecimal string
    * @param newHexString value by a hexadecimal string to set
    */
  def setStringHex(newHexString: String): Unit
}

object DERAbstractString {
  @scala.inline
  def apply(
    getFreshValueHex: () => String,
    getString: () => String,
    s: String,
    setString: String => Unit,
    setStringHex: String => Unit
  ): DERAbstractString = {
    val __obj = js.Dynamic.literal(getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getString = js.Any.fromFunction0(getString), s = s.asInstanceOf[js.Any], setString = js.Any.fromFunction1(setString), setStringHex = js.Any.fromFunction1(setStringHex))
    __obj.asInstanceOf[DERAbstractString]
  }
}

