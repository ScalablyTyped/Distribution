package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directory Site Contact List Response
  */
@js.native
trait SchemaDirectorySiteContactsListResponse extends js.Object {
  /**
    * Directory site contact collection
    */
  var directorySiteContacts: js.UndefOr[js.Array[SchemaDirectorySiteContact]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySiteContactsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaDirectorySiteContactsListResponse {
  @scala.inline
  def apply(
    directorySiteContacts: js.Array[SchemaDirectorySiteContact] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaDirectorySiteContactsListResponse = {
    val __obj = js.Dynamic.literal()
    if (directorySiteContacts != null) __obj.updateDynamic("directorySiteContacts")(directorySiteContacts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDirectorySiteContactsListResponse]
  }
}

