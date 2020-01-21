package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a joined collection of PageElements.
  */
@js.native
trait SchemaGroup extends js.Object {
  /**
    * The collection of elements in the group. The minimum size of a group
    * is 2.
    */
  var children: js.UndefOr[js.Array[SchemaPageElement]] = js.native
}

object SchemaGroup {
  @scala.inline
  def apply(children: js.Array[SchemaPageElement] = null): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroup]
  }
}

