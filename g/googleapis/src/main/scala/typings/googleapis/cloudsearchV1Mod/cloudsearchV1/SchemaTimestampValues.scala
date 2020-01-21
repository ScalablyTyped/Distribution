package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of timestamp values.
  */
@js.native
trait SchemaTimestampValues extends js.Object {
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTimestampValues {
  @scala.inline
  def apply(values: js.Array[String] = null): SchemaTimestampValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimestampValues]
  }
}

