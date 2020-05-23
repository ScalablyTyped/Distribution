package typings.jsreportCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Silent extends js.Object {
  var silent: Boolean
}

object Silent {
  @scala.inline
  def apply(silent: Boolean): Silent = {
    val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Silent]
  }
}

