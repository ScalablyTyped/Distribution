package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a BigTable connector used by the job.
  */
@js.native
trait SchemaBigTableIODetails extends js.Object {
  /**
    * InstanceId accessed in the connection.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * TableId accessed in the connection.
    */
  var tableId: js.UndefOr[String] = js.native
}

object SchemaBigTableIODetails {
  @scala.inline
  def apply(instanceId: String = null, projectId: String = null, tableId: String = null): SchemaBigTableIODetails = {
    val __obj = js.Dynamic.literal()
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBigTableIODetails]
  }
}

