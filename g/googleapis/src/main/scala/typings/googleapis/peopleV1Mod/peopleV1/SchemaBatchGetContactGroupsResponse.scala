package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a batch get contact groups request.
  */
@js.native
trait SchemaBatchGetContactGroupsResponse extends js.Object {
  /**
    * The list of responses for each requested contact group resource.
    */
  var responses: js.UndefOr[js.Array[SchemaContactGroupResponse]] = js.native
}

object SchemaBatchGetContactGroupsResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaContactGroupResponse] = null): SchemaBatchGetContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchGetContactGroupsResponse]
  }
}

