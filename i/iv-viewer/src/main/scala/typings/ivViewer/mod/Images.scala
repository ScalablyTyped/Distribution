package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Images extends js.Object {
  var hiResImageSrc: IVImage
  var imageSrc: IVImage
}

object Images {
  @scala.inline
  def apply(hiResImageSrc: IVImage = null, imageSrc: IVImage = null): Images = {
    val __obj = js.Dynamic.literal()
    if (hiResImageSrc != null) __obj.updateDynamic("hiResImageSrc")(hiResImageSrc.asInstanceOf[js.Any])
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
}

