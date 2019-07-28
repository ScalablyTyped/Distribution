package typings.jqueryDotDynatree.JQueryUINs

import typings.jqueryDotDynatree.DynatreeNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UI extends js.Object {
  var dynatree: DynatreeNamespace
}

object UI {
  @scala.inline
  def apply(dynatree: DynatreeNamespace): UI = {
    val __obj = js.Dynamic.literal(dynatree = dynatree)
  
    __obj.asInstanceOf[UI]
  }
}

