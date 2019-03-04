package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calls extends js.Object {
  /** By chaining the spy with calls.all(), will return the context (the this) and arguments passed all calls */
  def all(): js.Array[CallInfo]
  /** By chaining the spy with calls.allArgs(), will return the arguments to all calls */
  def allArgs(): js.Array[_]
  /** By chaining the spy with calls.any(), will return false if the spy has not been called at all, and then true once at least one call happens. */
  def any(): scala.Boolean
  /** By chaining the spy with calls.argsFor(), will return the arguments passed to call number index */
  def argsFor(index: scala.Double): js.Array[_]
  /** By chaining the spy with calls.count(), will return the number of times the spy was called */
  def count(): scala.Double
  /** By chaining the spy with calls.first(), will return the context (the this) and arguments for the first call */
  def first(): CallInfo
  /** By chaining the spy with calls.mostRecent(), will return the context (the this) and arguments for the most recent call */
  def mostRecent(): CallInfo
  /** By chaining the spy with calls.reset(), will clears all tracking for a spy */
  def reset(): scala.Unit
}

object Calls {
  @scala.inline
  def apply(
    all: js.Function0[js.Array[CallInfo]],
    allArgs: js.Function0[js.Array[_]],
    any: js.Function0[scala.Boolean],
    argsFor: js.Function1[scala.Double, js.Array[_]],
    count: js.Function0[scala.Double],
    first: js.Function0[CallInfo],
    mostRecent: js.Function0[CallInfo],
    reset: js.Function0[scala.Unit]
  ): Calls = {
    val __obj = js.Dynamic.literal(all = all, allArgs = allArgs, any = any, argsFor = argsFor, count = count, first = first, mostRecent = mostRecent, reset = reset)
  
    __obj.asInstanceOf[Calls]
  }
}

