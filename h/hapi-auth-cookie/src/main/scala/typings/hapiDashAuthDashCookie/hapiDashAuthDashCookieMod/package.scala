package typings.hapiDashAuthDashCookie

import typings.hapi.hapiMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashAuthDashCookieMod {
  type RedirectToFunction = js.Function1[/* request */ js.UndefOr[Request], String]
  type ValidateFunction = js.Function2[
    /* request */ js.UndefOr[Request], 
    /* session */ js.UndefOr[js.Object], 
    js.Promise[ValidateResponse]
  ]
}
