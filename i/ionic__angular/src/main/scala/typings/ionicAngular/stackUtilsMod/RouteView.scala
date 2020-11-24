package typings.ionicAngular.stackUtilsMod

import typings.angularCore.mod.ComponentRef
import typings.angularRouter.mod.NavigationExtras
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteView extends js.Object {
  
  var animationBuilder: js.UndefOr[AnimationBuilder] = js.native
  
  var element: HTMLElement = js.native
  
  var id: Double = js.native
  
  var ref: ComponentRef[_] = js.native
  
  var savedData: js.UndefOr[js.Any] = js.native
  
  var savedExtras: js.UndefOr[NavigationExtras] = js.native
  
  var stackId: js.UndefOr[String] = js.native
  
  def unlistenEvents(): Unit = js.native
  
  var url: String = js.native
}
object RouteView {
  
  @scala.inline
  def apply(element: HTMLElement, id: Double, ref: ComponentRef[_], unlistenEvents: () => Unit, url: String): RouteView = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], unlistenEvents = js.Any.fromFunction0(unlistenEvents), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteView]
  }
  
  @scala.inline
  implicit class RouteViewOps[Self <: RouteView] (val x: Self) extends AnyVal {
    
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
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: ComponentRef[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlistenEvents(value: () => Unit): Self = this.set("unlistenEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationBuilder(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("animationBuilder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAnimationBuilder: Self = this.set("animationBuilder", js.undefined)
    
    @scala.inline
    def setSavedData(value: js.Any): Self = this.set("savedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedData: Self = this.set("savedData", js.undefined)
    
    @scala.inline
    def setSavedExtras(value: NavigationExtras): Self = this.set("savedExtras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedExtras: Self = this.set("savedExtras", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = this.set("stackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("stackId", js.undefined)
  }
}
