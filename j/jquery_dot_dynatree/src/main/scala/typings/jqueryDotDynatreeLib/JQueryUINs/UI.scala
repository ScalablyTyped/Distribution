package typings
package jqueryDotDynatreeLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UI extends js.Object {
  var dynatree: jqueryDotDynatreeLib.DynatreeNamespace
}

object UI {
  @scala.inline
  def apply(dynatree: jqueryDotDynatreeLib.DynatreeNamespace): UI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dynatree")(dynatree)
    __obj.asInstanceOf[UI]
  }
}

