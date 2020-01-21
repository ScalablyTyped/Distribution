package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a Spanner connector used by the job.
  */
@js.native
trait SchemaSpannerIODetails extends js.Object {
  /**
    * DatabaseId accessed in the connection.
    */
  var databaseId: js.UndefOr[String] = js.native
  /**
    * InstanceId accessed in the connection.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaSpannerIODetails {
  @scala.inline
  def apply(databaseId: String = null, instanceId: String = null, projectId: String = null): SchemaSpannerIODetails = {
    val __obj = js.Dynamic.literal()
    if (databaseId != null) __obj.updateDynamic("databaseId")(databaseId.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpannerIODetails]
  }
}

