package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadLocalization extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var clearSelectedFiles: js.UndefOr[String] = js.undefined
  var dropFilesHere: js.UndefOr[String] = js.undefined
  var headerStatusUploaded: js.UndefOr[String] = js.undefined
  var headerStatusUploading: js.UndefOr[String] = js.undefined
  var invalidFileExtension: js.UndefOr[String] = js.undefined
  var invalidFiles: js.UndefOr[String] = js.undefined
  var invalidMaxFileSize: js.UndefOr[String] = js.undefined
  var invalidMinFileSize: js.UndefOr[String] = js.undefined
  var remove: js.UndefOr[String] = js.undefined
  var retry: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[String] = js.undefined
  var statusFailed: js.UndefOr[String] = js.undefined
  var statusUploaded: js.UndefOr[String] = js.undefined
  var statusUploading: js.UndefOr[String] = js.undefined
  var uploadSelectedFiles: js.UndefOr[String] = js.undefined
}

object UploadLocalization {
  @scala.inline
  def apply(
    cancel: String = null,
    clearSelectedFiles: String = null,
    dropFilesHere: String = null,
    headerStatusUploaded: String = null,
    headerStatusUploading: String = null,
    invalidFileExtension: String = null,
    invalidFiles: String = null,
    invalidMaxFileSize: String = null,
    invalidMinFileSize: String = null,
    remove: String = null,
    retry: String = null,
    select: String = null,
    statusFailed: String = null,
    statusUploaded: String = null,
    statusUploading: String = null,
    uploadSelectedFiles: String = null
  ): UploadLocalization = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (clearSelectedFiles != null) __obj.updateDynamic("clearSelectedFiles")(clearSelectedFiles)
    if (dropFilesHere != null) __obj.updateDynamic("dropFilesHere")(dropFilesHere)
    if (headerStatusUploaded != null) __obj.updateDynamic("headerStatusUploaded")(headerStatusUploaded)
    if (headerStatusUploading != null) __obj.updateDynamic("headerStatusUploading")(headerStatusUploading)
    if (invalidFileExtension != null) __obj.updateDynamic("invalidFileExtension")(invalidFileExtension)
    if (invalidFiles != null) __obj.updateDynamic("invalidFiles")(invalidFiles)
    if (invalidMaxFileSize != null) __obj.updateDynamic("invalidMaxFileSize")(invalidMaxFileSize)
    if (invalidMinFileSize != null) __obj.updateDynamic("invalidMinFileSize")(invalidMinFileSize)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (select != null) __obj.updateDynamic("select")(select)
    if (statusFailed != null) __obj.updateDynamic("statusFailed")(statusFailed)
    if (statusUploaded != null) __obj.updateDynamic("statusUploaded")(statusUploaded)
    if (statusUploading != null) __obj.updateDynamic("statusUploading")(statusUploading)
    if (uploadSelectedFiles != null) __obj.updateDynamic("uploadSelectedFiles")(uploadSelectedFiles)
    __obj.asInstanceOf[UploadLocalization]
  }
}

