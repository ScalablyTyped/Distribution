package typings
package imagesloadedLib.ImagesLoadedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interface for an image currently loading or completed */
trait LoadingImage extends js.Object {
  var img: stdLib.HTMLImageElement
  var isLoaded: scala.Boolean
}

object LoadingImage {
  @scala.inline
  def apply(img: stdLib.HTMLImageElement, isLoaded: scala.Boolean): LoadingImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("img")(img)
    __obj.updateDynamic("isLoaded")(isLoaded)
    __obj.asInstanceOf[LoadingImage]
  }
}

