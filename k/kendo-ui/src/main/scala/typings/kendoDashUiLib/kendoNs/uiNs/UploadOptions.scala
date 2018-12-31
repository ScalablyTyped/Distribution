package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var async: js.UndefOr[UploadAsync] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ UploadCancelEvent, scala.Unit]] = js.undefined
  var clear: js.UndefOr[js.Function1[/* e */ UploadClearEvent, scala.Unit]] = js.undefined
  var complete: js.UndefOr[js.Function1[/* e */ UploadEvent, scala.Unit]] = js.undefined
  var directory: js.UndefOr[scala.Boolean] = js.undefined
  var directoryDrop: js.UndefOr[scala.Boolean] = js.undefined
  var dropZone: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ UploadErrorEvent, scala.Unit]] = js.undefined
  var files: js.UndefOr[js.Array[UploadFile]] = js.undefined
  var localization: js.UndefOr[UploadLocalization] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pause: js.UndefOr[js.Function1[/* e */ UploadPauseEvent, scala.Unit]] = js.undefined
  var progress: js.UndefOr[js.Function1[/* e */ UploadProgressEvent, scala.Unit]] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ UploadRemoveEvent, scala.Unit]] = js.undefined
  var resume: js.UndefOr[js.Function1[/* e */ UploadEvent, scala.Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ UploadSelectEvent, scala.Unit]] = js.undefined
  var showFileList: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[js.Function1[/* e */ UploadSuccessEvent, scala.Unit]] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var upload: js.UndefOr[js.Function1[/* e */ UploadUploadEvent, scala.Unit]] = js.undefined
  var validation: js.UndefOr[UploadValidation] = js.undefined
}

