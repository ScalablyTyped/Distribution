package typings
package koaDashJoiDashRouterLib.koaDashJoiDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createRouterNs {
  type FullHandler = js.Function2[
    /* ctx */ koaLib.koaMod.ApplicationNs.Context, 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  type Handler = FullHandler | NestedHandler
  type Method = js.Function3[
    /* path */ java.lang.String | stdLib.RegExp, 
    /* handlerOrConfig */ Handler | js.Object, 
    /* repeated */ Handler, 
    Router
  ]
  type OutputValidation = koaDashJoiDashRouterLib.Anon_Body | koaDashJoiDashRouterLib.Anon_Headers
}
