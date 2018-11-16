package typings
package grayDashMatterLib.grayDashMatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrayMatter extends js.Object {
  def apply(str: java.lang.String): js.Any = js.native
  def apply(str: java.lang.String, options: GrayMatterOption): js.Any = js.native
  def apply(str: java.lang.String, options: GrayMatterOption, delims: js.Array[java.lang.String]): js.Any = js.native
  def apply(
    str: java.lang.String,
    options: GrayMatterOption,
    delims: js.Array[java.lang.String],
    parser: js.Function
  ): js.Any = js.native
  def read(fp: java.lang.String): js.Any = js.native
  def read(fp: java.lang.String, options: GrayMatterOption): js.Any = js.native
  def stringify(str: java.lang.String, data: js.Object): java.lang.String = js.native
  def stringify(str: java.lang.String, data: js.Object, options: GrayMatterOption): java.lang.String = js.native
}

