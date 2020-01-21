package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a SourceGetMetadataOperation.
  */
@js.native
trait SchemaSourceGetMetadataResponse extends js.Object {
  /**
    * The computed metadata.
    */
  var metadata: js.UndefOr[SchemaSourceMetadata] = js.native
}

object SchemaSourceGetMetadataResponse {
  @scala.inline
  def apply(metadata: SchemaSourceMetadata = null): SchemaSourceGetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceGetMetadataResponse]
  }
}

