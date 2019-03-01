package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plan extends js.Object {
  var parentContext: Context
  var rootRequest: Request
}

object Plan {
  @scala.inline
  def apply(parentContext: Context, rootRequest: Request): Plan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parentContext")(parentContext)
    __obj.updateDynamic("rootRequest")(rootRequest)
    __obj.asInstanceOf[Plan]
  }
}

