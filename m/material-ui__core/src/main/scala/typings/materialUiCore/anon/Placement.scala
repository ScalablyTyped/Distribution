package typings.materialUiCore.anon

import typings.materialUiCore.popperPopperMod.PopperPlacementType
import typings.materialUiCore.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement extends js.Object {
  var TransitionProps: js.UndefOr[typings.materialUiCore.transitionMod.TransitionProps] = js.native
  var placement: PopperPlacementType = js.native
}

object Placement {
  @scala.inline
  def apply(placement: PopperPlacementType): Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
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
    def setPlacement(value: PopperPlacementType): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionProps(value: TransitionProps): Self = this.set("TransitionProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionProps: Self = this.set("TransitionProps", js.undefined)
  }
  
}

