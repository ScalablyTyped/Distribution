package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCloneWith extends js.Object {
  def apply[T](customizer: lodashLib.lodashMod.__, value: T): LodashCloneWith1x2[T] = js.native
  def apply[T, TResult /* <: js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null */](customizer: lodashLib.lodashMod.CloneWithCustomizer[T, TResult]): LodashCloneWith1x1[T, TResult] = js.native
  def apply[T, TResult](customizer: lodashLib.lodashMod.CloneWithCustomizer[T, js.UndefOr[TResult]], value: T): TResult | T = js.native
}

