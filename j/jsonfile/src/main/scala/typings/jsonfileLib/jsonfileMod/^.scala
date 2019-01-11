package typings
package jsonfileLib.jsonfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonfile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def readFile(file: jsonfileLib.jsonfileMod.Path): js.Promise[_] = js.native
  def readFile(file: jsonfileLib.jsonfileMod.Path, callback: jsonfileLib.jsonfileMod.ReadCallback): scala.Unit = js.native
  def readFile(file: jsonfileLib.jsonfileMod.Path, options: jsonfileLib.jsonfileMod.JFReadOptions): js.Promise[_] = js.native
  def readFile(
    file: jsonfileLib.jsonfileMod.Path,
    options: jsonfileLib.jsonfileMod.JFReadOptions,
    callback: jsonfileLib.jsonfileMod.ReadCallback
  ): scala.Unit = js.native
  def readFileSync(file: jsonfileLib.jsonfileMod.Path): js.Any = js.native
  def readFileSync(file: jsonfileLib.jsonfileMod.Path, options: jsonfileLib.jsonfileMod.JFReadOptions): js.Any = js.native
  def writeFile(file: jsonfileLib.jsonfileMod.Path, obj: js.Any): js.Promise[scala.Unit] = js.native
  def writeFile(file: jsonfileLib.jsonfileMod.Path, obj: js.Any, callback: jsonfileLib.jsonfileMod.WriteCallback): scala.Unit = js.native
  def writeFile(file: jsonfileLib.jsonfileMod.Path, obj: js.Any, options: jsonfileLib.jsonfileMod.JFWriteOptions): js.Promise[scala.Unit] = js.native
  def writeFile(
    file: jsonfileLib.jsonfileMod.Path,
    obj: js.Any,
    options: jsonfileLib.jsonfileMod.JFWriteOptions,
    callback: jsonfileLib.jsonfileMod.WriteCallback
  ): scala.Unit = js.native
  def writeFileSync(file: jsonfileLib.jsonfileMod.Path, obj: js.Any): scala.Unit = js.native
  def writeFileSync(file: jsonfileLib.jsonfileMod.Path, obj: js.Any, options: jsonfileLib.jsonfileMod.JFWriteOptions): scala.Unit = js.native
}

