package typings
package knockoutDotDeferredDotUpdatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Knockout global
@js.native
trait KnockoutStatic extends js.Object {
  def evaluateAsynchronously(evaluator: js.Function): scala.Double = js.native
  def evaluateAsynchronously(evaluator: js.Function, timeout: js.Any): scala.Double = js.native
  def ignoreDependencies(callback: js.Function, callbackTarget: js.Any): js.Any = js.native
  def ignoreDependencies(callback: js.Function, callbackTarget: js.Any, callbackArgs: js.Array[_]): js.Any = js.native
  def processAllDeferredBindingUpdates(): scala.Unit = js.native
  def processAllDeferredUpdates(): scala.Unit = js.native
}

