package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLocationIdSet extends js.Object {
  /**
    * A non-empty list of location IDs. They must all be of the same location
    * type (e.g., state).
    */
  var locationIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaLocationIdSet {
  @scala.inline
  def apply(locationIds: js.Array[String] = null): SchemaLocationIdSet = {
    val __obj = js.Dynamic.literal()
    if (locationIds != null) __obj.updateDynamic("locationIds")(locationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocationIdSet]
  }
}

