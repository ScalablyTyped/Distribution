package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a snapshot of a job.
  */
@js.native
trait SchemaSnapshotJobRequest extends js.Object {
  /**
    * The location that contains this job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * TTL for the snapshot.
    */
  var ttl: js.UndefOr[String] = js.native
}

object SchemaSnapshotJobRequest {
  @scala.inline
  def apply(): SchemaSnapshotJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshotJobRequest]
  }
  @scala.inline
  implicit class SchemaSnapshotJobRequestOps[Self <: SchemaSnapshotJobRequest] (val x: Self) extends AnyVal {
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

