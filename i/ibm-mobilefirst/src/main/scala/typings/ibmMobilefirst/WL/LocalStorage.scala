package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.LocalStorage")
@js.native
object LocalStorage extends js.Object {
  def clear(key: String): Unit = js.native
  def clearAll(): Unit = js.native
  def getValue(key: String): String = js.native
  def setValue(key: String, value: String): Unit = js.native
}

