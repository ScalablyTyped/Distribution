package typings.jqueryWindow

import typings.jqueryWindow.JQueryWindow.Window
import typings.jqueryWindow.JQueryWindow.WindowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Register with JQuery instance
trait JQuery extends StObject {
  
  def window(options: WindowOptions): Window
}
object JQuery {
  
  inline def apply(window: WindowOptions => Window): JQuery = {
    val __obj = js.Dynamic.literal(window = js.Any.fromFunction1(window))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setWindow(value: WindowOptions => Window): Self = StObject.set(x, "window", js.Any.fromFunction1(value))
  }
}
