package typings.inversify.dtsInterfacesInterfacesMod.interfacesNs

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
    val __obj = js.Dynamic.literal(parentContext = parentContext, rootRequest = rootRequest)
  
    __obj.asInstanceOf[Plan]
  }
}

