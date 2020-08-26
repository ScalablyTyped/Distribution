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
  def apply(): SchemaDatastoreIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatastoreIODetails]
  }
  @scala.inline
  implicit class SchemaDatastoreIODetailsOps[Self <: SchemaDatastoreIODetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

