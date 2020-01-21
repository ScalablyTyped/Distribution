package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBind extends js.Object {
  var bind: js.Object
  var files: AnonRelativeTo
}

object AnonBind {
  @scala.inline
  def apply(bind: js.Object, files: AnonRelativeTo): AnonBind = {
    val __obj = js.Dynamic.literal(bind = bind.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBind]
  }
}

