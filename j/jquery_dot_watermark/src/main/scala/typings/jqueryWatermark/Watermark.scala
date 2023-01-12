package typings.jqueryWatermark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watermark extends StObject {
  
  def hide(element: String): Unit
  
  def hideAll(): Unit
  
  var options: WatermarkOptions
  
  def show(element: String): Unit
  
  def showAll(): Unit
}
object Watermark {
  
  inline def apply(
    hide: String => Unit,
    hideAll: () => Unit,
    options: WatermarkOptions,
    show: String => Unit,
    showAll: () => Unit
  ): Watermark = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), hideAll = js.Any.fromFunction0(hideAll), options = options.asInstanceOf[js.Any], show = js.Any.fromFunction1(show), showAll = js.Any.fromFunction0(showAll))
    __obj.asInstanceOf[Watermark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Watermark] (val x: Self) extends AnyVal {
    
    inline def setHide(value: String => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
    
    inline def setOptions(value: WatermarkOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setShow(value: String => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowAll(value: () => Unit): Self = StObject.set(x, "showAll", js.Any.fromFunction0(value))
  }
}
