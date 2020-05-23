package typings.imagesloaded.ImagesLoaded

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
    val __obj = js.Dynamic.literal(img = img.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingImage]
  }
}

