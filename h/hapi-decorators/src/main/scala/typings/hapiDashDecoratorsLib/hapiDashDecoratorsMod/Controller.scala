package typings
package hapiDashDecoratorsLib.hapiDashDecoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controller extends js.Object {
  var baseUrl: java.lang.String
  def routes(): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
  ]
}

object Controller {
  @scala.inline
  def apply(
    baseUrl: java.lang.String,
    routes: js.Function0[
      js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
      ]
    ]
  ): Controller = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[Controller]
  }
}

