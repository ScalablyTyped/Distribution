package typings.koaFavicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Maxage extends StObject {
    
    /**
      * cache-control max-age directive in ms, defaulting to 1 day.
      */
    var maxage: js.UndefOr[Double] = js.undefined
  }
  object Maxage {
    
    inline def apply(): Maxage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Maxage]
    }
    
    extension [Self <: Maxage](x: Self) {
      
      inline def setMaxage(value: Double): Self = StObject.set(x, "maxage", value.asInstanceOf[js.Any])
      
      inline def setMaxageUndefined: Self = StObject.set(x, "maxage", js.undefined)
    }
  }
}
