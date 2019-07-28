package typings.atIonicUtilsDashFs

import typings.atIonicUtilsDashFs.atIonicUtilsDashFsMod.FileType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atIonicUtilsDashFsStrings {
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait directory extends FileType
  
  @js.native
  sealed trait file extends FileType
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
}

