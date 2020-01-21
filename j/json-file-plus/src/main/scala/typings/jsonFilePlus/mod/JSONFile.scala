package typings.jsonFilePlus.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-file-plus", "JSONFile")
@js.native
class JSONFile protected () extends JSONData {
  def this(filename: String, raw: String) = this()
  var filename: String = js.native
  def save(): js.Promise[Unit] = js.native
  def save(cb: js.Function1[/* err */ Error, Unit]): js.Promise[Unit] = js.native
  def saveSync(): Unit = js.native
}

