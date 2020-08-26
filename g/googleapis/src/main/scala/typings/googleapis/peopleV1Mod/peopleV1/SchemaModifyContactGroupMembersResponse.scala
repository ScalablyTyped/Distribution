package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a modify contact group members request.
  */
@js.native
trait SchemaModifyContactGroupMembersResponse extends js.Object {
  /**
    * The contact people resource names that were not found.
    */
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyContactGroupMembersResponse {
  @scala.inline
  def apply(): SchemaModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyContactGroupMembersResponse]
  }
  @scala.inline
  implicit class SchemaModifyContactGroupMembersResponseOps[Self <: SchemaModifyContactGroupMembersResponse] (val x: Self) extends AnyVal {
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
    def setNotFoundResourceNamesVarargs(value: String*): Self = this.set("notFoundResourceNames", js.Array(value :_*))
    @scala.inline
    def setNotFoundResourceNames(value: js.Array[String]): Self = this.set("notFoundResourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundResourceNames: Self = this.set("notFoundResourceNames", js.undefined)
  }
  
}

