package typings.ivViewer.anon

import typings.ivViewer.mod.IVImage
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: Element | Null
  var domElement: Element | Null
  var hiResImageSrc: IVImage
  var imageSrc: IVImage
}

object Container {
  @scala.inline
  def apply(
    container: Element = null,
    domElement: Element = null,
    hiResImageSrc: IVImage = null,
    imageSrc: IVImage = null
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any], hiResImageSrc = hiResImageSrc.asInstanceOf[js.Any], imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

