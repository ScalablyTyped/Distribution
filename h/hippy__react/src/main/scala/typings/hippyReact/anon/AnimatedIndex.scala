package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedIndex extends StObject {
  
  var animated: Boolean
  
  var index: Double
}
object AnimatedIndex {
  
  inline def apply(animated: Boolean, index: Double): AnimatedIndex = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedIndex]
  }
  
  extension [Self <: AnimatedIndex](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
