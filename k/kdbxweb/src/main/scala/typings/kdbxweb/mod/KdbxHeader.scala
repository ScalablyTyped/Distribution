package typings.kdbxweb.mod

import typings.kdbxweb.kdbxwebInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxHeader")
@js.native
open class KdbxHeader ()
  extends typings.kdbxweb.kdbxHeaderMod.KdbxHeader
/* static members */
object KdbxHeader {
  
  @JSImport("kdbxweb", "KdbxHeader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kdbxweb", "KdbxHeader.MaxFileVersion")
  @js.native
  val MaxFileVersion: `4` = js.native
  
  inline def create(): typings.kdbxweb.kdbxHeaderMod.KdbxHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.kdbxweb.kdbxHeaderMod.KdbxHeader]
  
  inline def read(stm: typings.kdbxweb.binaryStreamMod.BinaryStream, ctx: typings.kdbxweb.kdbxContextMod.KdbxContext): typings.kdbxweb.kdbxHeaderMod.KdbxHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(stm.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.kdbxHeaderMod.KdbxHeader]
}
