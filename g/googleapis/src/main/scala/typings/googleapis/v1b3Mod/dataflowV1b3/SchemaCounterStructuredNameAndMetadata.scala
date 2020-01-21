package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single message which encapsulates structured name and metadata for a
  * given counter.
  */
@js.native
trait SchemaCounterStructuredNameAndMetadata extends js.Object {
  /**
    * Metadata associated with a counter
    */
  var metadata: js.UndefOr[SchemaCounterMetadata] = js.native
  /**
    * Structured name of the counter.
    */
  var name: js.UndefOr[SchemaCounterStructuredName] = js.native
}

object SchemaCounterStructuredNameAndMetadata {
  @scala.inline
  def apply(metadata: SchemaCounterMetadata = null, name: SchemaCounterStructuredName = null): SchemaCounterStructuredNameAndMetadata = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCounterStructuredNameAndMetadata]
  }
}

