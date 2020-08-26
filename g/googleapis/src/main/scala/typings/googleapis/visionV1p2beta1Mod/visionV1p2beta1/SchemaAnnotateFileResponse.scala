package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a single file annotation request. A file may contain one or
  * more images, which individually have their own responses.
  */
@js.native
trait SchemaAnnotateFileResponse extends js.Object {
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.native
  /**
    * Individual responses to images found within the file.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateImageResponse]] = js.native
}

object SchemaAnnotateFileResponse {
  @scala.inline
  def apply(): SchemaAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateFileResponse]
  }
  @scala.inline
  implicit class SchemaAnnotateFileResponseOps[Self <: SchemaAnnotateFileResponse] (val x: Self) extends AnyVal {
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
    def setInputConfig(value: SchemaInputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    @scala.inline
    def setResponsesVarargs(value: SchemaAnnotateImageResponse*): Self = this.set("responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: js.Array[SchemaAnnotateImageResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
  }
  
}

