package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with the list of deployments for the specified Apps Script
  * project.
  */
@js.native
trait SchemaListDeploymentsResponse extends js.Object {
  /**
    * The list of deployments.
    */
  var deployments: js.UndefOr[js.Array[SchemaDeployment]] = js.native
  /**
    * The token that can be used in the next call to get the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDeploymentsResponse {
  @scala.inline
  def apply(deployments: js.Array[SchemaDeployment] = null, nextPageToken: String = null): SchemaListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    if (deployments != null) __obj.updateDynamic("deployments")(deployments.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDeploymentsResponse]
  }
}

