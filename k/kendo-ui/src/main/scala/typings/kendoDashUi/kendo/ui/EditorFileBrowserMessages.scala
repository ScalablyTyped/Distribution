package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFileBrowserMessages extends js.Object {
  var deleteFile: js.UndefOr[String] = js.undefined
  var directoryNotFound: js.UndefOr[String] = js.undefined
  var emptyFolder: js.UndefOr[String] = js.undefined
  var invalidFileType: js.UndefOr[String] = js.undefined
  var orderBy: js.UndefOr[String] = js.undefined
  var orderByName: js.UndefOr[String] = js.undefined
  var orderBySize: js.UndefOr[String] = js.undefined
  var overwriteFile: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var uploadFile: js.UndefOr[String] = js.undefined
}

object EditorFileBrowserMessages {
  @scala.inline
  def apply(
    deleteFile: String = null,
    directoryNotFound: String = null,
    emptyFolder: String = null,
    invalidFileType: String = null,
    orderBy: String = null,
    orderByName: String = null,
    orderBySize: String = null,
    overwriteFile: String = null,
    search: String = null,
    uploadFile: String = null
  ): EditorFileBrowserMessages = {
    val __obj = js.Dynamic.literal()
    if (deleteFile != null) __obj.updateDynamic("deleteFile")(deleteFile.asInstanceOf[js.Any])
    if (directoryNotFound != null) __obj.updateDynamic("directoryNotFound")(directoryNotFound.asInstanceOf[js.Any])
    if (emptyFolder != null) __obj.updateDynamic("emptyFolder")(emptyFolder.asInstanceOf[js.Any])
    if (invalidFileType != null) __obj.updateDynamic("invalidFileType")(invalidFileType.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (orderByName != null) __obj.updateDynamic("orderByName")(orderByName.asInstanceOf[js.Any])
    if (orderBySize != null) __obj.updateDynamic("orderBySize")(orderBySize.asInstanceOf[js.Any])
    if (overwriteFile != null) __obj.updateDynamic("overwriteFile")(overwriteFile.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (uploadFile != null) __obj.updateDynamic("uploadFile")(uploadFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorFileBrowserMessages]
  }
}

