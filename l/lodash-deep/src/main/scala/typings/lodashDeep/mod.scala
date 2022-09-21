package typings.lodashDeep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lodash-deep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepMapValues(`object`: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMapValues")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def deepMapValues(`object`: Any, callback: Any, propertyPath: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMapValues")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* augmented module */
  object lodashAugmentingMod {
    
    @js.native
    trait LoDashStatic extends StObject {
      
      def deepMapValues(`object`: Any, callback: Any): Any = js.native
      def deepMapValues(`object`: Any, callback: Any, propertyPath: Any): Any = js.native
    }
  }
}
