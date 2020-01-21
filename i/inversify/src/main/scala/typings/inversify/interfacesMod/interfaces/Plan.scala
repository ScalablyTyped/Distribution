package typings.inversify.interfacesMod.interfaces

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
    val __obj = js.Dynamic.literal(parentContext = parentContext.asInstanceOf[js.Any], rootRequest = rootRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Plan]
  }
}

