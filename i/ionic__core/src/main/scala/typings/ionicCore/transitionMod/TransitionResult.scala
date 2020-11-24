package typings.ionicCore.transitionMod

import typings.ionicCore.animationInterfaceMod.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionResult extends js.Object {
  
  var animation: js.UndefOr[Animation] = js.native
  
  var hasCompleted: Boolean = js.native
}
object TransitionResult {
  
  @scala.inline
  def apply(hasCompleted: Boolean): TransitionResult = {
    val __obj = js.Dynamic.literal(hasCompleted = hasCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionResult]
  }
  
  @scala.inline
  implicit class TransitionResultOps[Self <: TransitionResult] (val x: Self) extends AnyVal {
    
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
    def setHasCompleted(value: Boolean): Self = this.set("hasCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
  }
}
