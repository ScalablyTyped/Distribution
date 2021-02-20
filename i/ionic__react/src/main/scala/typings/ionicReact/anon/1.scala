package typings.ionicReact.anon

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[OverlayType /* <: OverlayElement */] extends StObject {
  
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.native
}
object `1` {
  
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](): `1`[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[OverlayType]]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`[_], OverlayType /* <: OverlayElement */] (val x: Self with `1`[OverlayType]) extends AnyVal {
    
    @scala.inline
    def setForwardedRef(value: RefObject[OverlayType]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
