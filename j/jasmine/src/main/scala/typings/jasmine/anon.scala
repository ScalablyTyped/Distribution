package typings.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Random extends StObject {
    
    var random: Boolean
    
    var seed: Double | String
  }
  object Random {
    
    inline def apply(random: Boolean, seed: Double | String): Random = {
      val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Random]
    }
    
    extension [Self <: Random](x: Self) {
      
      inline def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    }
  }
}
