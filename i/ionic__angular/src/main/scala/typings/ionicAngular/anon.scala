package typings.ionicAngular

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.navInterfaceMod.NavDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Animation extends StObject {
    
    var animation: NavDirection
    
    def animationBuilder(baseEl: js.Any): typings.ionicCore.animationInterfaceMod.Animation
    def animationBuilder(baseEl: js.Any, opts: js.Any): typings.ionicCore.animationInterfaceMod.Animation
    @JSName("animationBuilder")
    var animationBuilder_Original: AnimationBuilder
    
    var direction: RouterDirection
  }
  object Animation {
    
    inline def apply(
      animation: NavDirection,
      animationBuilder: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => typings.ionicCore.animationInterfaceMod.Animation,
      direction: RouterDirection
    ): Animation = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animationBuilder = js.Any.fromFunction2(animationBuilder), direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    extension [Self <: Animation](x: Self) {
      
      inline def setAnimation(value: NavDirection): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationBuilder(
        value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => typings.ionicCore.animationInterfaceMod.Animation
      ): Self = StObject.set(x, "animationBuilder", js.Any.fromFunction2(value))
      
      inline def setDirection(value: RouterDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inputs extends StObject {
    
    var inputs: js.UndefOr[js.Any] = js.undefined
    
    var methods: js.UndefOr[js.Any] = js.undefined
  }
  object Inputs {
    
    inline def apply(): Inputs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inputs]
    }
    
    extension [Self <: Inputs](x: Self) {
      
      inline def setInputs(value: js.Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setMethods(value: js.Any): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    }
  }
  
  trait Tab extends StObject {
    
    var tab: String
  }
  object Tab {
    
    inline def apply(tab: String): Tab = {
      val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tab]
    }
    
    extension [Self <: Tab](x: Self) {
      
      inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
}
