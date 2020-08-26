package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a Source useful for automatically optimizing and tuning the
  * pipeline, etc.
  */
@js.native
trait SchemaSourceMetadata extends js.Object {
  /**
    * An estimate of the total size (in bytes) of the data that would be read
    * from this source.  This estimate is in terms of external storage size,
    * before any decompression or other processing done by the reader.
    */
  var estimatedSizeBytes: js.UndefOr[String] = js.native
  /**
    * Specifies that the size of this source is known to be infinite (this is a
    * streaming source).
    */
  var infinite: js.UndefOr[Boolean] = js.native
  /**
    * Whether this source is known to produce key/value pairs with the
    * (encoded) keys in lexicographically sorted order.
    */
  var producesSortedKeys: js.UndefOr[Boolean] = js.native
}

object SchemaSourceMetadata {
  @scala.inline
  def apply(): SchemaSourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceMetadata]
  }
  @scala.inline
  implicit class SchemaSourceMetadataOps[Self <: SchemaSourceMetadata] (val x: Self) extends AnyVal {
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
    def setEstimatedSizeBytes(value: String): Self = this.set("estimatedSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedSizeBytes: Self = this.set("estimatedSizeBytes", js.undefined)
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    @scala.inline
    def setProducesSortedKeys(value: Boolean): Self = this.set("producesSortedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducesSortedKeys: Self = this.set("producesSortedKeys", js.undefined)
  }
  
}

