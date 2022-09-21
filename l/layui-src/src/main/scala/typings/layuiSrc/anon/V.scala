package typings.layuiSrc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V extends StObject {
  
  var v: String
}
object V {
  
  inline def apply(v: String): V = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[V]
  }
  
  extension [Self <: V](x: Self) {
    
    inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
