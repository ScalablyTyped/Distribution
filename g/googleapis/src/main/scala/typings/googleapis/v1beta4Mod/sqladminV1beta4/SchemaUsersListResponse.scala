package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User list response.
  */
@js.native
trait SchemaUsersListResponse extends js.Object {
  /**
    * List of user resources in the instance.
    */
  var items: js.UndefOr[js.Array[SchemaUser]] = js.native
  /**
    * This is always sql#usersList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An identifier that uniquely identifies the operation. You can use this
    * identifier to retrieve the Operations resource that has information about
    * the operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaUsersListResponse {
  @scala.inline
  def apply(): SchemaUsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsersListResponse]
  }
  @scala.inline
  implicit class SchemaUsersListResponseOps[Self <: SchemaUsersListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaUser*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaUser]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

