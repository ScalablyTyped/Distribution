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
    
    @scala.inline
    def apply(
      animation: NavDirection,
      animationBuilder: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => typings.ionicCore.animationInterfaceMod.Animation,
      direction: RouterDirection
    ): Animation = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animationBuilder = js.Any.fromFunction2(animationBuilder), direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: NavDirection): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationBuilder(
        value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => typings.ionicCore.animationInterfaceMod.Animation
      ): Self = StObject.set(x, "animationBuilder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDirection(value: RouterDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inputs extends StObject {
    
    var inputs: js.UndefOr[js.Any] = js.undefined
    
    var methods: js.UndefOr[js.Any] = js.undefined
  }
  object Inputs {
    
    @scala.inline
    def apply(): Inputs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inputs]
    }
    
    @scala.inline
    implicit class InputsMutableBuilder[Self <: Inputs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputs(value: js.Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setMethods(value: js.Any): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    }
  }
  
  trait Tab extends StObject {
    
    var tab: String
  }
  object Tab {
    
    @scala.inline
    def apply(tab: String): Tab = {
      val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tab]
    }
    
    @scala.inline
    implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
}
