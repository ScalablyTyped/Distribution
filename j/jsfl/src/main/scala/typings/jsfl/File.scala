package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_File")
@js.native
class File protected () extends js.Object {
  def this(path: String) = this()
  var contents: String = js.native
  def copy(path: String): File = js.native
  def write(data: String): File = js.native
}

