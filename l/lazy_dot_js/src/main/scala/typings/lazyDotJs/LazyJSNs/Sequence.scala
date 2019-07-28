package typings.lazyDotJs.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sequence[T] extends SequenceBase[T] {
  def each(eachFn: ValueCallback[T]): Sequence[T] = js.native
}

