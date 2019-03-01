package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFileBrowserMessages extends js.Object {
  var deleteFile: js.UndefOr[java.lang.String] = js.undefined
  var directoryNotFound: js.UndefOr[java.lang.String] = js.undefined
  var emptyFolder: js.UndefOr[java.lang.String] = js.undefined
  var invalidFileType: js.UndefOr[java.lang.String] = js.undefined
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  var orderByName: js.UndefOr[java.lang.String] = js.undefined
  var orderBySize: js.UndefOr[java.lang.String] = js.undefined
  var overwriteFile: js.UndefOr[java.lang.String] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
  var uploadFile: js.UndefOr[java.lang.String] = js.undefined
}

object EditorFileBrowserMessages {
  @scala.inline
  def apply(
    deleteFile: java.lang.String = null,
    directoryNotFound: java.lang.String = null,
    emptyFolder: java.lang.String = null,
    invalidFileType: java.lang.String = null,
    orderBy: java.lang.String = null,
    orderByName: java.lang.String = null,
    orderBySize: java.lang.String = null,
    overwriteFile: java.lang.String = null,
    search: java.lang.String = null,
    uploadFile: java.lang.String = null
  ): EditorFileBrowserMessages = {
    val __obj = js.Dynamic.literal()
    if (deleteFile != null) __obj.updateDynamic("deleteFile")(deleteFile)
    if (directoryNotFound != null) __obj.updateDynamic("directoryNotFound")(directoryNotFound)
    if (emptyFolder != null) __obj.updateDynamic("emptyFolder")(emptyFolder)
    if (invalidFileType != null) __obj.updateDynamic("invalidFileType")(invalidFileType)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (orderByName != null) __obj.updateDynamic("orderByName")(orderByName)
    if (orderBySize != null) __obj.updateDynamic("orderBySize")(orderBySize)
    if (overwriteFile != null) __obj.updateDynamic("overwriteFile")(overwriteFile)
    if (search != null) __obj.updateDynamic("search")(search)
    if (uploadFile != null) __obj.updateDynamic("uploadFile")(uploadFile)
    __obj.asInstanceOf[EditorFileBrowserMessages]
  }
}

