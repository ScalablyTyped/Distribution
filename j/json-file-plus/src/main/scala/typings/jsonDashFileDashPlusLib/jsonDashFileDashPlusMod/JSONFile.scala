package typings
package jsonDashFileDashPlusLib.jsonDashFileDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-file-plus", "JSONFile")
@js.native
class JSONFile protected () extends JSONData {
  def this(filename: java.lang.String, raw: java.lang.String) = this()
  var filename: java.lang.String = js.native
  def save(): js.Promise[scala.Unit] = js.native
  def save(cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): js.Promise[scala.Unit] = js.native
  def saveSync(): scala.Unit = js.native
}

