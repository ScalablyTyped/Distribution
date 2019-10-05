package typings.atJupyterlabTerminal.libTokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the terminal widget.
  */
trait IOptions extends js.Object {
  /**
    * Whether to blink the cursor.  Can only be set at startup.
    */
  var cursorBlink: Boolean
  /**
    * The font family used to render text.
    */
  var fontFamily: String | Null
  /**
    * The font size of the terminal in pixels.
    */
  var fontSize: Double
  /**
    * An optional command to run when the session starts.
    */
  var initialCommand: String
  /**
    * The line height used to render text.
    */
  var lineHeight: Double | Null
  /**
    * Whether to enable using Ctrl+V to paste.
    *
    * This setting has no effect on macOS, where Cmd+V is available.
    */
  var pasteWithCtrlV: Boolean
  /**
    * Whether to enable screen reader support.
    */
  var screenReaderMode: Boolean
  /**
    * The amount of buffer scrollback to be used
    * with the terminal
    */
  var scrollback: Double | Null
  /**
    * Whether to shut down the session when closing a terminal or not.
    */
  var shutdownOnClose: Boolean
  /**
    * The theme of the terminal.
    */
  var theme: Theme
}

object IOptions {
  @scala.inline
  def apply(
    cursorBlink: Boolean,
    fontSize: Double,
    initialCommand: String,
    pasteWithCtrlV: Boolean,
    screenReaderMode: Boolean,
    shutdownOnClose: Boolean,
    theme: Theme,
    fontFamily: String = null,
    lineHeight: Int | Double = null,
    scrollback: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(cursorBlink = cursorBlink, fontSize = fontSize, initialCommand = initialCommand, pasteWithCtrlV = pasteWithCtrlV, screenReaderMode = screenReaderMode, shutdownOnClose = shutdownOnClose, theme = theme)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (scrollback != null) __obj.updateDynamic("scrollback")(scrollback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

