package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a single offline file annotation request.
  */
@js.native
trait SchemaAsyncAnnotateFileResponse extends js.Object {
  /**
    * The output location and metadata from AsyncAnnotateFileRequest.
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.native
}

object SchemaAsyncAnnotateFileResponse {
  @scala.inline
  def apply(): SchemaAsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncAnnotateFileResponse]
  }
  @scala.inline
  implicit class SchemaAsyncAnnotateFileResponseOps[Self <: SchemaAsyncAnnotateFileResponse] (val x: Self) extends AnyVal {
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
    def setOutputConfig(value: SchemaOutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
  }
  
}

