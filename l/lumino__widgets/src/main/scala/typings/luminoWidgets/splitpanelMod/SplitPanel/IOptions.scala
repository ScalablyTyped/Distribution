package typings.luminoWidgets.splitpanelMod.SplitPanel

import typings.luminoWidgets.splitlayoutMod.SplitLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a split panel.
  */
trait IOptions extends js.Object {
  /**
    * The content alignment of the panel.
    *
    * The default is `'start'`.
    */
  var alignment: js.UndefOr[Alignment] = js.undefined
  /**
    * The split layout to use for the split panel.
    *
    * If this is provided, the other options are ignored.
    *
    * The default is a new `SplitLayout`.
    */
  var layout: js.UndefOr[SplitLayout] = js.undefined
  /**
    * The layout orientation of the panel.
    *
    * The default is `'horizontal'`.
    */
  var orientation: js.UndefOr[Orientation] = js.undefined
  /**
    * The renderer to use for the split panel.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[IRenderer] = js.undefined
  /**
    * The spacing between items in the panel.
    *
    * The default is `4`.
    */
  var spacing: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    alignment: Alignment = null,
    layout: SplitLayout = null,
    orientation: Orientation = null,
    renderer: IRenderer = null,
    spacing: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

