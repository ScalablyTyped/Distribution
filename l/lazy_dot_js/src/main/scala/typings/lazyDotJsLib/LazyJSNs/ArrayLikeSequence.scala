package typings
package lazyDotJsLib.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLikeSequence[T] extends Sequence[T] {
  @JSName("first")
  def first_T(): T = js.native
  def get(index: scala.Double): T = js.native
  def length(): scala.Double = js.native
  def pop(): ArrayLikeSequence[T] = js.native
  def push(value: T): ArrayLikeSequence[T] = js.native
  def shift(): ArrayLikeSequence[T] = js.native
  def slice(begin: scala.Double): ArrayLikeSequence[T] = js.native
  def slice(begin: scala.Double, end: scala.Double): ArrayLikeSequence[T] = js.native
  def unshift(value: T): ArrayLikeSequence[T] = js.native
}

