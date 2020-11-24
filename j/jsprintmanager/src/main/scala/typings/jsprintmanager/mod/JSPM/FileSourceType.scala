package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSourceType extends js.Object
@JSImport("jsprintmanager", "JSPM.FileSourceType")
@js.native
object FileSourceType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSourceType with Double] = js.native
  
  @js.native
  sealed trait BLOB extends FileSourceType
  /* 2 */ @js.native
  object BLOB extends TopLevel[BLOB with Double]
  
  @js.native
  sealed trait Base64 extends FileSourceType
  /* 0 */ @js.native
  object Base64 extends TopLevel[Base64 with Double]
  
  @js.native
  sealed trait Text extends FileSourceType
  /* 1 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  @js.native
  sealed trait URL extends FileSourceType
  /* 3 */ @js.native
  object URL extends TopLevel[URL with Double]
}
