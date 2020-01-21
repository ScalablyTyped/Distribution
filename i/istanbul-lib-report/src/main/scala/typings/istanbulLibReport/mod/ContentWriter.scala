package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentWriter extends js.Object {
  def close(): Unit = js.native
  def colorize(str: String): String = js.native
  def colorize(str: String, cls: String): String = js.native
  def println(str: String): Unit = js.native
  def write(str: String): Unit = js.native
}

