package typings.imagesloaded.ImagesLoaded_

import typings.imagesloaded.imagesloadedBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesLoadedOptions extends js.Object {
  var background: `true` | String
}

object ImagesLoadedOptions {
  @scala.inline
  def apply(background: `true` | String): ImagesLoadedOptions = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImagesLoadedOptions]
  }
}

