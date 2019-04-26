package typings
package atHapiCookieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RedirectTo extends js.Object {
  var redirectTo: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RedirectTo {
  @scala.inline
  def apply(redirectTo: js.UndefOr[scala.Boolean] = js.undefined): Anon_RedirectTo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(redirectTo)) __obj.updateDynamic("redirectTo")(redirectTo)
    __obj.asInstanceOf[Anon_RedirectTo]
  }
}

