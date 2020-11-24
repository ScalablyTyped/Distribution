package typings.jumpJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var a11y: js.UndefOr[Boolean] = js.native
  
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var duration: js.UndefOr[Double | (js.Function1[/* distance */ Double, Double])] = js.native
  
  var easing: js.UndefOr[TransitionFunc] = js.native
  
  var offset: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setA11y(value: Boolean): Self = this.set("a11y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA11y: Self = this.set("a11y", js.undefined)
    
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setDurationFunction1(value: /* distance */ Double => Double): Self = this.set("duration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuration(value: Double | (js.Function1[/* distance */ Double, Double])): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = this.set("easing", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
