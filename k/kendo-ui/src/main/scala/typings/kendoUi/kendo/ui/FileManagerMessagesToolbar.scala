package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerMessagesToolbar extends js.Object {
  var createFolder: js.UndefOr[String] = js.native
  var dateCreatedField: js.UndefOr[String] = js.native
  var dateModifiedField: js.UndefOr[String] = js.native
  var delete: js.UndefOr[String] = js.native
  var details: js.UndefOr[String] = js.native
  var detailsChecked: js.UndefOr[String] = js.native
  var detailsUnchecked: js.UndefOr[String] = js.native
  var nameField: js.UndefOr[String] = js.native
  var rename: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var sizeField: js.UndefOr[String] = js.native
  var sortDirection: js.UndefOr[String] = js.native
  var sortDirectionAsc: js.UndefOr[String] = js.native
  var sortDirectionDesc: js.UndefOr[String] = js.native
  var sortField: js.UndefOr[String] = js.native
  var typeField: js.UndefOr[String] = js.native
  var uploadDialog: js.UndefOr[String] = js.native
}

object FileManagerMessagesToolbar {
  @scala.inline
  def apply(): FileManagerMessagesToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesToolbar]
  }
  @scala.inline
  implicit class FileManagerMessagesToolbarOps[Self <: FileManagerMessagesToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateFolder(value: String): Self = this.set("createFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateFolder: Self = this.set("createFolder", js.undefined)
    @scala.inline
    def setDateCreatedField(value: String): Self = this.set("dateCreatedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCreatedField: Self = this.set("dateCreatedField", js.undefined)
    @scala.inline
    def setDateModifiedField(value: String): Self = this.set("dateModifiedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateModifiedField: Self = this.set("dateModifiedField", js.undefined)
    @scala.inline
    def setDelete(value: String): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setDetailsChecked(value: String): Self = this.set("detailsChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailsChecked: Self = this.set("detailsChecked", js.undefined)
    @scala.inline
    def setDetailsUnchecked(value: String): Self = this.set("detailsUnchecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailsUnchecked: Self = this.set("detailsUnchecked", js.undefined)
    @scala.inline
    def setNameField(value: String): Self = this.set("nameField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameField: Self = this.set("nameField", js.undefined)
    @scala.inline
    def setRename(value: String): Self = this.set("rename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSizeField(value: String): Self = this.set("sizeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeField: Self = this.set("sizeField", js.undefined)
    @scala.inline
    def setSortDirection(value: String): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
    @scala.inline
    def setSortDirectionAsc(value: String): Self = this.set("sortDirectionAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDirectionAsc: Self = this.set("sortDirectionAsc", js.undefined)
    @scala.inline
    def setSortDirectionDesc(value: String): Self = this.set("sortDirectionDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDirectionDesc: Self = this.set("sortDirectionDesc", js.undefined)
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setTypeField(value: String): Self = this.set("typeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeField: Self = this.set("typeField", js.undefined)
    @scala.inline
    def setUploadDialog(value: String): Self = this.set("uploadDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadDialog: Self = this.set("uploadDialog", js.undefined)
  }
  
}

