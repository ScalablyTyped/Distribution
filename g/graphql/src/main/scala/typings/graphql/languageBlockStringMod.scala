package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/blockString", JSImport.Namespace)
@js.native
object languageBlockStringMod extends js.Object {
  def dedentBlockStringValue(rawString: String): String = js.native
  def getBlockStringIndentation(lines: js.Array[String]): Double = js.native
  def printBlockString(value: String): String = js.native
  def printBlockString(value: String, indentation: String): String = js.native
  def printBlockString(value: String, indentation: String, preferMultipleLines: Boolean): String = js.native
}

