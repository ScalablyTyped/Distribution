package typings.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncSequence[T] extends SequenceBase[T] {
  def each(callback: ValueCallback[T]): AsyncHandle[T] = js.native
}

