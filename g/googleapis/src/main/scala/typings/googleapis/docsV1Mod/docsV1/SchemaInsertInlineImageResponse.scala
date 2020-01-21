package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of inserting an inline image.
  */
@js.native
trait SchemaInsertInlineImageResponse extends js.Object {
  /**
    * The ID of the created InlineObject.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaInsertInlineImageResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaInsertInlineImageResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInsertInlineImageResponse]
  }
}

