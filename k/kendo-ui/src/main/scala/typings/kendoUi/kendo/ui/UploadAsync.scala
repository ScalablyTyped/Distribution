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
    autoRetryAfter: Int | Double = null,
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    batch: js.UndefOr[Boolean] = js.undefined,
    chunkSize: Int | Double = null,
    concurrent: js.UndefOr[Boolean] = js.undefined,
    maxAutoRetries: Int | Double = null,
    removeField: String = null,
    removeUrl: String = null,
    removeVerb: String = null,
    saveField: String = null,
    saveUrl: String = null,
    useArrayBuffer: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): UploadAsync = {
    val __obj = js.Dynamic.literal()
    if (autoRetryAfter != null) __obj.updateDynamic("autoRetryAfter")(autoRetryAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrent)) __obj.updateDynamic("concurrent")(concurrent.asInstanceOf[js.Any])
    if (maxAutoRetries != null) __obj.updateDynamic("maxAutoRetries")(maxAutoRetries.asInstanceOf[js.Any])
    if (removeField != null) __obj.updateDynamic("removeField")(removeField.asInstanceOf[js.Any])
    if (removeUrl != null) __obj.updateDynamic("removeUrl")(removeUrl.asInstanceOf[js.Any])
    if (removeVerb != null) __obj.updateDynamic("removeVerb")(removeVerb.asInstanceOf[js.Any])
    if (saveField != null) __obj.updateDynamic("saveField")(saveField.asInstanceOf[js.Any])
    if (saveUrl != null) __obj.updateDynamic("saveUrl")(saveUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(useArrayBuffer)) __obj.updateDynamic("useArrayBuffer")(useArrayBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadAsync]
  }
}

