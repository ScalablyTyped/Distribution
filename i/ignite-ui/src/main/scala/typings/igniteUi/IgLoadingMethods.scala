package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLoadingMethods extends js.Object {
  
  def destroy(): Unit = js.native
  
  def hide(): Unit = js.native
  
  def indicator(): Unit = js.native
  
  def indicatorElement(): Unit = js.native
  
  def refreshPos(): Unit = js.native
  
  def show(refresh: js.Object): Unit = js.native
}
object IgLoadingMethods {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => Unit,
    indicator: () => Unit,
    indicatorElement: () => Unit,
    refreshPos: () => Unit,
    show: js.Object => Unit
  ): IgLoadingMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), indicator = js.Any.fromFunction0(indicator), indicatorElement = js.Any.fromFunction0(indicatorElement), refreshPos = js.Any.fromFunction0(refreshPos), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IgLoadingMethods]
  }
  
  @scala.inline
  implicit class IgLoadingMethodsOps[Self <: IgLoadingMethods] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndicator(value: () => Unit): Self = this.set("indicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndicatorElement(value: () => Unit): Self = this.set("indicatorElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshPos(value: () => Unit): Self = this.set("refreshPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: js.Object => Unit): Self = this.set("show", js.Any.fromFunction1(value))
  }
}
