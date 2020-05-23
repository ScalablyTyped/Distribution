package typings.jsfl.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_File")
@js.native
class File protected ()
  extends typings.jsfl.File {
  def this(path: String) = this()
  /* CompleteClass */
  override var contents: String = js.native
  /* CompleteClass */
  override def copy(path: String): typings.jsfl.File = js.native
  /* CompleteClass */
  override def write(data: String): typings.jsfl.File = js.native
}

