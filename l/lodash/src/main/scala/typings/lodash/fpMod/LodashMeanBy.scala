package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashMeanBy extends StObject {
  
  def apply[T](iteratee: ValueIteratee[T]): Double = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): Double = js.native
  def apply[T](iteratee: __): LodashMeanBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMeanBy1x2[T] = js.native
}
