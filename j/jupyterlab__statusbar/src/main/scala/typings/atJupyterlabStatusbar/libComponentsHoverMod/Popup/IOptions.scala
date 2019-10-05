package typings.atJupyterlabStatusbar.libComponentsHoverMod.Popup

import typings.atJupyterlabStatusbar.atJupyterlabStatusbarStrings.left
import typings.atJupyterlabStatusbar.atJupyterlabStatusbarStrings.right
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a Popup widget.
  */
trait IOptions extends js.Object {
  /**
    * Whether to align the popup to the left or the right of the anchor.
    */
  var align: js.UndefOr[left | right] = js.undefined
  /**
    * The widget to which we are attaching the popup.
    */
  var anchor: Widget
  /**
    * The content of the popup.
    */
  var body: Widget
}

object IOptions {
  @scala.inline
  def apply(anchor: Widget, body: Widget, align: left | right = null): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor, body = body)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

