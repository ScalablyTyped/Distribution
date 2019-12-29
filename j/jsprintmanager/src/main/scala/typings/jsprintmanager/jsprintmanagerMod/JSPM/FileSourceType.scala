package typings.jsprintmanager.jsprintmanagerMod.JSPM

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSourceType with Double] = js.native
  /* 2 */ @js.native
  object BLOB extends TopLevel[BLOB with Double]
  
  /* 0 */ @js.native
  object Base64 extends TopLevel[Base64 with Double]
  
  /* 1 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  /* 3 */ @js.native
  object URL extends TopLevel[URL with Double]
  
}

