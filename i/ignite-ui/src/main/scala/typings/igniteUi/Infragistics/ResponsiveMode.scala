package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveMode extends js.Object {
  def isActive(): Unit
}

object ResponsiveMode {
  @scala.inline
  def apply(isActive: () => Unit): ResponsiveMode = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive))
    __obj.asInstanceOf[ResponsiveMode]
  }
}

