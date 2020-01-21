package typings.hapiDecorators.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controller_ extends js.Object {
  var baseUrl: String
  def routes(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
  ]
}

object Controller_ {
  @scala.inline
  def apply(
    baseUrl: String,
    routes: () => js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
    ]
  ): Controller_ = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], routes = js.Any.fromFunction0(routes))
  
    __obj.asInstanceOf[Controller_]
  }
}

