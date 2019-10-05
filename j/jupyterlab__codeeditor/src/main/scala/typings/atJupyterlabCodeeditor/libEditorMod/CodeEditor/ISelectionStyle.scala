package typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
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
    val __obj = js.Dynamic.literal(className = className, color = color, displayName = displayName)
  
    __obj.asInstanceOf[ISelectionStyle]
  }
}

