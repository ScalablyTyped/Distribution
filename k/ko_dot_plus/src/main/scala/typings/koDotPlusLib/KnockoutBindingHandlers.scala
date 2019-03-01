package typings
package koDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//
// declare new binding handlers in ko.plus
//
trait KnockoutBindingHandlers extends js.Object {
  var command: knockoutLib.KnockoutBindingHandler[_, _, _]
  var loadingWhen: knockoutLib.KnockoutBindingHandler[_, _, _]
  var sortBy: knockoutLib.KnockoutBindingHandler[_, _, _]
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    command: knockoutLib.KnockoutBindingHandler[_, _, _],
    loadingWhen: knockoutLib.KnockoutBindingHandler[_, _, _],
    sortBy: knockoutLib.KnockoutBindingHandler[_, _, _]
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("loadingWhen")(loadingWhen)
    __obj.updateDynamic("sortBy")(sortBy)
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

