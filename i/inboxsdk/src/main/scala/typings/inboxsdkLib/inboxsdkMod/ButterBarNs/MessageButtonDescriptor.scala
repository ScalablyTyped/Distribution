package typings
package inboxsdkLib.inboxsdkMod.ButterBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageButtonDescriptor extends js.Object {
  var title: java.lang.String
  def onClick(event: js.Any): scala.Unit
}

object MessageButtonDescriptor {
  @scala.inline
  def apply(onClick: js.Any => scala.Unit, title: java.lang.String): MessageButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title)
  
    __obj.asInstanceOf[MessageButtonDescriptor]
  }
}

