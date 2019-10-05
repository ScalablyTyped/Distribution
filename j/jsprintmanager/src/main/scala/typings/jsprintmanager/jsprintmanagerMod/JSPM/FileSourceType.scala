package typings.jsprintmanager.jsprintmanagerMod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSourceType extends js.Object

@JSImport("jsprintmanager", "JSPM.FileSourceType")
@js.native
object FileSourceType extends js.Object {
  @js.native
  sealed trait BLOB extends FileSourceType
  
  @js.native
  sealed trait Base64 extends FileSourceType
  
  @js.native
  sealed trait Text extends FileSourceType
  
  @js.native
  sealed trait URL extends FileSourceType
  
  /* 2 */ val BLOB: typings.jsprintmanager.jsprintmanagerMod.JSPM.FileSourceType.BLOB with Double = js.native
  /* 0 */ val Base64: typings.jsprintmanager.jsprintmanagerMod.JSPM.FileSourceType.Base64 with Double = js.native
  /* 1 */ val Text: typings.jsprintmanager.jsprintmanagerMod.JSPM.FileSourceType.Text with Double = js.native
  /* 3 */ val URL: typings.jsprintmanager.jsprintmanagerMod.JSPM.FileSourceType.URL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSourceType with Double] = js.native
}

