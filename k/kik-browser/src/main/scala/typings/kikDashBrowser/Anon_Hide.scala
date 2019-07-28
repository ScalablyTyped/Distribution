package typings.kikDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hide extends js.Object {
  def hide(): Unit
  def isEnabled(): Boolean
  def show(): Unit
}

object Anon_Hide {
  @scala.inline
  def apply(hide: () => Unit, isEnabled: () => Boolean, show: () => Unit): Anon_Hide = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isEnabled = js.Any.fromFunction0(isEnabled), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Anon_Hide]
  }
}

