package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadAsync extends js.Object {
  var autoRetryAfter: js.UndefOr[Double] = js.undefined
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  var batch: js.UndefOr[Boolean] = js.undefined
  var chunkSize: js.UndefOr[Double] = js.undefined
  var concurrent: js.UndefOr[Boolean] = js.undefined
  var maxAutoRetries: js.UndefOr[Double] = js.undefined
  var removeField: js.UndefOr[String] = js.undefined
  var removeUrl: js.UndefOr[String] = js.undefined
  var removeVerb: js.UndefOr[String] = js.undefined
  var saveField: js.UndefOr[String] = js.undefined
  var saveUrl: js.UndefOr[String] = js.undefined
  var useArrayBuffer: js.UndefOr[Boolean] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object UploadAsync {
  @scala.inline
  def apply(
    autoRetryAfter: js.UndefOr[Double] = js.undefined,
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    batch: js.UndefOr[Boolean] = js.undefined,
    chunkSize: js.UndefOr[Double] = js.undefined,
    concurrent: js.UndefOr[Boolean] = js.undefined,
    maxAutoRetries: js.UndefOr[Double] = js.undefined,
    removeField: String = null,
    removeUrl: String = null,
    removeVerb: String = null,
    saveField: String = null,
    saveUrl: String = null,
    useArrayBuffer: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): UploadAsync = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRetryAfter)) __obj.updateDynamic("autoRetryAfter")(autoRetryAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrent)) __obj.updateDynamic("concurrent")(concurrent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAutoRetries)) __obj.updateDynamic("maxAutoRetries")(maxAutoRetries.get.asInstanceOf[js.Any])
    if (removeField != null) __obj.updateDynamic("removeField")(removeField.asInstanceOf[js.Any])
    if (removeUrl != null) __obj.updateDynamic("removeUrl")(removeUrl.asInstanceOf[js.Any])
    if (removeVerb != null) __obj.updateDynamic("removeVerb")(removeVerb.asInstanceOf[js.Any])
    if (saveField != null) __obj.updateDynamic("saveField")(saveField.asInstanceOf[js.Any])
    if (saveUrl != null) __obj.updateDynamic("saveUrl")(saveUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(useArrayBuffer)) __obj.updateDynamic("useArrayBuffer")(useArrayBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadAsync]
  }
}

