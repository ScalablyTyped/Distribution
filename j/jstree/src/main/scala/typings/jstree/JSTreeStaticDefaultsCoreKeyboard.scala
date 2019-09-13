package typings.jstree

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsCoreKeyboard extends js.Object {
  def `*`(e: Event): Unit
  def `ctrl-space`(e: Event): Unit
  def down(e: Event): Unit
  def end(e: Event): Unit
  def enter(e: Event): Unit
  def f2(e: Event): Unit
  def home(e: Event): Unit
  def left(e: Event): Unit
  def right(e: Event): Unit
  def up(e: Event): Unit
}

object JSTreeStaticDefaultsCoreKeyboard {
  @scala.inline
  def apply(
    `*`: Event => Unit,
    `ctrl-space`: Event => Unit,
    down: Event => Unit,
    end: Event => Unit,
    enter: Event => Unit,
    f2: Event => Unit,
    home: Event => Unit,
    left: Event => Unit,
    right: Event => Unit,
    up: Event => Unit
  ): JSTreeStaticDefaultsCoreKeyboard = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), end = js.Any.fromFunction1(end), enter = js.Any.fromFunction1(enter), f2 = js.Any.fromFunction1(f2), home = js.Any.fromFunction1(home), left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right), up = js.Any.fromFunction1(up))
    __obj.updateDynamic("*")(js.Any.fromFunction1(`*`))
    __obj.updateDynamic("ctrl-space")(js.Any.fromFunction1(`ctrl-space`))
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreKeyboard]
  }
}

