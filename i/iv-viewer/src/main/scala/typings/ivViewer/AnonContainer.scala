package typings.ivViewer

import typings.ivViewer.mod.IVImage
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: Element | Null
  var domElement: Element | Null
  var hiResImageSrc: IVImage
  var imageSrc: IVImage
}

object AnonContainer {
  @scala.inline
  def apply(
    container: Element = null,
    domElement: Element = null,
    hiResImageSrc: IVImage = null,
    imageSrc: IVImage = null
  ): AnonContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (domElement != null) __obj.updateDynamic("domElement")(domElement.asInstanceOf[js.Any])
    if (hiResImageSrc != null) __obj.updateDynamic("hiResImageSrc")(hiResImageSrc.asInstanceOf[js.Any])
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

