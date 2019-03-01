package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadAsync extends js.Object {
  var autoRetryAfter: js.UndefOr[scala.Double] = js.undefined
  var autoUpload: js.UndefOr[scala.Boolean] = js.undefined
  var batch: js.UndefOr[scala.Boolean] = js.undefined
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var concurrent: js.UndefOr[scala.Boolean] = js.undefined
  var maxAutoRetries: js.UndefOr[scala.Double] = js.undefined
  var removeField: js.UndefOr[java.lang.String] = js.undefined
  var removeUrl: js.UndefOr[java.lang.String] = js.undefined
  var removeVerb: js.UndefOr[java.lang.String] = js.undefined
  var saveField: js.UndefOr[java.lang.String] = js.undefined
  var saveUrl: js.UndefOr[java.lang.String] = js.undefined
  var useArrayBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object UploadAsync {
  @scala.inline
  def apply(
    autoRetryAfter: scala.Int | scala.Double = null,
    autoUpload: js.UndefOr[scala.Boolean] = js.undefined,
    batch: js.UndefOr[scala.Boolean] = js.undefined,
    chunkSize: scala.Int | scala.Double = null,
    concurrent: js.UndefOr[scala.Boolean] = js.undefined,
    maxAutoRetries: scala.Int | scala.Double = null,
    removeField: java.lang.String = null,
    removeUrl: java.lang.String = null,
    removeVerb: java.lang.String = null,
    saveField: java.lang.String = null,
    saveUrl: java.lang.String = null,
    useArrayBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): UploadAsync = {
    val __obj = js.Dynamic.literal()
    if (autoRetryAfter != null) __obj.updateDynamic("autoRetryAfter")(autoRetryAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload)
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrent)) __obj.updateDynamic("concurrent")(concurrent)
    if (maxAutoRetries != null) __obj.updateDynamic("maxAutoRetries")(maxAutoRetries.asInstanceOf[js.Any])
    if (removeField != null) __obj.updateDynamic("removeField")(removeField)
    if (removeUrl != null) __obj.updateDynamic("removeUrl")(removeUrl)
    if (removeVerb != null) __obj.updateDynamic("removeVerb")(removeVerb)
    if (saveField != null) __obj.updateDynamic("saveField")(saveField)
    if (saveUrl != null) __obj.updateDynamic("saveUrl")(saveUrl)
    if (!js.isUndefined(useArrayBuffer)) __obj.updateDynamic("useArrayBuffer")(useArrayBuffer)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[UploadAsync]
  }
}

