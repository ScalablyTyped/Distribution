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
  def apply(): SchemaThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatEntryMetadata]
  }
  @scala.inline
  implicit class SchemaThreatEntryMetadataOps[Self <: SchemaThreatEntryMetadata] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: SchemaMetadataEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[SchemaMetadataEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}

