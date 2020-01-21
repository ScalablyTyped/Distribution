package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Property` consists of a user-supplied name/value pair.
  */
@js.native
trait SchemaProperty extends js.Object {
  /**
    * Name of the property.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value of numeric properties.
    */
  var uint64Value: js.UndefOr[String] = js.native
  /**
    * Value of the property.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaProperty {
  @scala.inline
  def apply(name: String = null, uint64Value: String = null, value: String = null): SchemaProperty = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uint64Value != null) __obj.updateDynamic("uint64Value")(uint64Value.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProperty]
  }
}

