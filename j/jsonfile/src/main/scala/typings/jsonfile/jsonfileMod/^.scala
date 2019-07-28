package typings.jsonfile.jsonfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonfile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def readFile(file: Path): js.Promise[_] = js.native
  def readFile(file: Path, callback: ReadCallback): Unit = js.native
  def readFile(file: Path, options: JFReadOptions): js.Promise[_] = js.native
  def readFile(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = js.native
  def readFileSync(file: Path): js.Any = js.native
  def readFileSync(file: Path, options: JFReadOptions): js.Any = js.native
  def writeFile(file: Path, obj: js.Any): js.Promise[Unit] = js.native
  def writeFile(file: Path, obj: js.Any, callback: WriteCallback): Unit = js.native
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions): js.Promise[Unit] = js.native
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions, callback: WriteCallback): Unit = js.native
  def writeFileSync(file: Path, obj: js.Any): Unit = js.native
  def writeFileSync(file: Path, obj: js.Any, options: JFWriteOptions): Unit = js.native
}

