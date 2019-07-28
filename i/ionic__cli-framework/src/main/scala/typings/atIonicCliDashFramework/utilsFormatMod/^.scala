package typings.atIonicCliDashFramework.utilsFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/utils/format", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TTY_WIDTH: Double = js.native
  def columnar(rows: js.Array[js.Array[String]], hasHsepVsepHeaders: ColumnarOptions): String = js.native
  def expandPath(p: String): String = js.native
  def generateFillSpaceStringList(list: js.Array[String]): js.Array[String] = js.native
  def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double): js.Array[String] = js.native
  def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double, fillCharacter: String): js.Array[String] = js.native
  def indent(): String = js.native
  def indent(n: Double): String = js.native
  def prettyPath(p: String): String = js.native
  def stripAnsi(string: String): String = js.native
  def wordWrap(msg: String, hasWidthIndentationAppend: WordWrapOptions): String = js.native
}

