package typings.ivViewer.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elements extends js.Object {
  var container: Element | Null
  var domElement: Element | Null
  var image: js.UndefOr[Element | Null] = js.undefined
  var imageWrap: js.UndefOr[Element | Null] = js.undefined
  var snapHandle: js.UndefOr[Element | Null] = js.undefined
  var snapImage: js.UndefOr[Element | Null] = js.undefined
  var snapImageWrap: js.UndefOr[Element | Null] = js.undefined
  var snapView: js.UndefOr[Element | Null] = js.undefined
  var zoomHandle: js.UndefOr[Element | Null] = js.undefined
}

object Elements {
  @scala.inline
  def apply(
    container: Element = null,
    domElement: Element = null,
    image: Element = null,
    imageWrap: Element = null,
    snapHandle: Element = null,
    snapImage: Element = null,
    snapImageWrap: Element = null,
    snapView: Element = null,
    zoomHandle: Element = null
  ): Elements = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (domElement != null) __obj.updateDynamic("domElement")(domElement.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageWrap != null) __obj.updateDynamic("imageWrap")(imageWrap.asInstanceOf[js.Any])
    if (snapHandle != null) __obj.updateDynamic("snapHandle")(snapHandle.asInstanceOf[js.Any])
    if (snapImage != null) __obj.updateDynamic("snapImage")(snapImage.asInstanceOf[js.Any])
    if (snapImageWrap != null) __obj.updateDynamic("snapImageWrap")(snapImageWrap.asInstanceOf[js.Any])
    if (snapView != null) __obj.updateDynamic("snapView")(snapView.asInstanceOf[js.Any])
    if (zoomHandle != null) __obj.updateDynamic("zoomHandle")(zoomHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
}

