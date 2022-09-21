package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Where extends StObject {
  
  var where: Any
}
object Where {
  
  inline def apply(where: Any): Where = {
    val __obj = js.Dynamic.literal(where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[Where]
  }
  
  extension [Self <: Where](x: Self) {
    
    inline def setWhere(value: Any): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
