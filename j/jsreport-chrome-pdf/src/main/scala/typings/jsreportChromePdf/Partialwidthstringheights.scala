package typings.jsreportChromePdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  width  :string,   height  :string,   deviceScaleFactor  :string,   isMobile  :boolean,   hasTouch  :boolean,   isLandscape  :boolean}> */
trait Partialwidthstringheights extends js.Object {
  var deviceScaleFactor: js.UndefOr[String] = js.undefined
  var hasTouch: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var isLandscape: js.UndefOr[Boolean] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Partialwidthstringheights {
  @scala.inline
  def apply(
    deviceScaleFactor: String = null,
    hasTouch: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    isLandscape: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): Partialwidthstringheights = {
    val __obj = js.Dynamic.literal()
    if (deviceScaleFactor != null) __obj.updateDynamic("deviceScaleFactor")(deviceScaleFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTouch)) __obj.updateDynamic("hasTouch")(hasTouch.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isLandscape)) __obj.updateDynamic("isLandscape")(isLandscape.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialwidthstringheights]
  }
}

