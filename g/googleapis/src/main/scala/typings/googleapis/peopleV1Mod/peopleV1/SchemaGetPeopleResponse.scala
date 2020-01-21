package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetPeopleResponse extends js.Object {
  /**
    * The response for each requested resource name.
    */
  var responses: js.UndefOr[js.Array[SchemaPersonResponse]] = js.native
}

object SchemaGetPeopleResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaPersonResponse] = null): SchemaGetPeopleResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetPeopleResponse]
  }
}

