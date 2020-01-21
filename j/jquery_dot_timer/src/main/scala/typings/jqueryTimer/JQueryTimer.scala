package typings.jqueryTimer

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryTimer extends js.Object {
  // #endregion
  // #region Properties
  var isActive: Boolean = js.native
  var remaining: Number = js.native
  // #region Constructors
  def apply(): js.Object = js.native
  def apply(action: js.Function): js.Object = js.native
  def apply(action: js.Function, time: Number): js.Object = js.native
  def apply(action: js.Function, time: Number, autostart: Boolean): js.Object = js.native
  // #endregion
  // #region Actions
  def once(time: Number): js.Object = js.native
  def pause(): js.Object = js.native
  def play(): js.Object = js.native
  def play(reset: Boolean): js.Object = js.native
  def set(x: js.Any): js.Object = js.native
  def stop(): js.Object = js.native
  def toggle(): js.Object = js.native
  def toggle(reset: Boolean): js.Object = js.native
}

