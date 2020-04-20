package typings.jestJasmine2.callTrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallTracker extends js.Object {
  def all(): js.Array[Context]
  def allArgs(): js.Array[_]
  def any(): Boolean
  def argsFor(index: Double): js.Array[_]
  def count(): Double
  def first(): Context
  def mostRecent(): Context
  def reset(): Unit
  def track(context: Context): Unit
}

object CallTracker {
  @scala.inline
  def apply(
    all: () => js.Array[Context],
    allArgs: () => js.Array[_],
    any: () => Boolean,
    argsFor: Double => js.Array[_],
    count: () => Double,
    first: () => Context,
    mostRecent: () => Context,
    reset: () => Unit,
    track: Context => Unit
  ): CallTracker = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allArgs = js.Any.fromFunction0(allArgs), any = js.Any.fromFunction0(any), argsFor = js.Any.fromFunction1(argsFor), count = js.Any.fromFunction0(count), first = js.Any.fromFunction0(first), mostRecent = js.Any.fromFunction0(mostRecent), reset = js.Any.fromFunction0(reset), track = js.Any.fromFunction1(track))
    __obj.asInstanceOf[CallTracker]
  }
}

