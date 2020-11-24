package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.bounded
import typings.ionicCore.ionicCoreStrings.unbounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRippleEffect extends js.Object {
  
  /**
    * Adds the ripple effect to the parent element.
    * @param x The horizontal coordinate of where the ripple should start.
    * @param y The vertical coordinate of where the ripple should start.
    */
  def addRipple(x: Double, y: Double): js.Promise[js.Function0[Unit]] = js.native
  
  /**
    * Sets the type of ripple-effect:  - `bounded`: the ripple effect expands from the user's click position - `unbounded`: the ripple effect expands from the center of the button and overflows the container.  NOTE: Surfaces for bounded ripples should have the overflow property set to hidden, while surfaces for unbounded ripples should have it set to visible.
    */
  var `type`: bounded | unbounded = js.native
}
object IonRippleEffect {
  
  @scala.inline
  def apply(addRipple: (Double, Double) => js.Promise[js.Function0[Unit]], `type`: bounded | unbounded): IonRippleEffect = {
    val __obj = js.Dynamic.literal(addRipple = js.Any.fromFunction2(addRipple))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRippleEffect]
  }
  
  @scala.inline
  implicit class IonRippleEffectOps[Self <: IonRippleEffect] (val x: Self) extends AnyVal {
    
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
    def setAddRipple(value: (Double, Double) => js.Promise[js.Function0[Unit]]): Self = this.set("addRipple", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: bounded | unbounded): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
