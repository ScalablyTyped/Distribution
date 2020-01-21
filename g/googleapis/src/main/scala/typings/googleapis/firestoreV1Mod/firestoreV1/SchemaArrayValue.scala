package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array value.
  */
@js.native
trait SchemaArrayValue extends js.Object {
  /**
    * Values in the array.
    */
  var values: js.UndefOr[js.Array[SchemaValue]] = js.native
}

object SchemaArrayValue {
  @scala.inline
  def apply(values: js.Array[SchemaValue] = null): SchemaArrayValue = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaArrayValue]
  }
}

