package typings
package koaDashRouteLib.koaDashRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KoaRouteNs {
  type CreateMethod = js.Function1[/* method */ java.lang.String, Method]
  type CreateRoute = js.Function1[/* routeFunc */ Handler, koaLib.koaMod.ApplicationNs.Middleware]
  type Handler = js.ThisFunction2[
    /* this */ koaLib.koaMod.ApplicationNs.Context, 
    /* ctx */ koaLib.koaMod.ApplicationNs.Context, 
    /* repeated */ js.Any, 
    js.Any
  ]
  type Path = java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])
}
