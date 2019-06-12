package typings
package atIonicUtilsDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atIonicUtilsDashFsLibStrings {
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait directory
    extends atIonicUtilsDashFsLib.atIonicUtilsDashFsMod.FileType
  
  @js.native
  sealed trait file
    extends atIonicUtilsDashFsLib.atIonicUtilsDashFsMod.FileType
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
}

