package typings.kdbxweb.mod

import typings.kdbxweb.kdbxwebInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxHeader")
@js.native
open class KdbxHeader ()
  extends typings.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader
/* static members */
object KdbxHeader {
  
  @JSImport("kdbxweb", "KdbxHeader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kdbxweb", "KdbxHeader.MaxFileVersion")
  @js.native
  val MaxFileVersion: `4` = js.native
  
  inline def create(): typings.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader]
  
  inline def read(
    stm: typings.kdbxweb.distTypesUtilsBinaryStreamMod.BinaryStream,
    ctx: typings.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext
  ): typings.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(stm.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader]
}
