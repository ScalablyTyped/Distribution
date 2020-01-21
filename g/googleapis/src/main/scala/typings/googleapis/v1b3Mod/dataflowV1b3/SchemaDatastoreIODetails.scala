package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a Datastore connector used by the job.
  */
@js.native
trait SchemaDatastoreIODetails extends js.Object {
  /**
    * Namespace used in the connection.
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaDatastoreIODetails {
  @scala.inline
  def apply(namespace: String = null, projectId: String = null): SchemaDatastoreIODetails = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatastoreIODetails]
  }
}

