package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a table.
  */
@js.native
trait SchemaCreateTableResponse extends js.Object {
  /**
    * The object ID of the created table.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateTableResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaCreateTableResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateTableResponse]
  }
}

