package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadAsync extends js.Object {
  var autoRetryAfter: js.UndefOr[Double] = js.native
  var autoUpload: js.UndefOr[Boolean] = js.native
  var batch: js.UndefOr[Boolean] = js.native
  var chunkSize: js.UndefOr[Double] = js.native
  var concurrent: js.UndefOr[Boolean] = js.native
  var maxAutoRetries: js.UndefOr[Double] = js.native
  var removeField: js.UndefOr[String] = js.native
  var removeUrl: js.UndefOr[String] = js.native
  var removeVerb: js.UndefOr[String] = js.native
  var saveField: js.UndefOr[String] = js.native
  var saveUrl: js.UndefOr[String] = js.native
  var useArrayBuffer: js.UndefOr[Boolean] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object UploadAsync {
  @scala.inline
  def apply(): UploadAsync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAsync]
  }
  @scala.inline
  implicit class UploadAsyncOps[Self <: UploadAsync] (val x: Self) extends AnyVal {
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
    def setAutoRetryAfter(value: Double): Self = this.set("autoRetryAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRetryAfter: Self = this.set("autoRetryAfter", js.undefined)
    @scala.inline
    def setAutoUpload(value: Boolean): Self = this.set("autoUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpload: Self = this.set("autoUpload", js.undefined)
    @scala.inline
    def setBatch(value: Boolean): Self = this.set("batch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setConcurrent(value: Boolean): Self = this.set("concurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrent: Self = this.set("concurrent", js.undefined)
    @scala.inline
    def setMaxAutoRetries(value: Double): Self = this.set("maxAutoRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAutoRetries: Self = this.set("maxAutoRetries", js.undefined)
    @scala.inline
    def setRemoveField(value: String): Self = this.set("removeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveField: Self = this.set("removeField", js.undefined)
    @scala.inline
    def setRemoveUrl(value: String): Self = this.set("removeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveUrl: Self = this.set("removeUrl", js.undefined)
    @scala.inline
    def setRemoveVerb(value: String): Self = this.set("removeVerb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveVerb: Self = this.set("removeVerb", js.undefined)
    @scala.inline
    def setSaveField(value: String): Self = this.set("saveField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveField: Self = this.set("saveField", js.undefined)
    @scala.inline
    def setSaveUrl(value: String): Self = this.set("saveUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveUrl: Self = this.set("saveUrl", js.undefined)
    @scala.inline
    def setUseArrayBuffer(value: Boolean): Self = this.set("useArrayBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseArrayBuffer: Self = this.set("useArrayBuffer", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

