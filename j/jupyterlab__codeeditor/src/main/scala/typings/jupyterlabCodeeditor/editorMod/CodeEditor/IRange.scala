package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range.
  */
trait IRange extends JSONObject {
  /**
    * The position of the last character in the current range.
    *
    * #### Notes
    * If this position is less than [start] then the range is considered
    * to be backward.
    */
  val end: IPosition
  /**
    * The position of the first character in the current range.
    *
    * #### Notes
    * If this position is greater than [end] then the range is considered
    * to be backward.
    */
  val start: IPosition
}

object IRange {
  @scala.inline
  def apply(end: IPosition, start: IPosition): IRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRange]
  }
}

