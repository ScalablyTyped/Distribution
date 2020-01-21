package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Environments Response.
  */
@js.native
trait SchemaListEnvironmentsResponse extends js.Object {
  /**
    * All Environments of a GTM Container.
    */
  var environment: js.UndefOr[js.Array[SchemaEnvironment]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListEnvironmentsResponse {
  @scala.inline
  def apply(environment: js.Array[SchemaEnvironment] = null, nextPageToken: String = null): SchemaListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListEnvironmentsResponse]
  }
}

