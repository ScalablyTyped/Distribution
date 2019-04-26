package typings
package atHapiCookieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiCookieMod {
  type RedirectToFunction = js.Function1[/* request */ js.UndefOr[atHapiHapiLib.atHapiHapiMod.Request], java.lang.String]
  type ValidateFunction = js.Function2[
    /* request */ js.UndefOr[atHapiHapiLib.atHapiHapiMod.Request], 
    /* session */ js.UndefOr[js.Object], 
    js.Promise[ValidateResponse]
  ]
}
