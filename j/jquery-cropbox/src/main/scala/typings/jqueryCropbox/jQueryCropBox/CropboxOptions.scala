package typings.jqueryCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropboxOptions extends js.Object {
  /**
    * If not null, this is the entire html block that should appear on hover over the image for instructions and/or buttons (could include the zoom in/out buttons for example). If null, the default html block is used which has the text "Click to drag" and the zoom in/out buttons. Use false to disable controls.
    */
  var controls: js.UndefOr[js.Any] = js.undefined
  /**
    * Height in pixels of the cropping window
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Maximum zoom value. With the default of 1.0 users can't zoom beyond the maximum image resolution.
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  /**
    * Set the initial cropping area
    */
  var result: js.UndefOr[CropboxArea] = js.undefined
  /**
    * This flag is used to determine when to display the controls. Never, always and hover do exactly what you would expect (never show them, always show them, show them on hover). The auto flag is the same as the hover flag, except that on mobile devices it always shows the controls (since there is no hover event).
    */
  var showControls: js.UndefOr[ShowControls] = js.undefined
  /**
    * Width in pixels of the cropping window
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Number of incremental zoom steps. With the default of 10, you have to click the zoom-in button 9 times to reach 100%.
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object CropboxOptions {
  @scala.inline
  def apply(
    controls: js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    result: CropboxArea = null,
    showControls: ShowControls = null,
    width: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): CropboxOptions = {
    val __obj = js.Dynamic.literal()
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (showControls != null) __obj.updateDynamic("showControls")(showControls.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropboxOptions]
  }
}

