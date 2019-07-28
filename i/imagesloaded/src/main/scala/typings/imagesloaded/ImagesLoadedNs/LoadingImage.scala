package typings.imagesloaded.ImagesLoadedNs

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interface for an image currently loading or completed */
trait LoadingImage extends js.Object {
  var img: HTMLImageElement
  var isLoaded: Boolean
}

object LoadingImage {
  @scala.inline
  def apply(img: HTMLImageElement, isLoaded: Boolean): LoadingImage = {
    val __obj = js.Dynamic.literal(img = img, isLoaded = isLoaded)
  
    __obj.asInstanceOf[LoadingImage]
  }
}

