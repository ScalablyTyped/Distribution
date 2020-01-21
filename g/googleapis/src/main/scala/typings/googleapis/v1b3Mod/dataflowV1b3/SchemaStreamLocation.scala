package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a stream of data, either as input to be processed or as output of
  * a streaming Dataflow job.
  */
@js.native
trait SchemaStreamLocation extends js.Object {
  /**
    * The stream is a custom source.
    */
  var customSourceLocation: js.UndefOr[SchemaCustomSourceLocation] = js.native
  /**
    * The stream is a pubsub stream.
    */
  var pubsubLocation: js.UndefOr[SchemaPubsubLocation] = js.native
  /**
    * The stream is a streaming side input.
    */
  var sideInputLocation: js.UndefOr[SchemaStreamingSideInputLocation] = js.native
  /**
    * The stream is part of another computation within the current streaming
    * Dataflow job.
    */
  var streamingStageLocation: js.UndefOr[SchemaStreamingStageLocation] = js.native
}

object SchemaStreamLocation {
  @scala.inline
  def apply(
    customSourceLocation: SchemaCustomSourceLocation = null,
    pubsubLocation: SchemaPubsubLocation = null,
    sideInputLocation: SchemaStreamingSideInputLocation = null,
    streamingStageLocation: SchemaStreamingStageLocation = null
  ): SchemaStreamLocation = {
    val __obj = js.Dynamic.literal()
    if (customSourceLocation != null) __obj.updateDynamic("customSourceLocation")(customSourceLocation.asInstanceOf[js.Any])
    if (pubsubLocation != null) __obj.updateDynamic("pubsubLocation")(pubsubLocation.asInstanceOf[js.Any])
    if (sideInputLocation != null) __obj.updateDynamic("sideInputLocation")(sideInputLocation.asInstanceOf[js.Any])
    if (streamingStageLocation != null) __obj.updateDynamic("streamingStageLocation")(streamingStageLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStreamLocation]
  }
}

