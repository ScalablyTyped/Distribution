package typings
package jqueryDotTimerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("timer")
  var timer_Original: JQueryTimer = js.native
  // #region Constructors
  def timer(): js.Object = js.native
  def timer(action: js.Function): js.Object = js.native
  def timer(action: js.Function, time: stdLib.Number): js.Object = js.native
  def timer(action: js.Function, time: stdLib.Number, autostart: scala.Boolean): js.Object = js.native
}

