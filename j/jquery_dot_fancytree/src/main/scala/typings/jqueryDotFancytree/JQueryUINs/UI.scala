package typings.jqueryDotFancytree.JQueryUINs

import typings.jqueryDotFancytree.FancytreeNs.FancytreeStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UI extends js.Object {
  var fancytree: FancytreeStatic
}

object UI {
  @scala.inline
  def apply(fancytree: FancytreeStatic): UI = {
    val __obj = js.Dynamic.literal(fancytree = fancytree)
  
    __obj.asInstanceOf[UI]
  }
}

