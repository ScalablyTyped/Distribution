package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.bounded
import typings.ionicCore.ionicCoreStrings.unbounded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRippleEffect extends StObject {
  
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
  implicit class IonRippleEffectMutableBuilder[Self <: IonRippleEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRipple(value: (Double, Double) => js.Promise[js.Function0[Unit]]): Self = StObject.set(x, "addRipple", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: bounded | unbounded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
