package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ttl extends StObject {
  
  var size: js.UndefOr[Double] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
}
object Ttl {
  
  inline def apply(): Ttl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ttl]
  }
  
  extension [Self <: Ttl](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
