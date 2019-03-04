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
  def apply(destroy: js.Function0[scala.Unit], id: js.Function0[java.lang.String]): IgGridTooltipsMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy, id = id)
  
    __obj.asInstanceOf[IgGridTooltipsMethods]
  }
}

