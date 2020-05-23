package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildGridRenderedEventUIParam extends js.Object {
  /**
    * Gets reference to the child grid.
    */
  var childgrid: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets access the hierarchical grid object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets access the row element for the row that's about to be populated.
    */
  var parentrow: js.UndefOr[String] = js.undefined
}

object ChildGridRenderedEventUIParam {
  @scala.inline
  def apply(childgrid: js.Any = null, owner: js.Any = null, parentrow: String = null): ChildGridRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (childgrid != null) __obj.updateDynamic("childgrid")(childgrid.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (parentrow != null) __obj.updateDynamic("parentrow")(parentrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildGridRenderedEventUIParam]
  }
}

