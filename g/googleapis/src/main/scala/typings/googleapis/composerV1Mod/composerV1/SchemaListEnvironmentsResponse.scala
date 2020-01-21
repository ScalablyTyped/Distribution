package typings.googleapis.composerV1Mod.composerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The environments in a project and location.
  */
@js.native
trait SchemaListEnvironmentsResponse extends js.Object {
  /**
    * The list of environments returned by a ListEnvironmentsRequest.
    */
  var environments: js.UndefOr[js.Array[SchemaEnvironment]] = js.native
  /**
    * The page token used to query for the next page if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListEnvironmentsResponse {
  @scala.inline
  def apply(environments: js.Array[SchemaEnvironment] = null, nextPageToken: String = null): SchemaListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (environments != null) __obj.updateDynamic("environments")(environments.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListEnvironmentsResponse]
  }
}

