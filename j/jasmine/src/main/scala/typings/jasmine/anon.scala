package typings.jasmine

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* env */ js.Any, js.Any]
  
  @js.native
  trait Random extends StObject {
    
    var random: Boolean = js.native
    
    var seed: String = js.native
  }
  object Random {
    
    @scala.inline
    def apply(random: Boolean, seed: String): Random = {
      val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Random]
    }
    
    @scala.inline
    implicit class RandomMutableBuilder[Self <: Random] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    }
  }
}
