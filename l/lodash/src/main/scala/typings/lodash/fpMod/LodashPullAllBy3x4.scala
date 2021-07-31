package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAllBy3x4[T1] extends StObject {
  
  def apply[T2](iteratee: ValueIteratee[T1 | T2]): LodashPullAllBy3x5[T1, T2] = js.native
  def apply[T2](iteratee: ValueIteratee[T1 | T2], values: List[T2]): js.Array[T1] = js.native
  def apply[T2](iteratee: __, values: List[T2]): LodashPullAllBy3x6[T1, T2] = js.native
}
