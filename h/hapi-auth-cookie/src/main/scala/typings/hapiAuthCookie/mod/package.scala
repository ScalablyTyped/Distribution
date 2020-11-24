package typings.hapiAuthCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RedirectToFunction = js.Function1[/* request */ js.UndefOr[typings.hapi.mod.Request], java.lang.String]
  
  type ValidateFunction = js.Function2[
    /* request */ js.UndefOr[typings.hapi.mod.Request], 
    /* session */ js.UndefOr[js.Object], 
    js.Promise[typings.hapiAuthCookie.mod.ValidateResponse]
  ]
}
