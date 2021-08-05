package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringParam extends StObject {
  
  var str: String
}
object StringParam {
  
  inline def apply(str: String): StringParam = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParam]
  }
  
  extension [Self <: StringParam](x: Self) {
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
