package typings.lodash.fpMod

import typings.lodash.mod.PropertyPath
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashSet extends LodashConvertible {
  def apply(path: PropertyPath): LodashSet1x1 = js.native
  def apply(path: PropertyPath, value: js.Any): LodashSet1x3 = js.native
  def apply(path: PropertyPath, value: __, `object`: js.Object): LodashSet2x5 = js.native
  def apply(path: __, value: js.Any): LodashSet1x2 = js.native
  def apply(path: __, value: js.Any, `object`: js.Object): LodashSet2x6 = js.native
  def apply(path: __, value: __, `object`: js.Object): LodashSet2x4 = js.native
  def apply[T /* <: js.Object */](path: PropertyPath, value: js.Any, `object`: T): T = js.native
  def apply[TResult](path: PropertyPath, value: js.Any, `object`: js.Object): TResult = js.native
  def apply[T /* <: js.Object */](path: PropertyPath, value: __, `object`: T): LodashSet1x5[T] = js.native
  def apply[T /* <: js.Object */](path: __, value: js.Any, `object`: T): LodashSet1x6[T] = js.native
  def apply[T /* <: js.Object */](path: __, value: __, `object`: T): LodashSet1x4[T] = js.native
}

