package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridTooltipsMethods extends js.Object {
  def destroy(): Unit
  /**
  	 * Returns the ID of the parent div element bounding the ruler and the tooltip container
  	 */
  def id(): String
}

object IgTreeGridTooltipsMethods {
  @scala.inline
  def apply(destroy: () => Unit, id: () => String): IgTreeGridTooltipsMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), id = js.Any.fromFunction0(id))
    __obj.asInstanceOf[IgTreeGridTooltipsMethods]
  }
}

