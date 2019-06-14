package typings
package atIonicUtilsDashFsLib.atIonicUtilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - atIonicUtilsDashFsLib.atIonicUtilsDashFsLibStrings.file
  - atIonicUtilsDashFsLib.atIonicUtilsDashFsLibStrings.directory
*/
trait FileType extends js.Object

object FileType {
  @scala.inline
  def DIRECTORY: atIonicUtilsDashFsLib.atIonicUtilsDashFsLibStrings.directory = this.cast("directory")
  @scala.inline
  def FILE: atIonicUtilsDashFsLib.atIonicUtilsDashFsLibStrings.file = this.cast("file")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

