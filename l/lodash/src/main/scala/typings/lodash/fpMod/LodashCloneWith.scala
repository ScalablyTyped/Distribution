package typings.lodash.fpMod

import typings.lodash.mod.CloneWithCustomizer
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCloneWith extends js.Object {
  def apply[T](customizer: __, value: T): LodashCloneWith1x2[T] = js.native
  def apply[T, TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult]): LodashCloneWith1x1[T, TResult] = js.native
  def apply[T, TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult], value: T): TResult = js.native
}

