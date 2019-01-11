package typings
package hapiDashDecoratorsLib.hapiDashDecoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hapi-decorators", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val all: hapiDashDecoratorsLib.hapiDashDecoratorsMod.IRouteConfig = js.native
  val get: hapiDashDecoratorsLib.hapiDashDecoratorsMod.IRouteConfig = js.native
  val patch: hapiDashDecoratorsLib.hapiDashDecoratorsMod.IRouteConfig = js.native
  val post: hapiDashDecoratorsLib.hapiDashDecoratorsMod.IRouteConfig = js.native
  val put: hapiDashDecoratorsLib.hapiDashDecoratorsMod.IRouteConfig = js.native
  val route: hapiDashDecoratorsLib.hapiDashDecoratorsMod.IRouteDecorator = js.native
  def cache(cacheConfig: hapiDashDecoratorsLib.hapiDashDecoratorsMod.ICacheConfig): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  def config(
    config: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify hapi.RouteAdditionalConfigurationOptions */ js.Any
  ): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  def controller(baseUrl: java.lang.String): js.Function1[
    /* target */ hapiDashDecoratorsLib.hapiDashDecoratorsMod.ControllerStatic, 
    scala.Unit
  ] = js.native
  def pre(pre: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  def validate(
    config: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify hapi.RouteValidationConfigurationObject */ js.Any
  ): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
}

