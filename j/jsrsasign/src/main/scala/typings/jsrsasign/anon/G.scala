package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait G extends StObject {
  
  var g: String | scala.Null
  
  var p: String | scala.Null
  
  var q: String | scala.Null
}
object G {
  
  inline def apply(): G = {
    val __obj = js.Dynamic.literal(g = null, p = null, q = null)
    __obj.asInstanceOf[G]
  }
  
  extension [Self <: G](x: Self) {
    
    inline def setG(value: String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setGNull: Self = StObject.set(x, "g", null)
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPNull: Self = StObject.set(x, "p", null)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQNull: Self = StObject.set(x, "q", null)
  }
}
