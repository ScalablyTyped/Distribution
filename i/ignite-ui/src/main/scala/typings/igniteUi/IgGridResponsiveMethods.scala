package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridResponsiveMethods extends js.Object {
  /**
    * Destroys the responsive widget.
    */
  def destroy(): Unit
  /**
    * Returns the currently active responsive mode.
    */
  def getCurrentResponsiveMode(): Unit
}

object IgGridResponsiveMethods {
  @scala.inline
  def apply(destroy: () => Unit, getCurrentResponsiveMode: () => Unit): IgGridResponsiveMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getCurrentResponsiveMode = js.Any.fromFunction0(getCurrentResponsiveMode))
    __obj.asInstanceOf[IgGridResponsiveMethods]
  }
}

