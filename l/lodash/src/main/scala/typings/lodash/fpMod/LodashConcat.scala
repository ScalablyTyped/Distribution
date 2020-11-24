package typings.lodash.fpMod

import typings.lodash.mod.Many
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashConcat extends js.Object {
  
  def apply[T](array: Many[T]): LodashConcat1x1[T] = js.native
  def apply[T](array: Many[T], values: Many[T]): js.Array[T] = js.native
  def apply[T](array: __, values: Many[T]): LodashConcat1x2[T] = js.native
}
