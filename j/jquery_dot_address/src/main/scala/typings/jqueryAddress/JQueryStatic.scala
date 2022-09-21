package typings.jqueryAddress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def address(): Any
  @JSName("address")
  var address_Original: JQueryAddressStatic
}
object JQueryStatic {
  
  inline def apply(address: JQueryAddressStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setAddress(value: JQueryAddressStatic): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}
