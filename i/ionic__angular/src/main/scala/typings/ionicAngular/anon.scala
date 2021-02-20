package typings.ionicAngular

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.navInterfaceMod.NavDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Animation extends StObject {
    
    var animation: NavDirection = js.native
    
    def animationBuilder(baseEl: js.Any): typings.ionicCore.animationInterfaceMod.Animation = js.native
    def animationBuilder(baseEl: js.Any, opts: js.Any): typings.ionicCore.animationInterfaceMod.Animation = js.native
    @JSName("animationBuilder")
    var animationBuilder_Original: AnimationBuilder = js.native
    
    var direction: RouterDirection = js.native
  }
  
  @js.native
  trait Inputs extends StObject {
    
    var inputs: js.UndefOr[js.Any] = js.native
    
    var methods: js.UndefOr[js.Any] = js.native
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
  
  @js.native
  trait Tab extends StObject {
    
    var tab: String = js.native
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
