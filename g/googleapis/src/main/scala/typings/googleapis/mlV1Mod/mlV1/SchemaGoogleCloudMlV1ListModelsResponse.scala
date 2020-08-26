package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the ListModels method.
  */
@js.native
trait SchemaGoogleCloudMlV1ListModelsResponse extends js.Object {
  /**
    * The list of models.
    */
  var models: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Model]] = js.native
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1ListModelsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListModelsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ListModelsResponseOps[Self <: SchemaGoogleCloudMlV1ListModelsResponse] (val x: Self) extends AnyVal {
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
    def setModelsVarargs(value: SchemaGoogleCloudMlV1Model*): Self = this.set("models", js.Array(value :_*))
    @scala.inline
    def setModels(value: js.Array[SchemaGoogleCloudMlV1Model]): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

