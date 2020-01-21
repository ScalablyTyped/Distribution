package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.ValueKeyIteratee
import typings.lodash.mod.ValueKeyIterateeTypeGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy1x2[T] extends js.Object {
  def apply(predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  def apply[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): Dictionary[S] = js.native
}

