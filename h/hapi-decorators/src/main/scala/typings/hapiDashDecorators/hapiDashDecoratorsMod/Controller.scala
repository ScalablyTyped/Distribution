package typings.hapiDashDecorators.hapiDashDecoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controller extends js.Object {
  var baseUrl: String
  def routes(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
  ]
}

object Controller {
  @scala.inline
  def apply(
    baseUrl: String,
    routes: () => js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
    ]
  ): Controller = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], routes = js.Any.fromFunction0(routes))
  
    __obj.asInstanceOf[Controller]
  }
}

@JSImport("hapi-decorators", "controller")
@js.native
object controller extends js.Object {
  def apply(baseUrl: String): js.Function1[/* target */ ControllerStatic, Unit] = js.native
}

