package typings.atJupyterlabCompleter.libWidgetMod.Completer

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a completion request reflecting the state of the editor.
  */
trait ITextState extends JSONObject {
  /**
    * The width of a character in the editor.
    */
  val charWidth: Double
  /**
    * The character number of the editor cursor within a line.
    */
  val column: Double
  /**
    * The line number of the editor cursor.
    */
  val line: Double
  /**
    * The height of a character in the editor.
    */
  val lineHeight: Double
  /**
    * The current value of the editor.
    */
  val text: String
}

object ITextState {
  @scala.inline
  def apply(charWidth: Double, column: Double, line: Double, lineHeight: Double, text: String): ITextState = {
    val __obj = js.Dynamic.literal(charWidth = charWidth, column = column, line = line, lineHeight = lineHeight, text = text)
  
    __obj.asInstanceOf[ITextState]
  }
}

