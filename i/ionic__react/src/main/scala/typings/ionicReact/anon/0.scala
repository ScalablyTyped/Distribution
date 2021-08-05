package typings.ionicReact.anon

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[OverlayType /* <: OverlayElement */] extends StObject {
  
  def create(options: js.Any): js.Promise[OverlayType]
}
object `0` {
  
  inline def apply[OverlayType /* <: OverlayElement */](create: js.Any => js.Promise[OverlayType]): `0`[OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[`0`[OverlayType]]
  }
  
  extension [Self <: `0`[?], OverlayType /* <: OverlayElement */](x: Self & `0`[OverlayType]) {
    
    inline def setCreate(value: js.Any => js.Promise[OverlayType]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
