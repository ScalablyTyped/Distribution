package typings.kdbxweb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormatKdbxUuidMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-uuid", "KdbxUuid")
  @js.native
  open class KdbxUuid () extends StObject {
    def this(ab: String) = this()
    def this(ab: js.typedarray.ArrayBuffer) = this()
    
    def bytes: js.typedarray.ArrayBuffer = js.native
    
    val empty: Boolean = js.native
    
    def equals(): Boolean = js.native
    def equals(other: String): Boolean = js.native
    def equals(other: KdbxUuid): Boolean = js.native
    
    val id: String = js.native
    
    def toBytes(): js.typedarray.ArrayBuffer = js.native
  }
  /* static members */
  object KdbxUuid {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-uuid", "KdbxUuid")
    @js.native
    val ^ : js.Any = js.native
    
    inline def random(): KdbxUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[KdbxUuid]
  }
}
