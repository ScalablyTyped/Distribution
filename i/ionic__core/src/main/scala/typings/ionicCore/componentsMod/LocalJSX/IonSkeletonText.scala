package typings.ionicCore.componentsMod.LocalJSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSkeletonText extends StObject {
  
  /**
    * If `true`, the skeleton text will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
}
object IonSkeletonText {
  
  @scala.inline
  def apply(): IonSkeletonText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSkeletonText]
  }
  
  @scala.inline
  implicit class IonSkeletonTextMutableBuilder[Self <: IonSkeletonText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
  }
}
