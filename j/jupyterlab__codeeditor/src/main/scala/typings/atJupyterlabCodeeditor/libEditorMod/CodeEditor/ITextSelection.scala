package typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A text selection.
  */
trait ITextSelection extends IRange {
  /**
    * The style of this selection.
    */
  val style: ISelectionStyle
  /**
    * The uuid of the text selection owner.
    */
  val uuid: String
}

object ITextSelection {
  @scala.inline
  def apply(end: IPosition, start: IPosition, style: ISelectionStyle, uuid: String): ITextSelection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITextSelection]
  }
}

