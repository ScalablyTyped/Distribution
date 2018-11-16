package typings
package jsonfileLib.jsonfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FS extends js.Object {
  def readFile(path: Path, options: FSReadOptions, callback: ReadCallback): scala.Unit = js.native
  def readFileSync(path: Path): nodeLib.Buffer = js.native
  def readFileSync(path: Path, options: FSReadOptions): nodeLib.Buffer = js.native
  def writeFile(path: Path, data: js.Any, options: FSWriteOptions, callback: WriteCallback): scala.Unit = js.native
  def writeFileSync(path: Path, data: js.Any): scala.Unit = js.native
  def writeFileSync(path: Path, data: js.Any, options: FSWriteOptions): scala.Unit = js.native
}

