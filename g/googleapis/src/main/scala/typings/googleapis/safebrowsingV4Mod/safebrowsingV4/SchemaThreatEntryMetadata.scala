package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata associated with a specific threat entry. The client is
  * expected to know the metadata key/value pairs associated with each threat
  * type.
  */
@js.native
trait SchemaThreatEntryMetadata extends js.Object {
  /**
    * The metadata entries.
    */
  var entries: js.UndefOr[js.Array[SchemaMetadataEntry]] = js.native
}

object SchemaThreatEntryMetadata {
  @scala.inline
  def apply(entries: js.Array[SchemaMetadataEntry] = null): SchemaThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThreatEntryMetadata]
  }
}

