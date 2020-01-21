package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of text values.
  */
@js.native
trait SchemaTextValues extends js.Object {
  /**
    * The maximum allowable length for text values is 2048 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTextValues {
  @scala.inline
  def apply(values: js.Array[String] = null): SchemaTextValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextValues]
  }
}

