package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapMode extends js.Object {
  def isActive(): Unit
}

object BootstrapMode {
  @scala.inline
  def apply(isActive: () => Unit): BootstrapMode = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive))
    __obj.asInstanceOf[BootstrapMode]
  }
}

