package typings
package koDotPlusLib.KoPlusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  // [required] sets the command action method
  var action: js.Function
  // [optional] function to determine if command can be executed
  var canExecute: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  // [optional] context to use in the command
  var context: js.UndefOr[js.Any] = js.undefined
}

