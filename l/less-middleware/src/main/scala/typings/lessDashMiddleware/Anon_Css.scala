package typings.lessDashMiddleware

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Css extends js.Object {
  /**
    * Function that modifies the compiled css output before being stored.
    */
  var css: js.UndefOr[js.Function2[/* css */ String, /* req */ Request, String]] = js.undefined
}

object Anon_Css {
  @scala.inline
  def apply(css: (/* css */ String, /* req */ Request) => String = null): Anon_Css = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(js.Any.fromFunction2(css))
    __obj.asInstanceOf[Anon_Css]
  }
}

