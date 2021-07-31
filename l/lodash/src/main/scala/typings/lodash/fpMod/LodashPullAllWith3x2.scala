package typings.lodash.fpMod

import typings.lodash.mod.Comparator2
import typings.lodash.mod.List
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAllWith3x2[T2] extends StObject {
  
  def apply[T1](comparator: Comparator2[T1, T2]): LodashPullAllWith3x3[T1] = js.native
  def apply[T1](comparator: Comparator2[T1, T2], array: js.Array[T1]): js.Array[T1] = js.native
  def apply[T1](comparator: Comparator2[T1, T2], array: List[T1]): List[T1] = js.native
  def apply[T1](comparator: __, array: js.Array[T1]): LodashPullAllWith3x6[T1, T2] = js.native
  def apply[T1](comparator: __, array: List[T1]): LodashPullAllWith4x6[T1, T2] = js.native
}
