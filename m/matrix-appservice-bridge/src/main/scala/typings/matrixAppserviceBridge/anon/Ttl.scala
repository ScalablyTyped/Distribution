package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ttl extends StObject {
  
  var size: Double
  
  var ttl: Double
}
object Ttl {
  
  inline def apply(size: Double, ttl: Double): Ttl = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ttl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ttl] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
