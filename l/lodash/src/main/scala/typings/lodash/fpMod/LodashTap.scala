package typings.lodash.fpMod

import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTap extends LodashConvertible {
  def apply[T](interceptor: js.Function1[/* value */ T, Unit]): LodashTap1x1[T] = js.native
  def apply[T](interceptor: js.Function1[/* value */ T, Unit], value: T): T = js.native
  def apply[T](interceptor: __, value: T): LodashTap1x2[T] = js.native
}

