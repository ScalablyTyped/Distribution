package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTransitTableTransitTimeRow extends js.Object {
  var values: js.UndefOr[js.Array[SchemaTransitTableTransitTimeRowTransitTimeValue]] = js.native
}

object SchemaTransitTableTransitTimeRow {
  @scala.inline
  def apply(values: js.Array[SchemaTransitTableTransitTimeRowTransitTimeValue] = null): SchemaTransitTableTransitTimeRow = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransitTableTransitTimeRow]
  }
}

