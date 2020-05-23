package typings.ivViewer.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullScreenElements extends Elements {
  var fullScreen: Element | Null
}

object FullScreenElements {
  @scala.inline
  def apply(
    container: Element = null,
    domElement: Element = null,
    fullScreen: Element = null,
    image: js.UndefOr[Null | Element] = js.undefined,
    imageWrap: js.UndefOr[Null | Element] = js.undefined,
    snapHandle: js.UndefOr[Null | Element] = js.undefined,
    snapImage: js.UndefOr[Null | Element] = js.undefined,
    snapImageWrap: js.UndefOr[Null | Element] = js.undefined,
    snapView: js.UndefOr[Null | Element] = js.undefined,
    zoomHandle: js.UndefOr[Null | Element] = js.undefined
  ): FullScreenElements = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(imageWrap)) __obj.updateDynamic("imageWrap")(imageWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(snapHandle)) __obj.updateDynamic("snapHandle")(snapHandle.asInstanceOf[js.Any])
    if (!js.isUndefined(snapImage)) __obj.updateDynamic("snapImage")(snapImage.asInstanceOf[js.Any])
    if (!js.isUndefined(snapImageWrap)) __obj.updateDynamic("snapImageWrap")(snapImageWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(snapView)) __obj.updateDynamic("snapView")(snapView.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomHandle)) __obj.updateDynamic("zoomHandle")(zoomHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullScreenElements]
  }
}

