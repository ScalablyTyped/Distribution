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
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (clearSelectedFiles != null) __obj.updateDynamic("clearSelectedFiles")(clearSelectedFiles.asInstanceOf[js.Any])
    if (dropFilesHere != null) __obj.updateDynamic("dropFilesHere")(dropFilesHere.asInstanceOf[js.Any])
    if (headerStatusUploaded != null) __obj.updateDynamic("headerStatusUploaded")(headerStatusUploaded.asInstanceOf[js.Any])
    if (headerStatusUploading != null) __obj.updateDynamic("headerStatusUploading")(headerStatusUploading.asInstanceOf[js.Any])
    if (invalidFileExtension != null) __obj.updateDynamic("invalidFileExtension")(invalidFileExtension.asInstanceOf[js.Any])
    if (invalidFiles != null) __obj.updateDynamic("invalidFiles")(invalidFiles.asInstanceOf[js.Any])
    if (invalidMaxFileSize != null) __obj.updateDynamic("invalidMaxFileSize")(invalidMaxFileSize.asInstanceOf[js.Any])
    if (invalidMinFileSize != null) __obj.updateDynamic("invalidMinFileSize")(invalidMinFileSize.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (statusFailed != null) __obj.updateDynamic("statusFailed")(statusFailed.asInstanceOf[js.Any])
    if (statusUploaded != null) __obj.updateDynamic("statusUploaded")(statusUploaded.asInstanceOf[js.Any])
    if (statusUploading != null) __obj.updateDynamic("statusUploading")(statusUploading.asInstanceOf[js.Any])
    if (uploadSelectedFiles != null) __obj.updateDynamic("uploadSelectedFiles")(uploadSelectedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLocalization]
  }
}

