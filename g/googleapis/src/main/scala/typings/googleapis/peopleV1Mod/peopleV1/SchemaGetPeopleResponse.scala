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
  def apply(): SchemaGetPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetPeopleResponse]
  }
  @scala.inline
  implicit class SchemaGetPeopleResponseOps[Self <: SchemaGetPeopleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponsesVarargs(value: SchemaPersonResponse*): Self = this.set("responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: js.Array[SchemaPersonResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
  }
  
}

