package typings.koPlus

import typings.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//
// declare new binding handlers in ko.plus
//
trait KnockoutBindingHandlers extends js.Object {
  var command: KnockoutBindingHandler[_, _, _]
  var loadingWhen: KnockoutBindingHandler[_, _, _]
  var sortBy: KnockoutBindingHandler[_, _, _]
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    command: KnockoutBindingHandler[_, _, _],
    loadingWhen: KnockoutBindingHandler[_, _, _],
    sortBy: KnockoutBindingHandler[_, _, _]
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], loadingWhen = loadingWhen.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

