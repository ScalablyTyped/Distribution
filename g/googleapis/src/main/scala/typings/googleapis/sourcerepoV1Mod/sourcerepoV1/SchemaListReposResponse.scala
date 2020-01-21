package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListRepos.  The size is not set in the returned repositories.
  */
@js.native
trait SchemaListReposResponse extends js.Object {
  /**
    * If non-empty, additional repositories exist within the project. These can
    * be retrieved by including this value in the next ListReposRequest&#39;s
    * page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The listed repos.
    */
  var repos: js.UndefOr[js.Array[SchemaRepo]] = js.native
}

object SchemaListReposResponse {
  @scala.inline
  def apply(nextPageToken: String = null, repos: js.Array[SchemaRepo] = null): SchemaListReposResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (repos != null) __obj.updateDynamic("repos")(repos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListReposResponse]
  }
}

