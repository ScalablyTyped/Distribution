package typings.atJupyterlabTerminal.libTokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type for the terminal theme.
  */
trait IThemeObject extends js.Object {
  var background: String
  var cursor: String
  var cursorAccent: String
  var foreground: String
  var selection: String
}

object IThemeObject {
  @scala.inline
  def apply(background: String, cursor: String, cursorAccent: String, foreground: String, selection: String): IThemeObject = {
    val __obj = js.Dynamic.literal(background = background, cursor = cursor, cursorAccent = cursorAccent, foreground = foreground, selection = selection)
  
    __obj.asInstanceOf[IThemeObject]
  }
}

