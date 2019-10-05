package typings.lazyDotJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sequence[T] extends SequenceBase[T] {
  def each(eachFn: ValueCallback[T]): Sequence[T] = js.native
}

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
@JSGlobal("LazyJS.Sequence")
@js.native
object Sequence extends js.Object {
  def define(methodName: js.Array[String], overrides: js.Any): js.Function = js.native
}

