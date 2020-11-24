package typings.ionicCore.interfaceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteWrite extends js.Object {
  
  var changed: Boolean = js.native
  
  var element: js.UndefOr[HTMLElement] = js.native
  
  var markVisible: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
}
object RouteWrite {
  
  @scala.inline
  def apply(changed: Boolean): RouteWrite = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteWrite]
  }
  
  @scala.inline
  implicit class RouteWriteOps[Self <: RouteWrite] (val x: Self) extends AnyVal {
    
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
    def setChanged(value: Boolean): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setMarkVisible(value: () => Unit | js.Promise[Unit]): Self = this.set("markVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMarkVisible: Self = this.set("markVisible", js.undefined)
  }
}
