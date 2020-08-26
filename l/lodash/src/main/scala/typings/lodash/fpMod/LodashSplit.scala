package typings.lodash.fpMod

import typings.lodash.mod.__
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSplit extends LodashConvertible {
  def apply(separator: String): LodashSplit1x1 = js.native
  def apply(separator: String, string: String): js.Array[String] = js.native
  def apply(separator: __): LodashSplit1x2 = js.native
  def apply(separator: __, string: String): LodashSplit1x2 = js.native
  def apply(separator: RegExp): LodashSplit1x1 = js.native
  def apply(separator: RegExp, string: String): js.Array[String] = js.native
}

