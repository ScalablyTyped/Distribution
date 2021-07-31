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
  
  @scala.inline
  def apply(window: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindow(value: Static): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
