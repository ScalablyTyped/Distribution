package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents array of string values.
  */
@js.native
trait SchemaStringValues extends js.Object {
  /**
    * Required.  String values.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaStringValues {
  @scala.inline
  def apply(values: js.Array[String] = null): SchemaStringValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStringValues]
  }
}

