package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<jsrsasign.jsrsasign.X500Name, 'array'> */
trait OmitX500Namearray extends StObject {
  
  var str: String
}
object OmitX500Namearray {
  
  inline def apply(str: String): OmitX500Namearray = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitX500Namearray]
  }
  
  extension [Self <: OmitX500Namearray](x: Self) {
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
