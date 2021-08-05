package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.bounded
import typings.ionicCore.ionicCoreStrings.unbounded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRippleEffect extends StObject {
  
  /**
    * Sets the type of ripple-effect:  - `bounded`: the ripple effect expands from the user's click position - `unbounded`: the ripple effect expands from the center of the button and overflows the container.  NOTE: Surfaces for bounded ripples should have the overflow property set to hidden, while surfaces for unbounded ripples should have it set to visible.
    */
  var `type`: js.UndefOr[bounded | unbounded] = js.undefined
}
object IonRippleEffect {
  
  inline def apply(): IonRippleEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRippleEffect]
  }
  
  extension [Self <: IonRippleEffect](x: Self) {
    
    inline def setType(value: bounded | unbounded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
