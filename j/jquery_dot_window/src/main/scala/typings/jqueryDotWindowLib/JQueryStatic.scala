package typings
package jqueryDotWindowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Register with JQuery static
@js.native
trait JQueryStatic extends js.Object {
  @JSName("window")
  var window_Original: jqueryDotWindowLib.JQueryWindowNs.Static = js.native
  def window(options: jqueryDotWindowLib.JQueryWindowNs.WindowOptions): jqueryDotWindowLib.JQueryWindowNs.Window = js.native
}

