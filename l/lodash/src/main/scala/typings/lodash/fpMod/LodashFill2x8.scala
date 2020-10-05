package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFill2x8[U] extends js.Object {
  def apply(start: Double): LodashFill2x9[U] = js.native
  def apply(start: Double, end: Double): LodashFill2x11[U] = js.native
  def apply(start: __, end: Double): LodashFill2x10[U] = js.native
  def apply[T](start: Double, end: Double, value: T): List[T | U] = js.native
  def apply[T](start: Double, end: __, value: T): LodashFill2x13[T, U] = js.native
  def apply[T](start: __, end: Double, value: T): LodashFill2x14[T, U] = js.native
  def apply[T](start: __, end: __, value: T): LodashFill2x12[T, U] = js.native
}

