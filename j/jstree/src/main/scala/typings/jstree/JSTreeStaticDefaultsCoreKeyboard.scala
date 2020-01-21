package typings.jstree

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsCoreKeyboard extends js.Object {
  @JSName("*")
  def Asterisk(e: Event_): Unit
  def `ctrl-space`(e: Event_): Unit
  def down(e: Event_): Unit
  def end(e: Event_): Unit
  def enter(e: Event_): Unit
  def f2(e: Event_): Unit
  def home(e: Event_): Unit
  def left(e: Event_): Unit
  def right(e: Event_): Unit
  def up(e: Event_): Unit
}

object JSTreeStaticDefaultsCoreKeyboard {
  @scala.inline
  def apply(
    Asterisk: Event_ => Unit,
    `ctrl-space`: Event_ => Unit,
    down: Event_ => Unit,
    end: Event_ => Unit,
    enter: Event_ => Unit,
    f2: Event_ => Unit,
    home: Event_ => Unit,
    left: Event_ => Unit,
    right: Event_ => Unit,
    up: Event_ => Unit
  ): JSTreeStaticDefaultsCoreKeyboard = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), end = js.Any.fromFunction1(end), enter = js.Any.fromFunction1(enter), f2 = js.Any.fromFunction1(f2), home = js.Any.fromFunction1(home), left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right), up = js.Any.fromFunction1(up))
    __obj.updateDynamic("*")(js.Any.fromFunction1(Asterisk))
    __obj.updateDynamic("ctrl-space")(js.Any.fromFunction1(`ctrl-space`))
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreKeyboard]
  }
}

