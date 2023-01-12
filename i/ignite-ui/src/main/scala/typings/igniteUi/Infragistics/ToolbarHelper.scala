package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarHelper extends StObject {
  
  def analyse(el: js.Object): Unit
}
object ToolbarHelper {
  
  inline def apply(analyse: js.Object => Unit): ToolbarHelper = {
    val __obj = js.Dynamic.literal(analyse = js.Any.fromFunction1(analyse))
    __obj.asInstanceOf[ToolbarHelper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolbarHelper] (val x: Self) extends AnyVal {
    
    inline def setAnalyse(value: js.Object => Unit): Self = StObject.set(x, "analyse", js.Any.fromFunction1(value))
  }
}
