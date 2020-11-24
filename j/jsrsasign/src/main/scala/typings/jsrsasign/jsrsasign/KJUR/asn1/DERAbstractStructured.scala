package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** base class for ASN.1 DER structured class */
@js.native
trait DERAbstractStructured extends js.Object {
  
  /**
    * append an ASN1Object to internal array
    * @param asn1Object object to add
    */
  def appendASN1Object(asn1Object: ASN1Object): Unit = js.native
  
  var asn1Array: js.Array[ASN1Object] = js.native
  
  /**
    * set value by array of ASN1Object
    * @param asn1ObjectArray array of ASN1Object to set
    */
  def setByASN1ObjectArray(asn1ObjectArray: js.Array[ASN1Object]): String = js.native
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
  
  @scala.inline
  implicit class DERAbstractStructuredOps[Self <: DERAbstractStructured] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppendASN1Object(value: ASN1Object => Unit): Self = this.set("appendASN1Object", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAsn1ArrayVarargs(value: ASN1Object*): Self = this.set("asn1Array", js.Array(value :_*))
    
    @scala.inline
    def setAsn1Array(value: js.Array[ASN1Object]): Self = this.set("asn1Array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetByASN1ObjectArray(value: js.Array[ASN1Object] => String): Self = this.set("setByASN1ObjectArray", js.Any.fromFunction1(value))
  }
}
