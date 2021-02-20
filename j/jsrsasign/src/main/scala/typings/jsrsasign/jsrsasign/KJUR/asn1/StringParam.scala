package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringParam extends StObject {
  
  var str: String = js.native
}
object StringParam {
  
  @scala.inline
  def apply(str: String): StringParam = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParam]
  }
  
  @scala.inline
  implicit class StringParamMutableBuilder[Self <: StringParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
