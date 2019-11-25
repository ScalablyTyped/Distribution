package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorActionParams extends js.Object {
  @JSName("clone")
  var clone_FJSONEditorActionParams: js.UndefOr[JSONEditorNode] = js.undefined
  var endIndex: js.UndefOr[Double] = js.undefined
  var endParent: js.UndefOr[JSONEditorNode] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var newType: js.UndefOr[JSONEditorNodeType] = js.undefined
  var newValue: js.UndefOr[String] = js.undefined
  var node: js.UndefOr[JSONEditorNode] = js.undefined
  var oldType: js.UndefOr[JSONEditorNodeType] = js.undefined
  var oldValue: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[JSONEditorNode] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var startParent: js.UndefOr[JSONEditorNode] = js.undefined
}

object JSONEditorActionParams {
  @scala.inline
  def apply(
    clone: JSONEditorNode = null,
    endIndex: Int | Double = null,
    endParent: JSONEditorNode = null,
    index: Int | Double = null,
    newType: JSONEditorNodeType = null,
    newValue: String = null,
    node: JSONEditorNode = null,
    oldType: JSONEditorNodeType = null,
    oldValue: String = null,
    parent: JSONEditorNode = null,
    startIndex: Int | Double = null,
    startParent: JSONEditorNode = null
  ): JSONEditorActionParams = {
    val __obj = js.Dynamic.literal()
    if (clone != null) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (endParent != null) __obj.updateDynamic("endParent")(endParent.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (newType != null) __obj.updateDynamic("newType")(newType.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (oldType != null) __obj.updateDynamic("oldType")(oldType.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (startParent != null) __obj.updateDynamic("startParent")(startParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorActionParams]
  }
}

