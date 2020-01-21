package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of object values.
  */
@js.native
trait SchemaObjectValues extends js.Object {
  var values: js.UndefOr[js.Array[SchemaStructuredDataObject]] = js.native
}

object SchemaObjectValues {
  @scala.inline
  def apply(values: js.Array[SchemaStructuredDataObject] = null): SchemaObjectValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObjectValues]
  }
}

