package typings
package koaDashRouterLib.koaDashRouterMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterParamContext[StateT, CustomT] extends js.Object {
  /**
    * url params
    */
  var params: js.Any
  /**
    * the router instance
    */
  var router: koaDashRouterLib.koaDashRouterMod.Router[StateT, CustomT]
}

