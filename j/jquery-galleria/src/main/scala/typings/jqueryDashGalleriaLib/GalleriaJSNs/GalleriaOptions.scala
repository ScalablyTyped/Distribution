package typings
package jqueryDashGalleriaLib.GalleriaJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleriaOptions extends js.Object {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var dataSource: js.Array[GalleriaEntry]
  var lightbox: js.UndefOr[scala.Boolean] = js.undefined
}

object GalleriaOptions {
  @scala.inline
  def apply(
    dataSource: js.Array[GalleriaEntry],
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    lightbox: js.UndefOr[scala.Boolean] = js.undefined
  ): GalleriaOptions = {
    val __obj = js.Dynamic.literal(dataSource = dataSource)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(lightbox)) __obj.updateDynamic("lightbox")(lightbox)
    __obj.asInstanceOf[GalleriaOptions]
  }
}

