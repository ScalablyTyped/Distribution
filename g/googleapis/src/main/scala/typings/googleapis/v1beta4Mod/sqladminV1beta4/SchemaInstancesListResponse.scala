package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instances list response.
  */
@js.native
trait SchemaInstancesListResponse extends js.Object {
  /**
    * List of database instance resources.
    */
  var items: js.UndefOr[js.Array[SchemaDatabaseInstance]] = js.native
  /**
    * This is always sql#instancesList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of warnings that ocurred while handling the request.
    */
  var warnings: js.UndefOr[js.Array[SchemaApiWarning]] = js.native
}

object SchemaInstancesListResponse {
  @scala.inline
  def apply(): SchemaInstancesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesListResponse]
  }
  @scala.inline
  implicit class SchemaInstancesListResponseOps[Self <: SchemaInstancesListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaDatabaseInstance*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaDatabaseInstance]): Self = this.set("items", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setWarningsVarargs(value: SchemaApiWarning*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[SchemaApiWarning]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

