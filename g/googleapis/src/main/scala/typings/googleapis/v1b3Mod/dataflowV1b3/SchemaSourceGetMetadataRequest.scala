package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to compute the SourceMetadata of a Source.
  */
@js.native
trait SchemaSourceGetMetadataRequest extends js.Object {
  /**
    * Specification of the source whose metadata should be computed.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceGetMetadataRequest {
  @scala.inline
  def apply(source: SchemaSource = null): SchemaSourceGetMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceGetMetadataRequest]
  }
}

