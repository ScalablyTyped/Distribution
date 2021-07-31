package typings.kineticjs.Kinetic

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICanvas extends StObject {
  
  var _canvas: HTMLCanvasElement
  
  def getPixelRatio(): Double
  
  var height: Double
  
  def setPixelRatio(pixelRatio: Double): js.Any
  
  var width: Double
}
object ICanvas {
  
  @scala.inline
  def apply(
    _canvas: HTMLCanvasElement,
    getPixelRatio: () => Double,
    height: Double,
    setPixelRatio: Double => js.Any,
    width: Double
  ): ICanvas = {
    val __obj = js.Dynamic.literal(_canvas = _canvas.asInstanceOf[js.Any], getPixelRatio = js.Any.fromFunction0(getPixelRatio), height = height.asInstanceOf[js.Any], setPixelRatio = js.Any.fromFunction1(setPixelRatio), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvas]
  }
  
  @scala.inline
  implicit class ICanvasMutableBuilder[Self <: ICanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPixelRatio(value: () => Double): Self = StObject.set(x, "getPixelRatio", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPixelRatio(value: Double => js.Any): Self = StObject.set(x, "setPixelRatio", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_canvas(value: HTMLCanvasElement): Self = StObject.set(x, "_canvas", value.asInstanceOf[js.Any])
  }
}
