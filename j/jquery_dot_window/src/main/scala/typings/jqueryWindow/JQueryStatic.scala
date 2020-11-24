package typings.jqueryWindow

import typings.jqueryWindow.JQueryWindow.Static
import typings.jqueryWindow.JQueryWindow.Window
import typings.jqueryWindow.JQueryWindow.WindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Register with JQuery static
@js.native
trait JQueryStatic extends js.Object {
  
  def window(options: WindowOptions): Window = js.native
  @JSName("window")
  var window_Original: Static = js.native
}
