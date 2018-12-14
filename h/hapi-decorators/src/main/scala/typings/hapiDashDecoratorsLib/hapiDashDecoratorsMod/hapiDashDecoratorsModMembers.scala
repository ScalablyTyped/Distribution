package typings
package hapiDashDecoratorsLib.hapiDashDecoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hapi-decorators", JSImport.Namespace)
@js.native
object hapiDashDecoratorsModMembers extends js.Object {
  val all: IRouteConfig = js.native
  val get: IRouteConfig = js.native
  val patch: IRouteConfig = js.native
  val post: IRouteConfig = js.native
  val put: IRouteConfig = js.native
  val route: IRouteDecorator = js.native
  def cache(cacheConfig: ICacheConfig): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  def config(config: js.Any): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  def controller(baseUrl: java.lang.String): js.Function1[/* target */ ControllerStatic, scala.Unit] = js.native
  def pre(pre: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  def validate(config: js.Any): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
}

