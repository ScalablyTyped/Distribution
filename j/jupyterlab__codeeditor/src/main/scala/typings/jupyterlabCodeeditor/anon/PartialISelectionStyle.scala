package typings.jupyterlabCodeeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/codeeditor.@jupyterlab/codeeditor/lib/editor.CodeEditor.ISelectionStyle> */
trait PartialISelectionStyle extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
}

object PartialISelectionStyle {
  @scala.inline
  def apply(className: String = null, color: String = null, displayName: String = null): PartialISelectionStyle = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialISelectionStyle]
  }
}

