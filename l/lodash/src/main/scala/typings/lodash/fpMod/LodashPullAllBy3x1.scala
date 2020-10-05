package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAllBy3x1[T1, T2] extends js.Object {
  def apply(values: List[T2]): LodashPullAllBy3x3[T1] = js.native
  def apply(values: List[T2], array: js.Array[T1]): js.Array[T1] = js.native
  def apply(values: List[T2], array: List[T1]): List[T1] = js.native
  def apply(values: __, array: js.Array[T1]): LodashPullAllBy3x5[T1, T2] = js.native
  def apply(values: __, array: List[T1]): LodashPullAllBy4x5[T1, T2] = js.native
}

