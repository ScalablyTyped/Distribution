package typings.ionicReact.stackContextMod

import typings.ionicReact.routeInfoMod.RouteInfo
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackContextState extends js.Object {
  
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
  implicit class StackContextStateOps[Self <: StackContextState] (val x: Self) extends AnyVal {
    
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
    def setIsInOutlet(value: () => Boolean): Self = this.set("isInOutlet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterIonPage(value: (HTMLElement, RouteInfo[_]) => Unit): Self = this.set("registerIonPage", js.Any.fromFunction2(value))
  }
}
