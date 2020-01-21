package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a snapshot of a job.
  */
@js.native
trait SchemaSnapshot extends js.Object {
  /**
    * The time this snapshot was created.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * The unique ID of this snapshot.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The project this snapshot belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The job this snapshot was created from.
    */
  var sourceJobId: js.UndefOr[String] = js.native
  /**
    * The time after which this snapshot will be automatically deleted.
    */
  var ttl: js.UndefOr[String] = js.native
}

object SchemaSnapshot {
  @scala.inline
  def apply(
    creationTime: String = null,
    id: String = null,
    projectId: String = null,
    sourceJobId: String = null,
    ttl: String = null
  ): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (sourceJobId != null) __obj.updateDynamic("sourceJobId")(sourceJobId.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSnapshot]
  }
}

