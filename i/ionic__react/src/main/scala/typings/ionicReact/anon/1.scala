package typings.ionicReact.anon

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[OverlayType /* <: OverlayElement */] extends StObject {
  
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}
object `1` {
  
  inline def apply[OverlayType /* <: OverlayElement */](): `1`[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[OverlayType]]
  }
  
  extension [Self <: `1`[?], OverlayType /* <: OverlayElement */](x: Self & `1`[OverlayType]) {
    
    inline def setForwardedRef(value: RefObject[OverlayType]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
