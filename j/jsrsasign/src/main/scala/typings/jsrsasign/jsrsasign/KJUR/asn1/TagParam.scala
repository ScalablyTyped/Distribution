package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagParam extends StObject {
  
  var str: String
}
object TagParam {
  
  inline def apply(str: String): TagParam = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagParam]
  }
  
  extension [Self <: TagParam](x: Self) {
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
