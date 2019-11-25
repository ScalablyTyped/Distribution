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
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], cursorAccent = cursorAccent.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IThemeObject]
  }
}

