package typings
package hapiDashAuthDashCookieLib.hapiDashAuthDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiAuthCookieNs {
  type RedirectToFunction = js.Function1[/* request */ js.UndefOr[hapiLib.hapiMod.Request], scala.Unit]
  type ValidateFunction = js.Function2[
    /* request */ js.UndefOr[hapiLib.hapiMod.Request], 
    /* session */ js.UndefOr[js.Object], 
    stdLib.Promise[ValidateResponse]
  ]
}
