package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfragisticsMode extends js.Object {
  def isActive(): Unit
}

object InfragisticsMode {
  @scala.inline
  def apply(isActive: () => Unit): InfragisticsMode = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive))
    __obj.asInstanceOf[InfragisticsMode]
  }
}

