package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies the location of a streaming computation stage, for
  * stage-to-stage communication.
  */
@js.native
trait SchemaStreamingStageLocation extends js.Object {
  /**
    * Identifies the particular stream within the streaming Dataflow job.
    */
  var streamId: js.UndefOr[String] = js.native
}

object SchemaStreamingStageLocation {
  @scala.inline
  def apply(streamId: String = null): SchemaStreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStreamingStageLocation]
  }
}

