package typings.materializecssMaterialize.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<PushpinOptions> * / any */ trait Pushpin extends StObject {
  
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double
}
object Pushpin {
  
  inline def apply(originalOffset: Double): Pushpin = {
    val __obj = js.Dynamic.literal(originalOffset = originalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pushpin]
  }
  
  extension [Self <: Pushpin](x: Self) {
    
    inline def setOriginalOffset(value: Double): Self = StObject.set(x, "originalOffset", value.asInstanceOf[js.Any])
  }
}
