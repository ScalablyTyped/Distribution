package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleTextMarkerTemplate extends StObject {
  
  def getText(item: js.Object, textDelegate: js.Object): Unit
  
  def measure(measureInfo: js.Object): Unit
  
  def render(renderInfo: js.Object): Unit
}
object SimpleTextMarkerTemplate {
  
  @scala.inline
  def apply(getText: (js.Object, js.Object) => Unit, measure: js.Object => Unit, render: js.Object => Unit): SimpleTextMarkerTemplate = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction2(getText), measure = js.Any.fromFunction1(measure), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[SimpleTextMarkerTemplate]
  }
  
  @scala.inline
  implicit class SimpleTextMarkerTemplateMutableBuilder[Self <: SimpleTextMarkerTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetText(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "getText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMeasure(value: js.Object => Unit): Self = StObject.set(x, "measure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: js.Object => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
