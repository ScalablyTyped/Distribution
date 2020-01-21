package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A zero-based position in the editor.
  */
trait IPosition extends JSONObject {
  /**
    * The cursor column number.
    */
  val column: Double
  /**
    * The cursor line number.
    */
  val line: Double
}

object IPosition {
  @scala.inline
  def apply(column: Double, line: Double): IPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPosition]
  }
}

