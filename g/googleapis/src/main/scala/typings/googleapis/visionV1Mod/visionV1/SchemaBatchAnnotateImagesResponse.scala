package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a batch image annotation request.
  */
@js.native
trait SchemaBatchAnnotateImagesResponse extends js.Object {
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateImageResponse]] = js.native
}

object SchemaBatchAnnotateImagesResponse {
  @scala.inline
  def apply(): SchemaBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchAnnotateImagesResponse]
  }
  @scala.inline
  implicit class SchemaBatchAnnotateImagesResponseOps[Self <: SchemaBatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
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
    def setResponsesVarargs(value: SchemaAnnotateImageResponse*): Self = this.set("responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: js.Array[SchemaAnnotateImageResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
  }
  
}

