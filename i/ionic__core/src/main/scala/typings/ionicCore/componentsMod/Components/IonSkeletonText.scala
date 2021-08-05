package typings.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSkeletonText extends StObject {
  
  /**
    * If `true`, the skeleton text will animate.
    */
  var animated: Boolean
}
object IonSkeletonText {
  
  inline def apply(animated: Boolean): IonSkeletonText = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSkeletonText]
  }
  
  extension [Self <: IonSkeletonText](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
  }
}
