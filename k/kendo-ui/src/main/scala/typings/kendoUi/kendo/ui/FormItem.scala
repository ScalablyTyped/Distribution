package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItem extends js.Object {
  var editor: js.UndefOr[String | js.Function] = js.undefined
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[FormItem]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var validation: js.UndefOr[js.Any] = js.undefined
}

object FormItem {
  @scala.inline
  def apply(
    editor: String | js.Function = null,
    editorOptions: js.Any = null,
    field: String = null,
    id: String = null,
    items: js.Array[FormItem] = null,
    label: String = null,
    name: String = null,
    title: String = null,
    `type`: String = null,
    validation: js.Any = null
  ): FormItem = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItem]
  }
}

