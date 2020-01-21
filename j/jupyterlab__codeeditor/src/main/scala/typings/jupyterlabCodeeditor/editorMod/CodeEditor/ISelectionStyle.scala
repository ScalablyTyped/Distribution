package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection style.
  */
trait ISelectionStyle extends JSONObject {
  /**
    * A class name added to a selection.
    */
  var className: String
  /**
    * A color for UI elements.
    */
  var color: String
  /**
    * A display name added to a selection.
    */
  var displayName: String
}

object ISelectionStyle {
  @scala.inline
  def apply(className: String, color: String, displayName: String): ISelectionStyle = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISelectionStyle]
  }
}

