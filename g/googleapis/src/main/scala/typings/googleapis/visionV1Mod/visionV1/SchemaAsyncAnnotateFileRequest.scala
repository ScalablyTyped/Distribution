package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An offline file annotation request.
  */
@js.native
trait SchemaAsyncAnnotateFileRequest extends js.Object {
  /**
    * Required. Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaFeature]] = js.native
  /**
    * Additional context that may accompany the image(s) in the file.
    */
  var imageContext: js.UndefOr[SchemaImageContext] = js.native
  /**
    * Required. Information about the input file.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.native
  /**
    * Required. The desired output location and metadata (e.g. format).
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.native
}

object SchemaAsyncAnnotateFileRequest {
  @scala.inline
  def apply(): SchemaAsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncAnnotateFileRequest]
  }
  @scala.inline
  implicit class SchemaAsyncAnnotateFileRequestOps[Self <: SchemaAsyncAnnotateFileRequest] (val x: Self) extends AnyVal {
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
    def setFeaturesVarargs(value: SchemaFeature*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[SchemaFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setImageContext(value: SchemaImageContext): Self = this.set("imageContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageContext: Self = this.set("imageContext", js.undefined)
    @scala.inline
    def setInputConfig(value: SchemaInputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    @scala.inline
    def setOutputConfig(value: SchemaOutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
  }
  
}

