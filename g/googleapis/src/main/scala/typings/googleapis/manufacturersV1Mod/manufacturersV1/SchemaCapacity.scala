package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The capacity of a product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#capacity.
  */
@js.native
trait SchemaCapacity extends js.Object {
  /**
    * The unit of the capacity, i.e., MB, GB, or TB.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The numeric value of the capacity.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCapacity {
  @scala.inline
  def apply(unit: String = null, value: String = null): SchemaCapacity = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCapacity]
  }
}

