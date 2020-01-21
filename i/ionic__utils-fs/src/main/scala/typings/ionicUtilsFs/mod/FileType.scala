package typings.ionicUtilsFs.mod

import typings.ionicUtilsFs.ionicUtilsFsStrings.directory
import typings.ionicUtilsFs.ionicUtilsFsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicUtilsFs.ionicUtilsFsStrings.file
  - typings.ionicUtilsFs.ionicUtilsFsStrings.directory
*/
trait FileType extends js.Object

object FileType {
  @scala.inline
  def DIRECTORY: directory = this.cast("directory")
  @scala.inline
  def FILE: file = this.cast("file")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

