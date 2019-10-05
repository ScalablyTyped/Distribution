package typings.jqueryDashGalleria.GalleriaJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleriaOptions extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var dataSource: js.Array[GalleriaEntry]
  var lightbox: js.UndefOr[Boolean] = js.undefined
}

object GalleriaOptions {
  @scala.inline
  def apply(
    dataSource: js.Array[GalleriaEntry],
    autoplay: js.UndefOr[Boolean] = js.undefined,
    lightbox: js.UndefOr[Boolean] = js.undefined
  ): GalleriaOptions = {
    val __obj = js.Dynamic.literal(dataSource = dataSource)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(lightbox)) __obj.updateDynamic("lightbox")(lightbox)
    __obj.asInstanceOf[GalleriaOptions]
  }
}

