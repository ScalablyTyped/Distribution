package typings.ionicReact.anon

import typings.ionicReact.createControllerComponentMod.OverlayBase
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedRef[OverlayType /* <: OverlayBase */] extends StObject {
  
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}
object ForwardedRef {
  
  @scala.inline
  def apply[OverlayType /* <: OverlayBase */](): ForwardedRef[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedRef[OverlayType]]
  }
  
  @scala.inline
  implicit class ForwardedRefMutableBuilder[Self <: ForwardedRef[?], OverlayType /* <: OverlayBase */] (val x: Self & ForwardedRef[OverlayType]) extends AnyVal {
    
    @scala.inline
    def setForwardedRef(value: RefObject[OverlayType]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
