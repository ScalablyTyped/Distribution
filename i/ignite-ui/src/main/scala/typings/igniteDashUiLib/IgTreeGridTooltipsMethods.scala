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
  def apply(destroy: js.Function0[scala.Unit], id: js.Function0[java.lang.String]): IgTreeGridTooltipsMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IgTreeGridTooltipsMethods]
  }
}

