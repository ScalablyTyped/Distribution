package typings.jsprintmanager.jsprintmanagerMod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientPrinter extends js.Object {
  var Id: js.Any
  def serialize(): js.Any
}

object IClientPrinter {
  @scala.inline
  def apply(Id: js.Any, serialize: () => js.Any): IClientPrinter = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize))
  
    __obj.asInstanceOf[IClientPrinter]
  }
}

