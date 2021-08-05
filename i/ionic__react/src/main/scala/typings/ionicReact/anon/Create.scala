package typings.ionicReact.anon

import typings.ionicReact.createControllerComponentMod.OverlayBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] extends StObject {
  
  def create(options: OptionsType): js.Promise[OverlayType]
}
object Create {
  
  inline def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](create: OptionsType => js.Promise[OverlayType]): Create[OptionsType, OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Create[OptionsType, OverlayType]]
  }
  
  extension [Self <: Create[?, ?], OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](x: Self & (Create[OptionsType, OverlayType])) {
    
    inline def setCreate(value: OptionsType => js.Promise[OverlayType]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
