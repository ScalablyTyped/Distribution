package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAll extends js.Object {
  
  def apply[T](values: List[T]): LodashPullAll1x1[T] = js.native
  def apply[T](values: List[T], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](values: List[T], array: List[T]): List[T] = js.native
  def apply[T](values: __, array: js.Array[T]): LodashPullAll1x2[T] = js.native
  def apply[T](values: __, array: List[T]): LodashPullAll2x2[T] = js.native
}
