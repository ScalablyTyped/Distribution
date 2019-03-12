package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridTooltipsMethods extends js.Object {
  /**
  	 * Destroys the tooltip widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Returns the ID of the parent div element bounding the ruler and the tooltip container
  	 */
  def id(): java.lang.String
}

object IgGridTooltipsMethods {
  @scala.inline
  def apply(destroy: () => scala.Unit, id: () => java.lang.String): IgGridTooltipsMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[IgGridTooltipsMethods]
  }
}

