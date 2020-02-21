package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerMessagesToolbar extends js.Object {
  var createFolder: js.UndefOr[String] = js.undefined
  var dateCreatedField: js.UndefOr[String] = js.undefined
  var dateModifiedField: js.UndefOr[String] = js.undefined
  var delete: js.UndefOr[String] = js.undefined
  var details: js.UndefOr[String] = js.undefined
  var detailsChecked: js.UndefOr[String] = js.undefined
  var detailsUnchecked: js.UndefOr[String] = js.undefined
  var nameField: js.UndefOr[String] = js.undefined
  var rename: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var sizeField: js.UndefOr[String] = js.undefined
  var sortDirection: js.UndefOr[String] = js.undefined
  var sortDirectionAsc: js.UndefOr[String] = js.undefined
  var sortDirectionDesc: js.UndefOr[String] = js.undefined
  var sortField: js.UndefOr[String] = js.undefined
  var typeField: js.UndefOr[String] = js.undefined
  var uploadDialog: js.UndefOr[String] = js.undefined
}

object FileManagerMessagesToolbar {
  @scala.inline
  def apply(
    createFolder: String = null,
    dateCreatedField: String = null,
    dateModifiedField: String = null,
    delete: String = null,
    details: String = null,
    detailsChecked: String = null,
    detailsUnchecked: String = null,
    nameField: String = null,
    rename: String = null,
    search: String = null,
    sizeField: String = null,
    sortDirection: String = null,
    sortDirectionAsc: String = null,
    sortDirectionDesc: String = null,
    sortField: String = null,
    typeField: String = null,
    uploadDialog: String = null
  ): FileManagerMessagesToolbar = {
    val __obj = js.Dynamic.literal()
    if (createFolder != null) __obj.updateDynamic("createFolder")(createFolder.asInstanceOf[js.Any])
    if (dateCreatedField != null) __obj.updateDynamic("dateCreatedField")(dateCreatedField.asInstanceOf[js.Any])
    if (dateModifiedField != null) __obj.updateDynamic("dateModifiedField")(dateModifiedField.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (detailsChecked != null) __obj.updateDynamic("detailsChecked")(detailsChecked.asInstanceOf[js.Any])
    if (detailsUnchecked != null) __obj.updateDynamic("detailsUnchecked")(detailsUnchecked.asInstanceOf[js.Any])
    if (nameField != null) __obj.updateDynamic("nameField")(nameField.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (sizeField != null) __obj.updateDynamic("sizeField")(sizeField.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (sortDirectionAsc != null) __obj.updateDynamic("sortDirectionAsc")(sortDirectionAsc.asInstanceOf[js.Any])
    if (sortDirectionDesc != null) __obj.updateDynamic("sortDirectionDesc")(sortDirectionDesc.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (typeField != null) __obj.updateDynamic("typeField")(typeField.asInstanceOf[js.Any])
    if (uploadDialog != null) __obj.updateDynamic("uploadDialog")(uploadDialog.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerMessagesToolbar]
  }
}

