package typings.jasmine

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* env */ js.Any, js.Any]
  
  trait Random extends StObject {
    
    var random: Boolean
    
    var seed: String
  }
  object Random {
    
    inline def apply(random: Boolean, seed: String): Random = {
      val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Random]
    }
    
    extension [Self <: Random](x: Self) {
      
      inline def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    }
  }
}
