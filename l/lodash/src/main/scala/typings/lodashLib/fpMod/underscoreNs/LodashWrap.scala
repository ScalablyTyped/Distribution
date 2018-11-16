package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashWrap extends js.Object {
  def apply[T](wrapper: lodashLib.lodashMod.underscoreNs.`__`, value: T): LodashWrap1x2[T] = js.native
  def apply[T, TResult](wrapper: js.Function2[/* value */ T, /* repeated */js.Any, TResult]): LodashWrap2x1[T, TResult] = js.native
  def apply[T, TResult](wrapper: js.Function2[/* value */ T, /* repeated */js.Any, TResult], value: T): js.Function1[/* repeated */js.Any, TResult] = js.native
}

