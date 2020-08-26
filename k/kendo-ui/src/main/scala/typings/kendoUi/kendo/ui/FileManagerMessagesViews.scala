package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerMessagesViews extends js.Object {
  var dateCreatedField: js.UndefOr[String] = js.native
  var dateModifiedField: js.UndefOr[String] = js.native
  var items: js.UndefOr[String] = js.native
  var nameField: js.UndefOr[String] = js.native
  var sizeField: js.UndefOr[String] = js.native
  var typeField: js.UndefOr[String] = js.native
}

object FileManagerMessagesViews {
  @scala.inline
  def apply(): FileManagerMessagesViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesViews]
  }
  @scala.inline
  implicit class FileManagerMessagesViewsOps[Self <: FileManagerMessagesViews] (val x: Self) extends AnyVal {
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
    def setDateCreatedField(value: String): Self = this.set("dateCreatedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCreatedField: Self = this.set("dateCreatedField", js.undefined)
    @scala.inline
    def setDateModifiedField(value: String): Self = this.set("dateModifiedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateModifiedField: Self = this.set("dateModifiedField", js.undefined)
    @scala.inline
    def setItems(value: String): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setNameField(value: String): Self = this.set("nameField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameField: Self = this.set("nameField", js.undefined)
    @scala.inline
    def setSizeField(value: String): Self = this.set("sizeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeField: Self = this.set("sizeField", js.undefined)
    @scala.inline
    def setTypeField(value: String): Self = this.set("typeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeField: Self = this.set("typeField", js.undefined)
  }
  
}

