package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileWriter extends js.Object {
  def copyFile(source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def writeFile(): ContentWriter = js.native
  def writeFile(file: java.lang.String): ContentWriter = js.native
  def writeForDir(subdir: java.lang.String): FileWriter = js.native
}

