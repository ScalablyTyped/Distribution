package typings.jqueryWindow

import typings.jqueryWindow.JQueryWindow.Static
import typings.jqueryWindow.JQueryWindow.Window
import typings.jqueryWindow.JQueryWindow.WindowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Register with JQuery static
trait JQueryStatic extends StObject {
  
  def window(options: WindowOptions): Window
  @JSName("window")
  var window_Original: Static
}
object JQueryStatic {
  
  inline def apply(window: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setWindow(value: Static): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
