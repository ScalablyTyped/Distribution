package typings
package atIonicUtilsDashFsLib.atIonicUtilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileType extends js.Object

@JSImport("@ionic/utils-fs", "FileType")
@js.native
object FileType extends js.Object {
  @js.native
  sealed trait DIRECTORY
    extends atIonicUtilsDashFsLib.atIonicUtilsDashFsMod.FileType
  
  @js.native
  sealed trait FILE
    extends atIonicUtilsDashFsLib.atIonicUtilsDashFsMod.FileType
  
  /* "directory" */ val DIRECTORY: DIRECTORY with java.lang.String = js.native
  /* "file" */ val FILE: FILE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atIonicUtilsDashFsLib.atIonicUtilsDashFsMod.FileType with java.lang.String] = js.native
}

