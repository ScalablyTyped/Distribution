package typings.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonSkeletonText extends StObject {
  
  /**
    * If `true`, the skeleton text will animate.
    */
  var animated: Boolean = js.native
}
object IonSkeletonText {
  
  @scala.inline
  def apply(animated: Boolean): IonSkeletonText = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSkeletonText]
  }
  
  @scala.inline
  implicit class IonSkeletonTextMutableBuilder[Self <: IonSkeletonText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
  }
}
