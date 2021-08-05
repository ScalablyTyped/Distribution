package typings.koaRatelimitLru

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Remaining extends StObject {
    
    val remaining: js.UndefOr[String] = js.undefined
    
    val reset: js.UndefOr[String] = js.undefined
    
    val total: js.UndefOr[String] = js.undefined
  }
  object Remaining {
    
    inline def apply(): Remaining = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Remaining]
    }
    
    extension [Self <: Remaining](x: Self) {
      
      inline def setRemaining(value: String): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
      
      inline def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
