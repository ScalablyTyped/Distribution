package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgZoomSliderMethods extends StObject {
  
  /**
    * Destroys widget.
    */
  def destroy(): Unit
  
  /**
    * Flushes the gauge.
    */
  def flush(): Unit
  
  def notifySizeChanged(): Unit
  
  def onAttachedToUI(): Unit
  
  def onDetachedFromUI(): Unit
}
object IgZoomSliderMethods {
  
  inline def apply(
    destroy: () => Unit,
    flush: () => Unit,
    notifySizeChanged: () => Unit,
    onAttachedToUI: () => Unit,
    onDetachedFromUI: () => Unit
  ): IgZoomSliderMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), notifySizeChanged = js.Any.fromFunction0(notifySizeChanged), onAttachedToUI = js.Any.fromFunction0(onAttachedToUI), onDetachedFromUI = js.Any.fromFunction0(onDetachedFromUI))
    __obj.asInstanceOf[IgZoomSliderMethods]
  }
  
  extension [Self <: IgZoomSliderMethods](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setNotifySizeChanged(value: () => Unit): Self = StObject.set(x, "notifySizeChanged", js.Any.fromFunction0(value))
    
    inline def setOnAttachedToUI(value: () => Unit): Self = StObject.set(x, "onAttachedToUI", js.Any.fromFunction0(value))
    
    inline def setOnDetachedFromUI(value: () => Unit): Self = StObject.set(x, "onDetachedFromUI", js.Any.fromFunction0(value))
  }
}
