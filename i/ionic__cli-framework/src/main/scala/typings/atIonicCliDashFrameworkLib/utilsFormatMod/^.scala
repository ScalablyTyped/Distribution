package typings
package atIonicCliDashFrameworkLib.utilsFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/utils/format", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TTY_WIDTH: scala.Double = js.native
  def columnar(rows: js.Array[js.Array[java.lang.String]], hasHsepVsepHeaders: ColumnarOptions): java.lang.String = js.native
  def expandPath(p: java.lang.String): java.lang.String = js.native
  def generateFillSpaceStringList(list: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def generateFillSpaceStringList(list: js.Array[java.lang.String], optimalLength: scala.Double): js.Array[java.lang.String] = js.native
  def generateFillSpaceStringList(list: js.Array[java.lang.String], optimalLength: scala.Double, fillCharacter: java.lang.String): js.Array[java.lang.String] = js.native
  def indent(): java.lang.String = js.native
  def indent(n: scala.Double): java.lang.String = js.native
  def prettyPath(p: java.lang.String): java.lang.String = js.native
  def wordWrap(msg: java.lang.String, hasWidthIndentationAppend: WordWrapOptions): java.lang.String = js.native
}

