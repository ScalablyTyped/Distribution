package typings.jestUtil.anon

import typings.jestUtil.deepCyclicCopyMod.DeepCyclicCopyOptions
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallValueOptionsCycles extends js.Object {
  def apply[T](value: T): T = js.native
  def apply[T](value: T, options: DeepCyclicCopyOptions): T = js.native
  def apply[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[_, _]): T = js.native
}

