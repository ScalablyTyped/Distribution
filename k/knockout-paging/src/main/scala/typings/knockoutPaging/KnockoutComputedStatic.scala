package typings.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputedStatic extends js.Object {
  var fn: KnockoutComputedFunctions[_] = js.native
  def apply[T](): KnockoutComputed[T] = js.native
  def apply[T](`def`: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def apply[T](`def`: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  def apply[T](func: js.Function0[T]): KnockoutComputed[T] = js.native
  def apply[T](func: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def apply[T](func: js.Function0[T], context: js.Any, options: js.Any): KnockoutComputed[T] = js.native
}

