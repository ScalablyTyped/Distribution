package typings.inversifyExpressUtils.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingConfig extends js.Object {
  var rootPath: String
}

object RoutingConfig {
  @scala.inline
  def apply(rootPath: String): RoutingConfig = {
    val __obj = js.Dynamic.literal(rootPath = rootPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoutingConfig]
  }
}

