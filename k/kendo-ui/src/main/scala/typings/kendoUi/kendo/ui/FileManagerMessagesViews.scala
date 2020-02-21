package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerMessagesViews extends js.Object {
  var dateCreatedField: js.UndefOr[String] = js.undefined
  var dateModifiedField: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[String] = js.undefined
  var nameField: js.UndefOr[String] = js.undefined
  var sizeField: js.UndefOr[String] = js.undefined
  var typeField: js.UndefOr[String] = js.undefined
}

object FileManagerMessagesViews {
  @scala.inline
  def apply(
    dateCreatedField: String = null,
    dateModifiedField: String = null,
    items: String = null,
    nameField: String = null,
    sizeField: String = null,
    typeField: String = null
  ): FileManagerMessagesViews = {
    val __obj = js.Dynamic.literal()
    if (dateCreatedField != null) __obj.updateDynamic("dateCreatedField")(dateCreatedField.asInstanceOf[js.Any])
    if (dateModifiedField != null) __obj.updateDynamic("dateModifiedField")(dateModifiedField.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (nameField != null) __obj.updateDynamic("nameField")(nameField.asInstanceOf[js.Any])
    if (sizeField != null) __obj.updateDynamic("sizeField")(sizeField.asInstanceOf[js.Any])
    if (typeField != null) __obj.updateDynamic("typeField")(typeField.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerMessagesViews]
  }
}

