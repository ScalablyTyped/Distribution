package typings.ionicReact

import typings.ionicReact.routeInfoMod.RouteInfo
import typings.react.mod.Context
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackContextMod {
  
  @JSImport("@ionic/react/dist/types/routing/StackContext", "StackContext")
  @js.native
  val StackContext: Context[StackContextState] = js.native
  
  @js.native
  trait StackContextState extends StObject {
    
    def isInOutlet(): Boolean = js.native
    
    def registerIonPage(page: HTMLElement, routeInfo: RouteInfo[_]): Unit = js.native
  }
  object StackContextState {
    
    @scala.inline
    def apply(isInOutlet: () => Boolean, registerIonPage: (HTMLElement, RouteInfo[_]) => Unit): StackContextState = {
      val __obj = js.Dynamic.literal(isInOutlet = js.Any.fromFunction0(isInOutlet), registerIonPage = js.Any.fromFunction2(registerIonPage))
      __obj.asInstanceOf[StackContextState]
    }
    
    @scala.inline
    implicit class StackContextStateMutableBuilder[Self <: StackContextState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInOutlet(value: () => Boolean): Self = StObject.set(x, "isInOutlet", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterIonPage(value: (HTMLElement, RouteInfo[_]) => Unit): Self = StObject.set(x, "registerIonPage", js.Any.fromFunction2(value))
    }
  }
}
