package typings
package koaDashRouterLib.koaDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RouterNs {
  type IMiddleware = js.Function2[/* ctx */ IRouterContext, /* next */ js.Function0[stdLib.Promise[js.Any]], js.Any]
  type IParamMiddleware = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ IRouterContext, 
    /* next */ js.Function0[stdLib.Promise[js.Any]], 
    js.Any
  ]
}
