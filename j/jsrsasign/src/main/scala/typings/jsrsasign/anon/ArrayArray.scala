package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayArray extends js.Object {
  
  var array: js.Array[ObjectIdentifierParam | HexParam | NameParam] = js.native
}
object ArrayArray {
  
  @scala.inline
  def apply(array: js.Array[ObjectIdentifierParam | HexParam | NameParam]): ArrayArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayArray]
  }
  
  @scala.inline
  implicit class ArrayArrayOps[Self <: ArrayArray] (val x: Self) extends AnyVal {
    
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
    def setArrayVarargs(value: (ObjectIdentifierParam | HexParam | NameParam)*): Self = this.set("array", js.Array(value :_*))
    
    @scala.inline
    def setArray(value: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Self = this.set("array", value.asInstanceOf[js.Any])
  }
}
