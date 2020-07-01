package typings.lodash.fpMod

import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashAssign extends LodashConvertible {
  def apply[TObject](`object`: TObject): LodashAssign1x1[TObject] = js.native
  def apply[TSource](`object`: __, source: TSource): LodashAssign1x2[TSource] = js.native
  def apply[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
}

