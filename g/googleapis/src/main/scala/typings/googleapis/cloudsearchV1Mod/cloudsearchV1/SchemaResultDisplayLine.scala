package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of fields that make up a displayed line
  */
@js.native
trait SchemaResultDisplayLine extends js.Object {
  var fields: js.UndefOr[js.Array[SchemaResultDisplayField]] = js.native
}

object SchemaResultDisplayLine {
  @scala.inline
  def apply(fields: js.Array[SchemaResultDisplayField] = null): SchemaResultDisplayLine = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResultDisplayLine]
  }
}

