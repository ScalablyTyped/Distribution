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
  def apply(): SchemaSourceGetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceGetMetadataResponse]
  }
  @scala.inline
  implicit class SchemaSourceGetMetadataResponseOps[Self <: SchemaSourceGetMetadataResponse] (val x: Self) extends AnyVal {
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
    def setMetadata(value: SchemaSourceMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

