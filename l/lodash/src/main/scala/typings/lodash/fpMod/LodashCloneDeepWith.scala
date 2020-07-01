package typings.lodash.fpMod

import typings.lodash.mod.CloneDeepWithCustomizer
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCloneDeepWith extends LodashConvertible {
  def apply[T](customizer: CloneDeepWithCustomizer[T]): LodashCloneDeepWith1x1[T] = js.native
  def apply[T](customizer: CloneDeepWithCustomizer[T], value: T): js.Any = js.native
  def apply[T](customizer: __, value: T): LodashCloneDeepWith1x2[T] = js.native
}

