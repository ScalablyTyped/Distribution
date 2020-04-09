package typings.jsoneditor.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.ErrorObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends BaseNode {
  var append: js.UndefOr[BaseNode] = js.undefined
  var childs: js.UndefOr[js.Array[Node]] = js.undefined
  var enum: js.UndefOr[Null | js.Array[String]] = js.undefined
  var error: js.UndefOr[ErrorObject] = js.undefined
  var errorChild: js.UndefOr[Node] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var field: String
  var fieldEditable: Boolean
  var fieldInnerText: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var previousField: String
  var previousValue: NodeValue
  var schema: js.UndefOr[js.Object] = js.undefined
  var showMore: js.UndefOr[BaseNode] = js.undefined
  var `type`: NodeType
  var value: NodeValue
  var valueFieldHTML: js.UndefOr[String] = js.undefined
  var valueInnerText: js.UndefOr[String] = js.undefined
  var visibleChilds: Double
}

object Node {
  @scala.inline
  def apply(
    dom: StringDictionary[HTMLElement],
    editor: JSONEditor,
    field: String,
    fieldEditable: Boolean,
    previousField: String,
    `type`: NodeType,
    visibleChilds: Double,
    append: BaseNode = null,
    childs: js.Array[Node] = null,
    editable: FieldEditable = null,
    enum: js.Array[String] = null,
    error: ErrorObject = null,
    errorChild: Node = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    fieldInnerText: String = null,
    id: String = null,
    parent: Node = null,
    previousValue: NodeValue = null,
    schema: js.Object = null,
    showMore: BaseNode = null,
    value: NodeValue = null,
    valueFieldHTML: String = null,
    valueInnerText: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldEditable = fieldEditable.asInstanceOf[js.Any], previousField = previousField.asInstanceOf[js.Any], visibleChilds = visibleChilds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (childs != null) __obj.updateDynamic("childs")(childs.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errorChild != null) __obj.updateDynamic("errorChild")(errorChild.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (fieldInnerText != null) __obj.updateDynamic("fieldInnerText")(fieldInnerText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (previousValue != null) __obj.updateDynamic("previousValue")(previousValue.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (showMore != null) __obj.updateDynamic("showMore")(showMore.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueFieldHTML != null) __obj.updateDynamic("valueFieldHTML")(valueFieldHTML.asInstanceOf[js.Any])
    if (valueInnerText != null) __obj.updateDynamic("valueInnerText")(valueInnerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

