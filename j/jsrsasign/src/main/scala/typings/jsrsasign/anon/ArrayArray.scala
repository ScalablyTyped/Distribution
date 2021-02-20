package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayArray extends StObject {
  
  var array: js.Array[ObjectIdentifierParam | HexParam | NameParam] = js.native
}
object ArrayArray {
  
  @scala.inline
  def apply(array: js.Array[ObjectIdentifierParam | HexParam | NameParam]): ArrayArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayArray]
  }
  
  @scala.inline
  implicit class ArrayArrayMutableBuilder[Self <: ArrayArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayVarargs(value: (ObjectIdentifierParam | HexParam | NameParam)*): Self = StObject.set(x, "array", js.Array(value :_*))
  }
}
