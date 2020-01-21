package typings.hardSourceWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hardSourceWebpackPlugin extends js.Object {
  @JSName("apply")
  def apply(args: js.Any*): Unit
}

object hardSourceWebpackPlugin {
  @scala.inline
  def apply(apply: /* repeated */ js.Any => Unit): hardSourceWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[hardSourceWebpackPlugin]
  }
}

