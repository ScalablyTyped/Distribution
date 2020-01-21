package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaWeight extends js.Object {
  /**
    * The weight unit.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The weight represented as a number.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaWeight {
  @scala.inline
  def apply(unit: String = null, value: String = null): SchemaWeight = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWeight]
  }
}

