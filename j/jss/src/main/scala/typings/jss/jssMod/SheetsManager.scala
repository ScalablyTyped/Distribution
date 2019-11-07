package typings.jss.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jss", "SheetsManager")
@js.native
class SheetsManager () extends js.Object {
  val size: Double = js.native
  def add(key: js.Object, sheet: StyleSheet[String]): Unit = js.native
  def get(key: js.Object): StyleSheet[String] | Null = js.native
  def manage(key: js.Object): StyleSheet[String] | Null = js.native
  def unmanage(key: js.Object): Unit = js.native
}

