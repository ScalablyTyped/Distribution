package typings
package hapiDashAuthDashCookieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashAuthDashCookieMod {
  type RedirectToFunction = js.Function1[/* request */ js.UndefOr[hapiLib.hapiMod.Request], java.lang.String]
  type ValidateFunction = js.Function2[
    /* request */ js.UndefOr[hapiLib.hapiMod.Request], 
    /* session */ js.UndefOr[js.Object], 
    js.Promise[ValidateResponse]
  ]
}
