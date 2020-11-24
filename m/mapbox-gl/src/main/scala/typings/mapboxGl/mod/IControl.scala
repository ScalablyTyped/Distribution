package typings.mapboxGl.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControl extends js.Object {
  
  var getDefaultPosition: js.UndefOr[js.Function0[String]] = js.native
  
  def onAdd(map: Map): HTMLElement = js.native
  
  def onRemove(map: Map): Unit = js.native
}
object IControl {
  
  @scala.inline
  def apply(onAdd: Map => HTMLElement, onRemove: Map => Unit): IControl = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove))
    __obj.asInstanceOf[IControl]
  }
  
  @scala.inline
  implicit class IControlOps[Self <: IControl] (val x: Self) extends AnyVal {
    
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
    def setOnAdd(value: Map => HTMLElement): Self = this.set("onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemove(value: Map => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultPosition(value: () => String): Self = this.set("getDefaultPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultPosition: Self = this.set("getDefaultPosition", js.undefined)
  }
}
