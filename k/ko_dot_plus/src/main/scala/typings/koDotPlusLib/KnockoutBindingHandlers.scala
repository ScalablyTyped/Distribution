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

