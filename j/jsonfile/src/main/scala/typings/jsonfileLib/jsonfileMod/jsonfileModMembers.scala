package typings
package jsonfileLib.jsonfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonfile", JSImport.Namespace)
@js.native
object jsonfileModMembers extends js.Object {
  def readFile(file: Path): scala.Unit = js.native
  def readFile(file: Path, callback: JFReadCallback): scala.Unit = js.native
  def readFile(file: Path, options: JFReadOptions): scala.Unit = js.native
  def readFile(file: Path, options: JFReadOptions, callback: JFReadCallback): scala.Unit = js.native
  def readFileSync(file: Path): js.Any = js.native
  def readFileSync(file: Path, options: JFReadOptions): js.Any = js.native
  def writeFile(file: Path, obj: js.Any): scala.Unit = js.native
  def writeFile(file: Path, obj: js.Any, callback: WriteCallback): scala.Unit = js.native
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions): scala.Unit = js.native
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions, callback: WriteCallback): scala.Unit = js.native
  def writeFileSync(file: Path, obj: js.Any): scala.Unit = js.native
  def writeFileSync(file: Path, obj: js.Any, options: JFWriteOptions): scala.Unit = js.native
}

