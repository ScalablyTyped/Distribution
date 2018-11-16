package typings
package hapiDashDecoratorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashDecoratorsMod {
  type IRouteConfig = js.Function1[/* path */ java.lang.String, IRouteSetup]
  type IRouteDecorator = js.Function2[/* method */ java.lang.String, /* path */ java.lang.String, IRouteSetup]
  type IRouteSetup = js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any]
}
