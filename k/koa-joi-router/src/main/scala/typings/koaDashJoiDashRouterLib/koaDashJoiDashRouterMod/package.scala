package typings
package koaDashJoiDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashJoiDashRouterMod {
  type FullHandler = js.Function2[/* ctx */ koaLib.koaMod.Context, /* next */ js.Function0[js.Promise[js.Any]], js.Any]
  type Handler = FullHandler | NestedHandler
  type Method = js.Function3[
    /* path */ java.lang.String | stdLib.RegExp, 
    /* handlerOrConfig */ Handler | Config, 
    /* repeated */ Handler, 
    Router
  ]
}
