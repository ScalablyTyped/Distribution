package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLoadingMethods extends StObject {
  
  def destroy(): Unit
  
  def hide(): Unit
  
  def indicator(): Unit
  
  def indicatorElement(): Unit
  
  def refreshPos(): Unit
  
  def show(refresh: js.Object): Unit
}
object IgLoadingMethods {
  
  inline def apply(
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
  
  extension [Self <: IgLoadingMethods](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setIndicator(value: () => Unit): Self = StObject.set(x, "indicator", js.Any.fromFunction0(value))
    
    inline def setIndicatorElement(value: () => Unit): Self = StObject.set(x, "indicatorElement", js.Any.fromFunction0(value))
    
    inline def setRefreshPos(value: () => Unit): Self = StObject.set(x, "refreshPos", js.Any.fromFunction0(value))
    
    inline def setShow(value: js.Object => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
