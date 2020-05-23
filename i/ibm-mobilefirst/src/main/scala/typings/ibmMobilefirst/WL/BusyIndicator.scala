package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusyIndicator extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object BusyIndicator {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): BusyIndicator = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BusyIndicator]
  }
}

