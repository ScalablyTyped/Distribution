package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLoadingMethods extends StObject {
  
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
  implicit class IgLoadingMethodsMutableBuilder[Self <: IgLoadingMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndicator(value: () => Unit): Self = StObject.set(x, "indicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndicatorElement(value: () => Unit): Self = StObject.set(x, "indicatorElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshPos(value: () => Unit): Self = StObject.set(x, "refreshPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: js.Object => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
