package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoProviderOptions extends js.Object {
  /**
    * If set, the renderer will use technologies (like webgl) that only work when cors headers are appropiately set on the provided images.
    * It is the developer's task to serve the images correctly in combination with this flag, which might otherwise lead to SecurityErrors.
    */
  var cors: js.UndefOr[Boolean] = js.undefined
}

object PanoProviderOptions {
  @scala.inline
  def apply(cors: js.UndefOr[Boolean] = js.undefined): PanoProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoProviderOptions]
  }
}

