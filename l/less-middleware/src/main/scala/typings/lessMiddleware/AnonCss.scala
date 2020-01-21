package typings.lessMiddleware

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCss extends js.Object {
  /**
    * Function that modifies the compiled css output before being stored.
    */
  var css: js.UndefOr[js.Function2[/* css */ String, /* req */ Request_[ParamsDictionary], String]] = js.undefined
}

object AnonCss {
  @scala.inline
  def apply(css: (/* css */ String, /* req */ Request_[ParamsDictionary]) => String = null): AnonCss = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(js.Any.fromFunction2(css))
    __obj.asInstanceOf[AnonCss]
  }
}

