package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rstr extends StObject {
  
  var rstr: String
}
object Rstr {
  
  inline def apply(rstr: String): Rstr = {
    val __obj = js.Dynamic.literal(rstr = rstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rstr]
  }
  
  extension [Self <: Rstr](x: Self) {
    
    inline def setRstr(value: String): Self = StObject.set(x, "rstr", value.asInstanceOf[js.Any])
  }
}
