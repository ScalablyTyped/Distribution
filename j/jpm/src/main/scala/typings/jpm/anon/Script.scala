package typings.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Script extends js.Object {
  var script: Boolean
}

object Script {
  @scala.inline
  def apply(script: Boolean): Script = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
}

