package typings.googleapis.libraryagentV1Mod.libraryagentV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for LibraryAgent.ListBooks.
  */
@js.native
trait SchemaGoogleExampleLibraryagentV1ListBooksResponse extends js.Object {
  /**
    * The list of books.
    */
  var books: js.UndefOr[js.Array[SchemaGoogleExampleLibraryagentV1Book]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListBooksRequest.page_token field in the subsequent call to `ListBooks`
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleExampleLibraryagentV1ListBooksResponse {
  @scala.inline
  def apply(books: js.Array[SchemaGoogleExampleLibraryagentV1Book] = null, nextPageToken: String = null): SchemaGoogleExampleLibraryagentV1ListBooksResponse = {
    val __obj = js.Dynamic.literal()
    if (books != null) __obj.updateDynamic("books")(books.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
  }
}

