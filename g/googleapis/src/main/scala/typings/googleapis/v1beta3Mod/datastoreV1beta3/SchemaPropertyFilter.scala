package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter on a specific property.
  */
@js.native
trait SchemaPropertyFilter extends js.Object {
  /**
    * The operator to filter by.
    */
  var op: js.UndefOr[String] = js.native
  /**
    * The property to filter by.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.native
  /**
    * The value to compare the property to.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}

object SchemaPropertyFilter {
  @scala.inline
  def apply(op: String = null, property: SchemaPropertyReference = null, value: SchemaValue = null): SchemaPropertyFilter = {
    val __obj = js.Dynamic.literal()
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPropertyFilter]
  }
}

