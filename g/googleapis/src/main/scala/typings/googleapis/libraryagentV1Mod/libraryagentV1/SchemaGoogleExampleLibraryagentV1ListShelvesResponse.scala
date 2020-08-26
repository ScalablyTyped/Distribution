package typings.googleapis.libraryagentV1Mod.libraryagentV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for LibraryAgent.ListShelves.
  */
@js.native
trait SchemaGoogleExampleLibraryagentV1ListShelvesResponse extends js.Object {
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListShelvesRequest.page_token field in the subsequent call to
    * `ListShelves` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of shelves.
    */
  var shelves: js.UndefOr[js.Array[SchemaGoogleExampleLibraryagentV1Shelf]] = js.native
}

object SchemaGoogleExampleLibraryagentV1ListShelvesResponse {
  @scala.inline
  def apply(): SchemaGoogleExampleLibraryagentV1ListShelvesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleExampleLibraryagentV1ListShelvesResponseOps[Self <: SchemaGoogleExampleLibraryagentV1ListShelvesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setShelvesVarargs(value: SchemaGoogleExampleLibraryagentV1Shelf*): Self = this.set("shelves", js.Array(value :_*))
    @scala.inline
    def setShelves(value: js.Array[SchemaGoogleExampleLibraryagentV1Shelf]): Self = this.set("shelves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShelves: Self = this.set("shelves", js.undefined)
  }
  
}

