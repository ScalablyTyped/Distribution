package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTap extends js.Object {
  def apply[T](interceptor: js.Function1[/* value */ T, scala.Unit]): LodashTap1x1[T] = js.native
  def apply[T](interceptor: js.Function1[/* value */ T, scala.Unit], value: T): T = js.native
  def apply[T](interceptor: lodashLib.lodashMod.underscoreNs.`__`, value: T): LodashTap1x2[T] = js.native
}

