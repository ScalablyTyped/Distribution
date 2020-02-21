package typings.isMobile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsMobileOptions extends js.Object {
  var featureDetect: js.UndefOr[Boolean] = js.undefined
  var tablet: js.UndefOr[Boolean] = js.undefined
  var ua: js.UndefOr[String | HttpRequestInterfaceMock] = js.undefined
}

object IsMobileOptions {
  @scala.inline
  def apply(
    featureDetect: js.UndefOr[Boolean] = js.undefined,
    tablet: js.UndefOr[Boolean] = js.undefined,
    ua: String | HttpRequestInterfaceMock = null
  ): IsMobileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(featureDetect)) __obj.updateDynamic("featureDetect")(featureDetect.asInstanceOf[js.Any])
    if (!js.isUndefined(tablet)) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (ua != null) __obj.updateDynamic("ua")(ua.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMobileOptions]
  }
}

