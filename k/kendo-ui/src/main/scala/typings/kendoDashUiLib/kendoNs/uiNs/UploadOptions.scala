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

object UploadOptions {
  @scala.inline
  def apply(
    async: UploadAsync = null,
    cancel: js.Function1[/* e */ UploadCancelEvent, scala.Unit] = null,
    clear: js.Function1[/* e */ UploadClearEvent, scala.Unit] = null,
    complete: js.Function1[/* e */ UploadEvent, scala.Unit] = null,
    directory: js.UndefOr[scala.Boolean] = js.undefined,
    directoryDrop: js.UndefOr[scala.Boolean] = js.undefined,
    dropZone: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Function1[/* e */ UploadErrorEvent, scala.Unit] = null,
    files: js.Array[UploadFile] = null,
    localization: UploadLocalization = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    pause: js.Function1[/* e */ UploadPauseEvent, scala.Unit] = null,
    progress: js.Function1[/* e */ UploadProgressEvent, scala.Unit] = null,
    remove: js.Function1[/* e */ UploadRemoveEvent, scala.Unit] = null,
    resume: js.Function1[/* e */ UploadEvent, scala.Unit] = null,
    select: js.Function1[/* e */ UploadSelectEvent, scala.Unit] = null,
    showFileList: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function1[/* e */ UploadSuccessEvent, scala.Unit] = null,
    template: java.lang.String | js.Function = null,
    upload: js.Function1[/* e */ UploadUploadEvent, scala.Unit] = null,
    validation: UploadValidation = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory)
    if (!js.isUndefined(directoryDrop)) __obj.updateDynamic("directoryDrop")(directoryDrop)
    if (dropZone != null) __obj.updateDynamic("dropZone")(dropZone)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (files != null) __obj.updateDynamic("files")(files)
    if (localization != null) __obj.updateDynamic("localization")(localization)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pause != null) __obj.updateDynamic("pause")(pause)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (resume != null) __obj.updateDynamic("resume")(resume)
    if (select != null) __obj.updateDynamic("select")(select)
    if (!js.isUndefined(showFileList)) __obj.updateDynamic("showFileList")(showFileList)
    if (success != null) __obj.updateDynamic("success")(success)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    __obj.asInstanceOf[UploadOptions]
  }
}

