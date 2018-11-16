package typings
package lazyDotJsLib.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceBase[T] extends SequenceBaser[T] {
  def first(): js.Any = js.native
  def first(count: scala.Double): Sequence[T] = js.native
  def indexOf(value: js.Any): scala.Double = js.native
  def indexOf(value: js.Any, startIndex: scala.Double): scala.Double = js.native
  def last(): js.Any = js.native
  def last(count: scala.Double): Sequence[T] = js.native
  def lastIndexOf(value: js.Any): scala.Double = js.native
  def reverse(): Sequence[T] = js.native
}

