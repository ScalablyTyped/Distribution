package typings.jupyterlabTerminalExtension

import typings.jupyterlabTerminal.tokensMod.ITerminal.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/terminal.@jupyterlab/terminal.ITerminal.IOptions> */
trait PartialIOptions extends js.Object {
  var cursorBlink: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var initialCommand: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var pasteWithCtrlV: js.UndefOr[Boolean] = js.undefined
  var screenReaderMode: js.UndefOr[Boolean] = js.undefined
  var scrollback: js.UndefOr[Double] = js.undefined
  var shutdownOnClose: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
}

object PartialIOptions {
  @scala.inline
  def apply(
    cursorBlink: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    initialCommand: String = null,
    lineHeight: Int | Double = null,
    pasteWithCtrlV: js.UndefOr[Boolean] = js.undefined,
    screenReaderMode: js.UndefOr[Boolean] = js.undefined,
    scrollback: Int | Double = null,
    shutdownOnClose: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null
  ): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cursorBlink)) __obj.updateDynamic("cursorBlink")(cursorBlink.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (initialCommand != null) __obj.updateDynamic("initialCommand")(initialCommand.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteWithCtrlV)) __obj.updateDynamic("pasteWithCtrlV")(pasteWithCtrlV.asInstanceOf[js.Any])
    if (!js.isUndefined(screenReaderMode)) __obj.updateDynamic("screenReaderMode")(screenReaderMode.asInstanceOf[js.Any])
    if (scrollback != null) __obj.updateDynamic("scrollback")(scrollback.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownOnClose)) __obj.updateDynamic("shutdownOnClose")(shutdownOnClose.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIOptions]
  }
}

