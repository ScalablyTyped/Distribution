package typings.lodash.fpMod

import typings.lodash.lodashMod.PropertyPath
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUpdateWith1x1[T] extends js.Object {
  def apply(path: PropertyPath): LodashUpdateWith1x3[T] = js.native
  def apply(path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x7[T] = js.native
  def apply(path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _], `object`: T): T = js.native
  def apply(path: PropertyPath, updater: __, `object`: T): LodashUpdateWith1x11[T] = js.native
  def apply(path: __, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x5[T] = js.native
  def apply(path: __, updater: js.Function1[/* oldValue */ js.Any, _], `object`: T): LodashUpdateWith1x13[T] = js.native
  def apply(path: __, updater: __, `object`: T): LodashUpdateWith1x9[T] = js.native
}

