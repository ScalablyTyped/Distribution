package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSourceType extends StObject
@JSImport("jsprintmanager", "JSPM.FileSourceType")
@js.native
object FileSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSourceType & Double] = js.native
  
  @js.native
  sealed trait BLOB
    extends StObject
       with FileSourceType
  /* 2 */ val BLOB: typings.jsprintmanager.mod.JSPM.FileSourceType.BLOB & Double = js.native
  
  @js.native
  sealed trait Base64
    extends StObject
       with FileSourceType
  /* 0 */ val Base64: typings.jsprintmanager.mod.JSPM.FileSourceType.Base64 & Double = js.native
  
  @js.native
  sealed trait Text
    extends StObject
       with FileSourceType
  /* 1 */ val Text: typings.jsprintmanager.mod.JSPM.FileSourceType.Text & Double = js.native
  
  @js.native
  sealed trait URL
    extends StObject
       with FileSourceType
  /* 3 */ val URL: typings.jsprintmanager.mod.JSPM.FileSourceType.URL & Double = js.native
}
