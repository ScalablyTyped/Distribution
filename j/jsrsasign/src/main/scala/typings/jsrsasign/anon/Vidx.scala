package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vidx extends StObject {
  
  var critical: Boolean
  
  var oid: String
  
  var vidx: Double
}
object Vidx {
  
  inline def apply(critical: Boolean, oid: String, vidx: Double): Vidx = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], vidx = vidx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vidx]
  }
  
  extension [Self <: Vidx](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    inline def setVidx(value: Double): Self = StObject.set(x, "vidx", value.asInstanceOf[js.Any])
  }
}
