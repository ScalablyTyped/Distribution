package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingKeyHandlerOptions extends js.Object {
  var lngParam: js.UndefOr[String] = js.undefined
  var nsParam: js.UndefOr[String] = js.undefined
}

object MissingKeyHandlerOptions {
  @scala.inline
  def apply(lngParam: String = null, nsParam: String = null): MissingKeyHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (lngParam != null) __obj.updateDynamic("lngParam")(lngParam.asInstanceOf[js.Any])
    if (nsParam != null) __obj.updateDynamic("nsParam")(nsParam.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingKeyHandlerOptions]
  }
}

