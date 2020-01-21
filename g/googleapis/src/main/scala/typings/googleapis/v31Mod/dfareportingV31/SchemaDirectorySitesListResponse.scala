package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directory Site List Response
  */
@js.native
trait SchemaDirectorySitesListResponse extends js.Object {
  /**
    * Directory site collection.
    */
  var directorySites: js.UndefOr[js.Array[SchemaDirectorySite]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySitesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaDirectorySitesListResponse {
  @scala.inline
  def apply(
    directorySites: js.Array[SchemaDirectorySite] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaDirectorySitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (directorySites != null) __obj.updateDynamic("directorySites")(directorySites.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDirectorySitesListResponse]
  }
}

