package typings
package jsonDashFileDashPlusLib.jsonDashFileDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-file-plus", "JSONData")
@js.native
class JSONData protected () extends js.Object {
  def this(raw: java.lang.String) = this()
  var data: js.Any = js.native
  var format: Format = js.native
  def get(key: java.lang.String): js.Promise[_] = js.native
  def remove(key: java.lang.String): js.Promise[scala.Unit] = js.native
  def set(data: js.Any): scala.Unit = js.native
}

