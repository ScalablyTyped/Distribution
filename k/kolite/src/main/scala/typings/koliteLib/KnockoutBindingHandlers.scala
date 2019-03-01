package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandlers extends js.Object {
  var activity: KoLiteActivityBindingHandler
  var command: knockoutLib.KnockoutBindingHandler[_, _, _]
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(activity: KoLiteActivityBindingHandler, command: knockoutLib.KnockoutBindingHandler[_, _, _]): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activity")(activity)
    __obj.updateDynamic("command")(command)
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

