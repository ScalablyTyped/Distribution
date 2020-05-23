package typings.jqueryGridster

import typings.jqueryGridster.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterUi extends js.Object {
  var position: Left
}

object GridsterUi {
  @scala.inline
  def apply(position: Left): GridsterUi = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterUi]
  }
}

