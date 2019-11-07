package typings.jss.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jss", "SheetsRegistry")
@js.native
class SheetsRegistry () extends js.Object {
  val index: Double = js.native
  def add(sheet: StyleSheet[_]): Unit = js.native
  def remove(sheet: StyleSheet[_]): Unit = js.native
  def reset(): Unit = js.native
  def toString(options: ToCssOptions): String = js.native
}

