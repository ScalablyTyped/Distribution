package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileWriter extends js.Object {
  def copyFile(source: String, dest: String): Unit = js.native
  def writeFile(): ContentWriter = js.native
  def writeFile(file: String): ContentWriter = js.native
  def writeForDir(subdir: String): FileWriter = js.native
}

