package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response of duplicating an object.
  */
@js.native
trait SchemaDuplicateObjectResponse extends js.Object {
  /**
    * The ID of the new duplicate object.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaDuplicateObjectResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaDuplicateObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDuplicateObjectResponse]
  }
}

