package typings.ionicReact.anon

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationCallbackOptions
import typings.ionicCore.animationInterfaceMod.AnimationLifecycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: AnimationLifecycle
  
  var opts: js.UndefOr[AnimationCallbackOptions] = js.undefined
}
object Callback {
  
  @scala.inline
  def apply(
    callback: (/* currentStep */ typings.ionicCore.ionicCoreNumbers.`0` | typings.ionicCore.ionicCoreNumbers.`1`, /* animation */ Animation) => Unit
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback))
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(
      value: (/* currentStep */ typings.ionicCore.ionicCoreNumbers.`0` | typings.ionicCore.ionicCoreNumbers.`1`, /* animation */ Animation) => Unit
    ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpts(value: AnimationCallbackOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
  }
}
