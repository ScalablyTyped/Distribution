package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridTooltipsMethods extends js.Object {
  def destroy(): scala.Unit
  /**
  	 * Returns the ID of the parent div element bounding the ruler and the tooltip container
  	 */
  def id(): java.lang.String
}

object IgTreeGridTooltipsMethods {
  @scala.inline
  def apply(destroy: () => scala.Unit, id: () => java.lang.String): IgTreeGridTooltipsMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[IgTreeGridTooltipsMethods]
  }
}

