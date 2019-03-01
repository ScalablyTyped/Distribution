package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingConfig extends js.Object {
  var rootPath: java.lang.String
}

object RoutingConfig {
  @scala.inline
  def apply(rootPath: java.lang.String): RoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rootPath")(rootPath)
    __obj.asInstanceOf[RoutingConfig]
  }
}

