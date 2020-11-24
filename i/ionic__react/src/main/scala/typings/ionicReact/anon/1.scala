package typings.ionicReact.anon

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[OverlayType /* <: OverlayElement */] extends js.Object {
  
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.native
}
object `1` {
  
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](): `1`[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[OverlayType]]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_], OverlayType /* <: OverlayElement */] (val x: Self with `1`[OverlayType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForwardedRef(value: RefObject[OverlayType]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
  }
}
