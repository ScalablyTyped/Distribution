package typings.itParallel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Concurrency extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var ordered: js.UndefOr[Boolean] = js.undefined
  }
  object Concurrency {
    
    inline def apply(): Concurrency = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Concurrency]
    }
    
    extension [Self <: Concurrency](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    }
  }
}
