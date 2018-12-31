package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  def Add(hook: js.Any, priority: scala.Double): CallbackObject
  def Execute(): CallbackObject
  def Remove(hook: CallbackObject): scala.Unit
}

