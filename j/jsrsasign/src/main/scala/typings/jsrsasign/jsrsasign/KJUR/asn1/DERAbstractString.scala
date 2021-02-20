package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait DERAbstractString extends StObject {
  
  def getFreshValueHex(): String = js.native
  
  /**
    * get string value of this string object
    * @return string value of this string object
    */
  def getString(): String = js.native
  
  var s: String = js.native
  
  /**
    * set value by a string
    * @param newS value by a string to set
    */
  def setString(newS: String): Unit = js.native
  
  /**
    * set value by a hexadecimal string
    * @param newHexString value by a hexadecimal string to set
    */
  def setStringHex(newHexString: String): Unit = js.native
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
  
  @scala.inline
  implicit class DERAbstractStringMutableBuilder[Self <: DERAbstractString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFreshValueHex(value: () => String): Self = StObject.set(x, "getFreshValueHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStringHex(value: String => Unit): Self = StObject.set(x, "setStringHex", js.Any.fromFunction1(value))
  }
}
