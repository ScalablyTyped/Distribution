package typings.iscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn extends js.Object {
  var style: String
  def fn(k: js.Any): js.Any
}

object AnonFn {
  @scala.inline
  def apply(fn: js.Any => js.Any, style: String): AnonFn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFn]
  }
}

