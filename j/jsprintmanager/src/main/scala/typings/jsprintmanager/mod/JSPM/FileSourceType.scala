package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSourceType extends StObject
@JSImport("jsprintmanager", "JSPM.FileSourceType")
@js.native
object FileSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSourceType with Double] = js.native
  
  @js.native
  sealed trait BLOB extends FileSourceType
  /* 2 */ val BLOB: typings.jsprintmanager.mod.JSPM.FileSourceType.BLOB with Double = js.native
  
  @js.native
  sealed trait Base64 extends FileSourceType
  /* 0 */ val Base64: typings.jsprintmanager.mod.JSPM.FileSourceType.Base64 with Double = js.native
  
  @js.native
  sealed trait Text extends FileSourceType
  /* 1 */ val Text: typings.jsprintmanager.mod.JSPM.FileSourceType.Text with Double = js.native
  
  @js.native
  sealed trait URL extends FileSourceType
  /* 3 */ val URL: typings.jsprintmanager.mod.JSPM.FileSourceType.URL with Double = js.native
}
