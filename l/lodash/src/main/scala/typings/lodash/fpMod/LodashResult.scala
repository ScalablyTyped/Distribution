package typings.lodash.fpMod

import typings.lodash.mod.PropertyPath
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashResult extends LodashConvertible {
  def apply(path: PropertyPath): LodashResult1x1 = js.native
  def apply(path: __, `object`: js.Any): LodashResult1x2 = js.native
  def apply[TResult](path: PropertyPath, `object`: js.Any): TResult = js.native
}

