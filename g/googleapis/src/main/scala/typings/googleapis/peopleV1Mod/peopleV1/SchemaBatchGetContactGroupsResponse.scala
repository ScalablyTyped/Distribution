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
  def apply(): SchemaBatchGetContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetContactGroupsResponse]
  }
  @scala.inline
  implicit class SchemaBatchGetContactGroupsResponseOps[Self <: SchemaBatchGetContactGroupsResponse] (val x: Self) extends AnyVal {
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
    def setResponsesVarargs(value: SchemaContactGroupResponse*): Self = this.set("responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: js.Array[SchemaContactGroupResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
  }
  
}

