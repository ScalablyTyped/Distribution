package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  var elements: js.Array[FlashElement] = js.native
  
  var frame: FlashFrame = js.native
  
  def goto(): js.Any = js.native
  
  var keyframes: js.Array[FlashFrame] = js.native
  
  var layer: FlashLayer = js.native
  
  def setLayer(index: Double): js.Any = js.native
  
  def update(): js.Any = js.native
}
object Context {
  
  @scala.inline
  def apply(
    elements: js.Array[FlashElement],
    frame: FlashFrame,
    goto: () => js.Any,
    keyframes: js.Array[FlashFrame],
    layer: FlashLayer,
    setLayer: Double => js.Any,
    update: () => js.Any
  ): Context = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], goto = js.Any.fromFunction0(goto), keyframes = keyframes.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], setLayer = js.Any.fromFunction1(setLayer), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[FlashElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: FlashElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setFrame(value: FlashFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoto(value: () => js.Any): Self = StObject.set(x, "goto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyframes(value: js.Array[FlashFrame]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframesVarargs(value: FlashFrame*): Self = StObject.set(x, "keyframes", js.Array(value :_*))
    
    @scala.inline
    def setLayer(value: FlashLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLayer(value: Double => js.Any): Self = StObject.set(x, "setLayer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => js.Any): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
