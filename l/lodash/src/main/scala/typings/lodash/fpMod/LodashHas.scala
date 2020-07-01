package typings.lodash.fpMod

import typings.lodash.mod.PropertyPath
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashHas extends LodashConvertible {
  def apply(path: PropertyPath): LodashHas1x1 = js.native
  def apply[T](path: PropertyPath, `object`: T): Boolean = js.native
  def apply[T](path: __, `object`: T): LodashHas1x2 = js.native
}

