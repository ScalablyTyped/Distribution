package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Criteria for showing/hiding rows in a pivot table.
  */
@js.native
trait SchemaPivotFilterCriteria extends js.Object {
  /**
    * Values that should be included.  Values not listed here are excluded.
    */
  var visibleValues: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPivotFilterCriteria {
  @scala.inline
  def apply(visibleValues: js.Array[String] = null): SchemaPivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (visibleValues != null) __obj.updateDynamic("visibleValues")(visibleValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPivotFilterCriteria]
  }
}

