package typings.ionicCore.navInterfaceMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterOutletOptions extends js.Object {
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var animationBuilder: js.UndefOr[AnimationBuilder] = js.native
  
  var deepWait: js.UndefOr[Boolean] = js.native
  
  var direction: js.UndefOr[NavDirection] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var keyboardClose: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[Mode] = js.native
  
  var progressAnimation: js.UndefOr[Boolean] = js.native
  
  var showGoBack: js.UndefOr[Boolean] = js.native
  
  var skipIfBusy: js.UndefOr[Boolean] = js.native
}
object RouterOutletOptions {
  
  @scala.inline
  def apply(): RouterOutletOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOutletOptions]
  }
  
  @scala.inline
  implicit class RouterOutletOptionsOps[Self <: RouterOutletOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setAnimationBuilder(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("animationBuilder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAnimationBuilder: Self = this.set("animationBuilder", js.undefined)
    
    @scala.inline
    def setDeepWait(value: Boolean): Self = this.set("deepWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepWait: Self = this.set("deepWait", js.undefined)
    
    @scala.inline
    def setDirection(value: NavDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setKeyboardClose(value: Boolean): Self = this.set("keyboardClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardClose: Self = this.set("keyboardClose", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setProgressAnimation(value: Boolean): Self = this.set("progressAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressAnimation: Self = this.set("progressAnimation", js.undefined)
    
    @scala.inline
    def setShowGoBack(value: Boolean): Self = this.set("showGoBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGoBack: Self = this.set("showGoBack", js.undefined)
    
    @scala.inline
    def setSkipIfBusy(value: Boolean): Self = this.set("skipIfBusy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipIfBusy: Self = this.set("skipIfBusy", js.undefined)
  }
}
