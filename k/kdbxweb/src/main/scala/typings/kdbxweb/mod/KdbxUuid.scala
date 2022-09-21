package typings.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxUuid")
@js.native
open class KdbxUuid ()
  extends typings.kdbxweb.kdbxUuidMod.KdbxUuid {
  def this(ab: String) = this()
  def this(ab: js.typedarray.ArrayBuffer) = this()
}
/* static members */
object KdbxUuid {
  
  @JSImport("kdbxweb", "KdbxUuid")
  @js.native
  val ^ : js.Any = js.native
  
  inline def random(): typings.kdbxweb.kdbxUuidMod.KdbxUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.kdbxweb.kdbxUuidMod.KdbxUuid]
}
